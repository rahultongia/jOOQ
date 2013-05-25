/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsignedRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TUnsignedRecord> implements org.jooq.Record4<java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigInteger>, org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITUnsigned {

	private static final long serialVersionUID = -875481635;

	/**
	 * Setter for <code>TEST.T_UNSIGNED.U_BYTE</code>. 
	 */
	@Override
	public void setUByte(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_UNSIGNED.U_BYTE</code>. 
	 */
	@Override
	public java.lang.Short getUByte() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_UNSIGNED.U_SHORT</code>. 
	 */
	@Override
	public void setUShort(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_UNSIGNED.U_SHORT</code>. 
	 */
	@Override
	public java.lang.Integer getUShort() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_UNSIGNED.U_INT</code>. 
	 */
	@Override
	public void setUInt(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_UNSIGNED.U_INT</code>. 
	 */
	@Override
	public java.lang.Long getUInt() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_UNSIGNED.U_LONG</code>. 
	 */
	@Override
	public void setULong(java.math.BigInteger value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_UNSIGNED.U_LONG</code>. 
	 */
	@Override
	public java.math.BigInteger getULong() {
		return (java.math.BigInteger) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigInteger> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigInteger> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.TUnsigned.U_BYTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.TUnsigned.U_SHORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.TUnsigned.U_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field4() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.TUnsigned.U_LONG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getUByte();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getUShort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getUInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value4() {
		return getULong();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITUnsigned from) {
		setUByte(from.getUByte());
		setUShort(from.getUShort());
		setUInt(from.getUInt());
		setULong(from.getULong());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITUnsigned> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TUnsignedRecord
	 */
	public TUnsignedRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TUnsigned.T_UNSIGNED);
	}
}
