package com.rahma.AvEchelon.Entity;
// Generated Jun 13, 2024, 2:26:21 AM by Hibernate Tools 5.6.7.Final

/**
 * PmaSavedsearches generated by hbm2java
 */
public class PmaSavedsearches implements java.io.Serializable {

	private Integer id;
	private String username;
	private String dbName;
	private String searchName;
	private String searchData;

	public PmaSavedsearches() {
	}

	public PmaSavedsearches(String username, String dbName, String searchName, String searchData) {
		this.username = username;
		this.dbName = dbName;
		this.searchName = searchName;
		this.searchData = searchData;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getSearchName() {
		return this.searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	public String getSearchData() {
		return this.searchData;
	}

	public void setSearchData(String searchData) {
		this.searchData = searchData;
	}

}
