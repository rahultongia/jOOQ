/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dr$iBookTitleContext$rRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.Dr$iBookTitleContext$rRecord> implements org.jooq.Record2<java.lang.Short, byte[]>, org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$r {

	private static final long serialVersionUID = -634532266;

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$R.ROW_NO</code>. 
	 */
	@Override
	public void setRowNo(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$R.ROW_NO</code>. 
	 */
	@Override
	public java.lang.Short getRowNo() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$R.DATA</code>. 
	 */
	@Override
	public void setData(byte[] value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$R.DATA</code>. 
	 */
	@Override
	public byte[] getData() {
		return (byte[]) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Short, byte[]> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Short, byte[]> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$r.ROW_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$r.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getRowNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value2() {
		return getData();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$r from) {
		setRowNo(from.getRowNo());
		setData(from.getData());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$r> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached Dr$iBookTitleContext$rRecord
	 */
	public Dr$iBookTitleContext$rRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$r.DR$I_BOOK_TITLE_CONTEXT$R);
	}
}
