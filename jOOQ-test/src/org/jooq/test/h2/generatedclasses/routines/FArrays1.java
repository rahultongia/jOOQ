/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class FArrays1 extends org.jooq.impl.AbstractRoutine<java.lang.Object[]> {

	private static final long serialVersionUID = 837961823;


	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object[]> RETURN_VALUE = new org.jooq.impl.ParameterImpl<java.lang.Object[]>("RETURN_VALUE", org.jooq.impl.SQLDataType.OTHER.getArrayDataType());

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object[]> P1 = new org.jooq.impl.ParameterImpl<java.lang.Object[]>("P1", org.jooq.impl.SQLDataType.OTHER.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public FArrays1() {
		super(org.jooq.SQLDialect.H2, "F_ARRAYS1", org.jooq.test.h2.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.OTHER.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(P1);
	}

	/**
	 * Set the <code>P1</code> parameter to the routine
	 */
	public void setP1(java.lang.Object[] value) {
		setValue(P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP1(org.jooq.Field<java.lang.Object[]> field) {
		setField(P1, field);
	}
}
