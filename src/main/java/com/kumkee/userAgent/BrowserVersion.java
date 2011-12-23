package com.kumkee.userAgent;

import java.util.regex.Pattern;

public class BrowserVersion {
	public static final Pattern SafariPattern = Pattern.compile("version\\/([\\d\\w\\.\\-]+)", Pattern.CASE_INSENSITIVE);  
	public static final Pattern ChromePattern = Pattern.compile("chrome\\/([\\d\\w\\.\\-]+)", Pattern.CASE_INSENSITIVE); 
	public static final Pattern PS3Pattern = Pattern.compile("([\\d\\w\\.\\-]+)\\)\\s*$", Pattern.CASE_INSENSITIVE); 
	public static final Pattern PSPPattern = Pattern.compile("([\\d\\w\\.\\-]+)\\)?\\s*$", Pattern.CASE_INSENSITIVE); 
	public static final Pattern LotusPattern = Pattern.compile("Lotus-Notes\\/([\\w.]+)", Pattern.CASE_INSENSITIVE); 
	public static final Pattern GabblePattern = Pattern.compile("Gabble\\/([\\d\\w\\.\\-]+)", Pattern.CASE_INSENSITIVE); 
	public static final Pattern YammerDesktopPattern = Pattern.compile("([\\d\\w\\.\\-]+)\\/Yammer", Pattern.CASE_INSENSITIVE); 
	public static final Pattern ApacheDesktopClientPattern = Pattern.compile("Apache\\-HttpClient\\/([\\d\\w\\.\\-]+)", Pattern.CASE_INSENSITIVE);  
	public static final Pattern YammerMobilePattern = Pattern.compile("Yammer[\\s]+([\\d\\w\\.\\-]+)", Pattern.CASE_INSENSITIVE); 
	public static final Pattern BlackberryPattern = Pattern.compile("BlackBerry[\\d]+\\/([\\d\\w\\.\\-]+)", Pattern.CASE_INSENSITIVE); 
	
	public static final String Other = "[\\/]([\\d\\w\\.\\-]+)"; // this.name()+"[\\/]([\\d\\w\\.\\-]+)"
}
