package com.kumkee.userAgent;

import java.util.regex.Pattern;

public class Browser {
	public static final Pattern SafariPattern = Pattern.compile("safari", Pattern.CASE_INSENSITIVE); 
	public static final Pattern OperaPattern = Pattern.compile("opera", Pattern.CASE_INSENSITIVE);
	public static final Pattern ChromePattern = Pattern.compile("chrome", Pattern.CASE_INSENSITIVE); 
	public static final Pattern KonquerorPattern = Pattern.compile("konqueror", Pattern.CASE_INSENSITIVE);
	public static final Pattern PS3Pattern = Pattern.compile("playstation 3", Pattern.CASE_INSENSITIVE);
	public static final Pattern PSPPattern = Pattern.compile("playstation portable", Pattern.CASE_INSENSITIVE);
	public static final Pattern FirefoxPattern = Pattern.compile("firefox", Pattern.CASE_INSENSITIVE); 
	public static final Pattern LotusPattern = Pattern.compile("lotus.notes", Pattern.CASE_INSENSITIVE); 
	public static final Pattern ThumderbirdPattern = Pattern.compile("thunderbird", Pattern.CASE_INSENSITIVE); 
	public static final Pattern NetscapePattern = Pattern.compile("netscape", Pattern.CASE_INSENSITIVE); 
	public static final Pattern SeamonkeyPattern = Pattern.compile("seamonkey", Pattern.CASE_INSENSITIVE); 
	public static final Pattern OutlookPattern = Pattern.compile("microsoft.outlook", Pattern.CASE_INSENSITIVE); 
	public static final Pattern EvolutionPattern = Pattern.compile("evolution", Pattern.CASE_INSENSITIVE);
	public static final Pattern MSIEMobilePattern = Pattern.compile("emobile|windows phone", Pattern.CASE_INSENSITIVE); 
	public static final Pattern GabblePattern = Pattern.compile("Gabble", Pattern.CASE_INSENSITIVE); 
	public static final Pattern YammerDesktopPattern = Pattern.compile("AdobeAir", Pattern.CASE_INSENSITIVE);
	public static final Pattern ApacheHTTPClientPattern = Pattern.compile("Apache\\-HttpClient", Pattern.CASE_INSENSITIVE); 
	public static final Pattern YammerMobilePattern = Pattern.compile("Yammer[\\s]+([\\d\\w\\.\\-]+)", Pattern.CASE_INSENSITIVE);
	public static final Pattern BlackberryPattern = Pattern.compile("BlackBerry", Pattern.CASE_INSENSITIVE);
	public static final Pattern MSIEPattern = Pattern.compile("msie", Pattern.CASE_INSENSITIVE);
	
	public static final String Konqueror = "Konqueror";
	public static final String Chrome = "Chrome";
	public static final String Safari = "Safari";
	public static final String Opera = "Opera";
	public static final String PS3 = "PS3";
	public static final String PSP = "PSP";
	public static final String Firefox = "Firefox";
	public static final String Lotus = "Lotus";
	public static final String Netscape = "Netscape";
	public static final String Seamonkey = "Seamonkey";
	public static final String Thunderbird = "Thumderbird";
	public static final String Outlook = "Outlook";
	public static final String Evolution = "Evolution";
	public static final String MSIEMobile = "IE Mobile";
	public static final String MSIE = "MSIE";
	public static final String Blackberry = "Blackberry";
	public static final String Gabble = "Gabble";
	public static final String YammerDesktop = "Yammer Desktop";
	public static final String YammerMobile = "Yammer Mobile";
	public static final String ApacheHTTPClient = "Apache HTTP Client";
	public static final String Unknown = "Unknown";
}

