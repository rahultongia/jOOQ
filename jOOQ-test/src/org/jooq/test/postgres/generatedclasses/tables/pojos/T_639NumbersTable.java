/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_639NumbersTable implements org.jooq.test.postgres.generatedclasses.tables.interfaces.IT_639NumbersTable {

	private static final long serialVersionUID = -1686571343;

	private final java.lang.Integer    id;
	private final java.lang.Short      short_;
	private final java.lang.Integer    integer;
	private final java.lang.Long       long_;
	private final java.lang.Byte       byteDecimal;
	private final java.lang.Short      shortDecimal;
	private final java.lang.Integer    integerDecimal;
	private final java.lang.Long       longDecimal;
	private final java.math.BigInteger bigInteger;
	private final java.math.BigDecimal bigDecimal;
	private final java.lang.Float      float_;
	private final java.lang.Double     double_;

	public T_639NumbersTable(
		java.lang.Integer    id,
		java.lang.Short      short_,
		java.lang.Integer    integer,
		java.lang.Long       long_,
		java.lang.Byte       byteDecimal,
		java.lang.Short      shortDecimal,
		java.lang.Integer    integerDecimal,
		java.lang.Long       longDecimal,
		java.math.BigInteger bigInteger,
		java.math.BigDecimal bigDecimal,
		java.lang.Float      float_,
		java.lang.Double     double_
	) {
		this.id = id;
		this.short_ = short_;
		this.integer = integer;
		this.long_ = long_;
		this.byteDecimal = byteDecimal;
		this.shortDecimal = shortDecimal;
		this.integerDecimal = integerDecimal;
		this.longDecimal = longDecimal;
		this.bigInteger = bigInteger;
		this.bigDecimal = bigDecimal;
		this.float_ = float_;
		this.double_ = double_;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public java.lang.Short getShort() {
		return this.short_;
	}

	@Override
	public java.lang.Integer getInteger() {
		return this.integer;
	}

	@Override
	public java.lang.Long getLong() {
		return this.long_;
	}

	@Override
	public java.lang.Byte getByteDecimal() {
		return this.byteDecimal;
	}

	@Override
	public java.lang.Short getShortDecimal() {
		return this.shortDecimal;
	}

	@Override
	public java.lang.Integer getIntegerDecimal() {
		return this.integerDecimal;
	}

	@Override
	public java.lang.Long getLongDecimal() {
		return this.longDecimal;
	}

	@Override
	public java.math.BigInteger getBigInteger() {
		return this.bigInteger;
	}

	@Override
	public java.math.BigDecimal getBigDecimal() {
		return this.bigDecimal;
	}

	@Override
	public java.lang.Float getFloat() {
		return this.float_;
	}

	@Override
	public java.lang.Double getDouble() {
		return this.double_;
	}
}
