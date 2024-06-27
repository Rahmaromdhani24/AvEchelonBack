package com.rahma.AvEchelon.Entity;
// Generated Jun 13, 2024, 2:26:21 AM by Hibernate Tools 5.6.7.Final

/**
 * PmaCentralColumnsId generated by hbm2java
 */
public class PmaCentralColumnsId implements java.io.Serializable {

	private String dbName;
	private String colName;

	public PmaCentralColumnsId() {
	}

	public PmaCentralColumnsId(String dbName, String colName) {
		this.dbName = dbName;
		this.colName = colName;
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getColName() {
		return this.colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PmaCentralColumnsId))
			return false;
		PmaCentralColumnsId castOther = (PmaCentralColumnsId) other;

		return ((this.getDbName() == castOther.getDbName()) || (this.getDbName() != null
				&& castOther.getDbName() != null && this.getDbName().equals(castOther.getDbName())))
				&& ((this.getColName() == castOther.getColName()) || (this.getColName() != null
						&& castOther.getColName() != null && this.getColName().equals(castOther.getColName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDbName() == null ? 0 : this.getDbName().hashCode());
		result = 37 * result + (getColName() == null ? 0 : this.getColName().hashCode());
		return result;
	}

}