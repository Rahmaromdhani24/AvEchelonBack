package com.rahma.AvEchelon.Entity;
// Generated Jun 13, 2024, 2:26:21 AM by Hibernate Tools 5.6.7.Final

/**
 * PmaRecent generated by hbm2java
 */
public class PmaRecent implements java.io.Serializable {

	private String username;
	private String tables;

	public PmaRecent() {
	}

	public PmaRecent(String username, String tables) {
		this.username = username;
		this.tables = tables;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTables() {
		return this.tables;
	}

	public void setTables(String tables) {
		this.tables = tables;
	}

}