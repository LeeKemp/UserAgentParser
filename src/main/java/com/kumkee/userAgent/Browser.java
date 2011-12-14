package com.kumkee.userAgent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Browser {
	SAFARI("safari","version\\/([\\d\\w\\.\\-]+)"), 
	IE("msie"), 
	OPERA("opera"), 
	CHROME("chrome","chrome\\/([\\d\\w\\.\\-]+)"), 
	KONQUEROR("konqueror"), 
	PS3("playstation 3","([\\d\\w\\.\\-]+)\\)\\s*$"),
	PSP("playstation portable", "([\\d\\w\\.\\-]+)\\)?\\s*$"),
	FIREFOX("firefox"), 
	LOTUS("lotus.notes","Lotus-Notes\\/([\\w.]+)"), 
	THUNDERBIRD("thunderbird"), 
	NETSCAPE("netscape"), 
	SEAMONKEY("seamonkey"), 
	OUTLOOK("microsoft.outlook"), 
	EVOLUTION("evolution"), 
	IE_MOBILE("emobile|windows phone"), 
	GABBLE("Gabble","Gabble\\/([\\d\\w\\.\\-]+)"), 
	YAMMER_DESKTOP("AdobeAir","([\\d\\w\\.\\-]+)\\/Yammer"), 
	APACHE_HTTP_CLIENT("Apache\\-HttpClient","Apache\\-HttpClient\\/([\\d\\w\\.\\-]+)"), 
	YAMMER_MOBILE("Yammer[\\s]+([\\d\\w\\.\\-]+)","Yammer[\\s]+([\\d\\w\\.\\-]+)"), 
	BLACKBERRY("BlackBerry","BlackBerry[\\d]+\\/([\\d\\w\\.\\-]+)"),
	MSIE("msie"),
	UNKNOWN(null)
	;
	
	private Pattern browserBrowserRegExp;
	private Pattern versionNumberRegExp; 
	
	private Browser(String browserNameRegExpStr) {
		browserBrowserRegExp = browserNameRegExpStr != null? Pattern.compile(browserNameRegExpStr, Pattern.CASE_INSENSITIVE) : null;
		versionNumberRegExp = Pattern.compile(this.name()+"[\\/]([\\d\\w\\.\\-]+)",Pattern.CASE_INSENSITIVE); // Default version number RegExp
	}
	
	private Browser(String browserNameRegExpStr, String versionNumberRegExpStr) {
		browserBrowserRegExp = browserNameRegExpStr != null? Pattern.compile(browserNameRegExpStr, Pattern.CASE_INSENSITIVE) : null;
		versionNumberRegExp = versionNumberRegExpStr != null? Pattern.compile(versionNumberRegExpStr, Pattern.CASE_INSENSITIVE) : null;
	}

	public boolean matches(String userAgentString)
	{
		Matcher m = browserBrowserRegExp.matcher(userAgentString);
		return m.find();
	}
	
	public String getVersion(String userAgentString)
	{
		Matcher m = versionNumberRegExp.matcher(userAgentString);
		return m.find() ? m.group(1) : null;
	}
	
}
