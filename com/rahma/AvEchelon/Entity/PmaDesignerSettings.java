package com.rahma.AvEchelon.Entity;
// Generated Jun 13, 2024, 2:26:21 AM by Hibernate Tools 5.6.7.Final

/**
 * PmaDesignerSettings generated by hbm2java
 */
public class PmaDesignerSettings implements java.io.Serializable {

	private String username;
	private String settingsData;

	public PmaDesignerSettings() {
	}

	public PmaDesignerSettings(String username, String settingsData) {
		this.username = username;
		this.settingsData = settingsData;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSettingsData() {
		return this.settingsData;
	}

	public void setSettingsData(String settingsData) {
		this.settingsData = settingsData;
	}

}