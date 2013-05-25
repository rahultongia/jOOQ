/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TArrays extends org.jooq.impl.TableImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord> {

	private static final long serialVersionUID = 590221897;

	/**
	 * The singleton instance of <code>TEST.T_ARRAYS</code>
	 */
	public static final org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays T_ARRAYS = new org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord> getRecordType() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord.class;
	}

	/**
	 * The column <code>TEST.T_ARRAYS.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_ARRAYS);

	/**
	 * The column <code>TEST.T_ARRAYS.STRING_ARRAY</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord, java.lang.Object> STRING_ARRAY = createField("STRING_ARRAY", org.jooq.impl.SQLDataType.OTHER, T_ARRAYS);

	/**
	 * The column <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord, java.lang.Object> NUMBER_ARRAY = createField("NUMBER_ARRAY", org.jooq.impl.SQLDataType.OTHER, T_ARRAYS);

	/**
	 * The column <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord, java.lang.Object> NUMBER_LONG_ARRAY = createField("NUMBER_LONG_ARRAY", org.jooq.impl.SQLDataType.OTHER, T_ARRAYS);

	/**
	 * The column <code>TEST.T_ARRAYS.DATE_ARRAY</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord, java.lang.Object> DATE_ARRAY = createField("DATE_ARRAY", org.jooq.impl.SQLDataType.OTHER, T_ARRAYS);

	/**
	 * No further instances allowed
	 */
	private TArrays() {
		super("T_ARRAYS", org.jooq.test.jdbcoracle.generatedclasses.test.Test.TEST);
	}
}
