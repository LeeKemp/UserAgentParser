package com.kumkee.userAgent;

public class UserAgent {

	private boolean mobile; // false
	private Browser browser; // Firefox
	private Platform platform; // Windows
	private String os; // Windows 7
	private Engine engine; 
	private String version; // 5 
	private String engineVersion;
	
	public boolean isMobile() {
		return mobile;
	}
	public Platform getPlatform() {
		return platform;
	}
	public String getOs() {
		return os;
	}
	public Engine getEngine() {
		return engine;
	}
	public String getVersion() {
		return version;
	}
	public String getEngineVersion() {
		return engineVersion;
	}
	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}
	public Browser getBrowser() {
		return browser;
	}
	public void setBrowser(Browser browser) {
		this.browser = browser;
	}

}
