/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dr$iBookTitleContext$i implements org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$i {

	private static final long serialVersionUID = -2131960915;

	private java.lang.String tokenText;
	private java.lang.Long   tokenType;
	private java.lang.Long   tokenFirst;
	private java.lang.Long   tokenLast;
	private java.lang.Long   tokenCount;
	private byte[]           tokenInfo;

	@Override
	public java.lang.String getTokenText() {
		return this.tokenText;
	}

	@Override
	public void setTokenText(java.lang.String tokenText) {
		this.tokenText = tokenText;
	}

	@Override
	public java.lang.Long getTokenType() {
		return this.tokenType;
	}

	@Override
	public void setTokenType(java.lang.Long tokenType) {
		this.tokenType = tokenType;
	}

	@Override
	public java.lang.Long getTokenFirst() {
		return this.tokenFirst;
	}

	@Override
	public void setTokenFirst(java.lang.Long tokenFirst) {
		this.tokenFirst = tokenFirst;
	}

	@Override
	public java.lang.Long getTokenLast() {
		return this.tokenLast;
	}

	@Override
	public void setTokenLast(java.lang.Long tokenLast) {
		this.tokenLast = tokenLast;
	}

	@Override
	public java.lang.Long getTokenCount() {
		return this.tokenCount;
	}

	@Override
	public void setTokenCount(java.lang.Long tokenCount) {
		this.tokenCount = tokenCount;
	}

	@Override
	public byte[] getTokenInfo() {
		return this.tokenInfo;
	}

	@Override
	public void setTokenInfo(byte[] tokenInfo) {
		this.tokenInfo = tokenInfo;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$i from) {
		setTokenText(from.getTokenText());
		setTokenType(from.getTokenType());
		setTokenFirst(from.getTokenFirst());
		setTokenLast(from.getTokenLast());
		setTokenCount(from.getTokenCount());
		setTokenInfo(from.getTokenInfo());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$i> E into(E into) {
		into.from(this);
		return into;
	}
}
