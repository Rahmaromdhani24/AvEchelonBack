package com.rahma.AvEchelon.Entity;
// Generated Jun 13, 2024, 2:26:21 AM by Hibernate Tools 5.6.7.Final

/**
 * PmaCentralColumns generated by hbm2java
 */
public class PmaCentralColumns implements java.io.Serializable {

	private PmaCentralColumnsId id;
	private String colType;
	private String colLength;
	private String colCollation;
	private boolean colIsNull;
	private String colExtra;
	private String colDefault;

	public PmaCentralColumns() {
	}

	public PmaCentralColumns(PmaCentralColumnsId id, String colType, String colCollation, boolean colIsNull) {
		this.id = id;
		this.colType = colType;
		this.colCollation = colCollation;
		this.colIsNull = colIsNull;
	}

	public PmaCentralColumns(PmaCentralColumnsId id, String colType, String colLength, String colCollation,
			boolean colIsNull, String colExtra, String colDefault) {
		this.id = id;
		this.colType = colType;
		this.colLength = colLength;
		this.colCollation = colCollation;
		this.colIsNull = colIsNull;
		this.colExtra = colExtra;
		this.colDefault = colDefault;
	}

	public PmaCentralColumnsId getId() {
		return this.id;
	}

	public void setId(PmaCentralColumnsId id) {
		this.id = id;
	}

	public String getColType() {
		return this.colType;
	}

	public void setColType(String colType) {
		this.colType = colType;
	}

	public String getColLength() {
		return this.colLength;
	}

	public void setColLength(String colLength) {
		this.colLength = colLength;
	}

	public String getColCollation() {
		return this.colCollation;
	}

	public void setColCollation(String colCollation) {
		this.colCollation = colCollation;
	}

	public boolean isColIsNull() {
		return this.colIsNull;
	}

	public void setColIsNull(boolean colIsNull) {
		this.colIsNull = colIsNull;
	}

	public String getColExtra() {
		return this.colExtra;
	}

	public void setColExtra(String colExtra) {
		this.colExtra = colExtra;
	}

	public String getColDefault() {
		return this.colDefault;
	}

	public void setColDefault(String colDefault) {
		this.colDefault = colDefault;
	}

}