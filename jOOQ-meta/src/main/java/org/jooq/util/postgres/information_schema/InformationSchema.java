/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class InformationSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1978160307;

	/**
	 * The singleton instance of information_schema
	 */
	public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

	/**
	 * No further instances allowed
	 */
	private InformationSchema() {
		super("information_schema");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.postgres.information_schema.tables.Attributes.ATTRIBUTES,
			org.jooq.util.postgres.information_schema.tables.Columns.COLUMNS,
			org.jooq.util.postgres.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE,
			org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE,
			org.jooq.util.postgres.information_schema.tables.Parameters.PARAMETERS,
			org.jooq.util.postgres.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
			org.jooq.util.postgres.information_schema.tables.Routines.ROUTINES,
			org.jooq.util.postgres.information_schema.tables.Sequences.SEQUENCES,
			org.jooq.util.postgres.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS,
			org.jooq.util.postgres.information_schema.tables.Tables.TABLES);
	}
}
