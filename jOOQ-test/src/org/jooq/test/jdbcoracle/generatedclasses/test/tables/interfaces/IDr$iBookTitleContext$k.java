/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IDr$iBookTitleContext$k extends java.io.Serializable {

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$K.DOCID</code>. 
	 */
	public void setDocid(java.math.BigInteger value);

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$K.DOCID</code>. 
	 */
	public java.math.BigInteger getDocid();

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$K.TEXTKEY</code>. 
	 */
	public void setTextkey(java.lang.Object value);

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$K.TEXTKEY</code>. 
	 */
	public java.lang.Object getTextkey();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IDr$iBookTitleContext$k
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$k from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IDr$iBookTitleContext$k
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$k> E into(E into);
}
