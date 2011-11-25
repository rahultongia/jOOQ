
<?php 
// The following content has been XSL transformed from manual.xml using html-pages.xsl
// Please do not edit this content manually
require '../../../frame.php';
function printH1() {
    print "UNION and other set operations";
}
function getActiveMenu() {
	return "manual";
}
function getSlogan() {
	return "Unions, differences and intersections are vital set operations taken from set theory.";
}
function printContent() {
    global $root;
?>
<table cellpadding="0" cellspacing="0" border="0" width="100%">
<tr>
<td align="left" valign="top"><a href="<?=$root?>/manual/">The jOOQ User Manual</a> : <a href="<?=$root?>/manual/DSL/">DSL or fluent API. Where SQL meets Java</a> : <a href="<?=$root?>/manual/DSL/UNION/">UNION and other set operations</a></td><td align="right" valign="top" style="white-space: nowrap"><a href="<?=$root?>/manual/DSL/NESTED/" title="Previous section: Other types of nested SELECT">previous</a> : <a href="<?=$root?>/manual/DSL/FUNCTIONS/" title="Next section: Functions and aggregate operators">next</a></td>
</tr>
</table>
							<h2>jOOQ's set operation API</h2>
							<p>The 
								<a href="https://github.com/lukaseder/jOOQ/blob/master/jOOQ/src/main/java/org/jooq/Select.java" title="Internal API reference: org.jooq.Select">org.jooq.Select</a> API directly supports the UNION 
								syntax for all types of Select as discussed in the manual's section about 
								<a href="<?=$root?>/manual/JOOQ/Query/" title="jOOQ Manual reference: The Query and its various subtypes">Queries and Query subtypes</a>. 
								It consists of these methods: </p>
								
							<pre class="prettyprint lang-java">
public interface Select&lt;R extends Record&gt; {
    Select&lt;R&gt; union(Select&lt;R&gt; select);
    Select&lt;R&gt; unionAll(Select&lt;R&gt; select);
    Select&lt;R&gt; except(Select&lt;R&gt; select);
    Select&lt;R&gt; intersect(Select&lt;R&gt; select);
}</pre>

							<p>Hence, this is how you can write a simple UNION with jOOQ:</p>
							<table width="100%" cellpadding="0" cellspacing="0">
<tr>
<td width="50%" class="left">
<pre class="prettyprint lang-sql">
SELECT TITLE 
  FROM T_BOOK 
 WHERE PUBLISHED_IN &gt; 1945
UNION
SELECT TITLE 
  FROM T_BOOK 
 WHERE AUTHOR_ID = 1</pre>
</td><td width="50%" class="right">
<pre class="prettyprint lang-java">
create.select(TBook.TITLE)
      .from(T_BOOK)
      .where(TBook.PUBLISHED_IN.greaterThan(1945))
      .union(
create.select(TBook.TITLE)
      .from(T_BOOK)
      .where(TBook.AUTHOR_ID.equal(1)));</pre>
</td>
</tr>
</table>
							
							<h2>Nested UNIONs</h2>
							<p>In some SQL dialects, you can arbitrarily nest UNIONs to several
								levels. Be aware, though, that SQLite, Derby and MySQL have serious
								syntax limitations. jOOQ tries to render correct UNION SQL statements,
								but unfortunately, you can create situations that will cause syntax
								errors in the aforementioned dialects. </p>
								
							<p>An example of advanced UNION usage is the following statement in jOOQ: </p>
							<pre class="prettyprint lang-java">
// Create a UNION of several types of books
Select&lt;?&gt; union = 
    create.select(TBook.TITLE, TBook.AUTHOR_ID).from(T_BOOK).where(TBook.PUBLISHED_IN.greaterThan(1945)).union(
    create.select(TBook.TITLE, TBook.AUTHOR_ID).from(T_BOOK).where(TBook.AUTHOR_ID.equal(1)));

// Now, re-use the above UNION and order it by author
create.select(union.getField(TBook.TITLE))
      .from(union)
      .orderBy(union.getField(TBook.AUTHOR_ID).descending());</pre>

							<p>This example does not seem surprising, when you have read the
								previous chapters about 
								<a href="<?=$root?>/manual/DSL/NESTED/" title="jOOQ Manual reference: Other types of nested SELECT">nested SELECT statements</a>. 
								But when you check
								out the rendered SQL: </p>
								
							<pre class="prettyprint lang-sql">
-- alias_38173 is an example of a generated alias, 
-- generated by jOOQ for union queries
SELECT alias_38173.TITLE FROM (
  SELECT T_BOOK.TITLE, T_BOOK.AUTHOR_ID FROM T_BOOK WHERE T_BOOK.PUBLISHED_IN &gt; 1945
  UNION
  SELECT T_BOOK.TITLE, T_BOOK.AUTHOR_ID FROM T_BOOK WHERE T_BOOK.AUTHOR_ID = 1
) alias_38173
ORDER BY alias_38173.AUTHOR_ID DESC</pre>

							<p>You can see that jOOQ takes care of many syntax pitfalls, when
								you're not used to the various dialects' unique requirements. The
								above automatic aliasing was added in order to be compliant with
								MySQL's requirements about aliasing nested selects. </p>
								
							<h2>Several UNIONs</h2>
							<p>It is no problem either for you to create SQL statements with several unions. Just write: </p>
							<pre class="prettyprint lang-java">
Select&lt;?&gt; part1;
Select&lt;?&gt; part2;
Select&lt;?&gt; part3;
Select&lt;?&gt; part4;

// [...]

part1.union(part2).union(part3).union(part4);</pre>

							<h2>UNION and the ORDER BY clause</h2>
							<p>
								Strictly speaking, in SQL, you cannot order a subselect that is part
								of a UNION operation. You can only order the whole set. In set theory,
								or relational algebra, it wouldn't make sense to order subselects
								anyway, as a set operation cannot guarantee order correctness. Often,
								you still want to do it, because you apply a LIMIT to every subselect.
								Let's say, you want to find the employees with the highest salary in
								every department in Postgres syntax:
							</p>
							<table width="100%" cellpadding="0" cellspacing="0">
<tr>
<td width="50%" class="left">
<pre class="prettyprint lang-sql">
SELECT * FROM (
  SELECT * FROM emp WHERE dept = 'IT' 
  ORDER BY salary LIMIT 1
) UNION (
  SELECT * FROM emp WHERE dept = 'Marketing'
  ORDER BY salary LIMIT 1
) UNION (
  SELECT * FROM emp WHERE dept = 'R&amp;D'
  ORDER BY salary LIMIT 1
)</pre>
</td><td width="50%" class="right">
<pre class="prettyprint lang-java">
create.selectFrom(EMP).where(DEPT.equal("IT"))
      .orderBy(SALARY).limit(1)
      .union(
create.selectFrom(EMP).where(DEPT.equal("Marketing"))
      .orderBy(SALARY).limit(1))
      .union(
create.selectFrom(EMP).where(DEPT.equal("R&amp;D")
      .orderBy(SALARY).limit(1)))
      
      
</pre>
</td>
</tr>
</table>
							
							<p>There is a subtle difference between the above two queries. 
								In SQL, every UNION subselect is in fact a 
							<a href="<?=$root?>/manual/DSL/NESTED/" title="jOOQ Manual reference: Other types of nested SELECT">nested SELECT</a>, wrapped in parentheses.
							In this example, the notion of "nested SELECT" and "subselect" are slightly
							different.</p>
						<br><table cellpadding="0" cellspacing="0" border="0" width="100%">
<tr>
<td align="left" valign="top"><a href="<?=$root?>/manual/">The jOOQ User Manual</a> : <a href="<?=$root?>/manual/DSL/">DSL or fluent API. Where SQL meets Java</a> : <a href="<?=$root?>/manual/DSL/UNION/">UNION and other set operations</a></td><td align="right" valign="top" style="white-space: nowrap"><a href="<?=$root?>/manual/DSL/NESTED/" title="Previous section: Other types of nested SELECT">previous</a> : <a href="<?=$root?>/manual/DSL/FUNCTIONS/" title="Next section: Functions and aggregate operators">next</a></td>
</tr>
</table>
<?php 
}
?>

