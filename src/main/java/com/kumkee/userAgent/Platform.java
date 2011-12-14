package com.kumkee.userAgent;

import java.util.regex.Pattern;

public enum Platform {
	WINDOWS("windows", false), 
	MAC("(macintosh|darwin)",false), 
	IPAD("ipad",true), 
	IPHONE("iphone",true), 
	ANDROID("android",true),
	LINUX("linux",false), 
	WII("wii",false), 
	PLAYSTATION("playstation",false), 
	UNKNOWN(null,false), 
	WINDOWS_PHONE("windows (ce|phone|mobile)( os)?",true), 
	SYMBIAN("symbian(os)?",true), 
	BLACKBERRY("blackberry",true), 
	JAVA("java",false), 
	IPOD("ipod",true);
	
	private Pattern platformRegExp;
	private boolean mobile;
	
	private Platform(String browserNameRegExpStr, boolean mobile) {
		platformRegExp = browserNameRegExpStr != null? Pattern.compile(browserNameRegExpStr, Pattern.CASE_INSENSITIVE) : null;
		this.mobile = mobile;
	}

	
}
