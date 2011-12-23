package com.kumkee.userAgent;

import java.util.regex.Pattern;

public class Engine {
	public static final Pattern WebkitPattern = Pattern.compile("webkit", Pattern.CASE_INSENSITIVE);
	public static final Pattern MSIEPattern = Pattern.compile("msie", Pattern.CASE_INSENSITIVE);
	public static final Pattern PrestoPattern = Pattern.compile("presto", Pattern.CASE_INSENSITIVE);
	public static final Pattern GeckoPattern = Pattern.compile("gecko", Pattern.CASE_INSENSITIVE);
	public static final Pattern KHTMLPattern = Pattern.compile("khtml", Pattern.CASE_INSENSITIVE);
	public static final Pattern KonquerorPattern = Pattern.compile("konqueror", Pattern.CASE_INSENSITIVE);
	public static final Pattern MIDPPattern = Pattern.compile("MIDP", Pattern.CASE_INSENSITIVE);
	public static final Pattern ChromePattern = Pattern.compile("chrome", Pattern.CASE_INSENSITIVE);
	public static final Pattern OperaPattern = Pattern.compile("opera", Pattern.CASE_INSENSITIVE);
	
	public static final String Webkit = "Webkit";
	public static final String KHTML = "KHTML";
	public static final String Konqeror = "Konqeror";
	public static final String Chrome = "Chrome";
	public static final String Presto = "Presto";
	public static final String Gecko = "Gecko";
	public static final String MSIE = "MSIE";
	public static final String MIDP = "MIDP";	
	public static final String Unknown = "Unknown";
	
}
