/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class T_785Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = -219409922;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.T_785.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.T_785.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.T_785.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.T_785.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setValue(java.lang.String value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.T_785.VALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getValue() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.T_785.VALUE);
	}

	/**
	 * Create a detached T_785Record
	 */
	public T_785Record() {
		super(org.jooq.test.ingres.generatedclasses.tables.T_785.T_785);
	}

	/**
	 * Create an attached T_785Record
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public T_785Record(org.jooq.Configuration configuration) {
		super(org.jooq.test.ingres.generatedclasses.tables.T_785.T_785, configuration);
	}
}
