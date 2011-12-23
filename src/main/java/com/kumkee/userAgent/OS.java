package com.kumkee.userAgent;

import java.util.regex.Pattern;

public class OS
{
	public static final Pattern WindowsVistaPattern  = Pattern.compile("windows nt 6\\.0", Pattern.CASE_INSENSITIVE);
	public static final Pattern Windows7Pattern  = Pattern.compile("windows nt 6\\.\\d+", Pattern.CASE_INSENSITIVE);
	public static final Pattern Windows2003Pattern  = Pattern.compile("windows nt 5\\.2", Pattern.CASE_INSENSITIVE);
	public static final Pattern WindowsXPPattern  = Pattern.compile("windows nt 5\\.1", Pattern.CASE_INSENSITIVE);
	public static final Pattern Windows2000Pattern  = Pattern.compile("windows nt 5\\.0", Pattern.CASE_INSENSITIVE);
	public static final Pattern WindowsPhonePattern  = Pattern.compile("windows (ce|phone|mobile)( os)?", Pattern.CASE_INSENSITIVE);
	public static final Pattern WindowsPattern  = Pattern.compile("windows", Pattern.CASE_INSENSITIVE);
	public static final Pattern OSXPattern  = Pattern.compile("os x (\\d+)[._](\\d+)", Pattern.CASE_INSENSITIVE);
	public static final Pattern LinuxPattern  = Pattern.compile("linux", Pattern.CASE_INSENSITIVE);
	public static final Pattern WiiPattern  = Pattern.compile("wii", Pattern.CASE_INSENSITIVE);
	public static final Pattern PS3Pattern  = Pattern.compile("playstation 3", Pattern.CASE_INSENSITIVE);
	public static final Pattern PSPPattern  = Pattern.compile("playstation portable", Pattern.CASE_INSENSITIVE);
	public static final Pattern IpadPattern  = Pattern.compile("\\(iPad.*os (\\d+)[._](\\d+)", Pattern.CASE_INSENSITIVE);
	public static final Pattern IphonePattern  = Pattern.compile("\\(iPhone.*os (\\d+)[._](\\d+)", Pattern.CASE_INSENSITIVE);
	public static final Pattern YpodPattern  = Pattern.compile("iPod touch[\\s\\;]+iPhone.*os (\\d+)[._](\\d+)", Pattern.CASE_INSENSITIVE); // Yammer Mobile Special Case
	public static final Pattern YpadPattern  = Pattern.compile("iPad[\\s\\;]+iPhone.*os (\\d+)[._](\\d+)", Pattern.CASE_INSENSITIVE); // Yammer Mobile Special Case
	public static final Pattern YphonePattern  = Pattern.compile("iPhone[\\s\\;]+iPhone.*os (\\d+)[._](\\d+)", Pattern.CASE_INSENSITIVE); // Yammer Mobile Special Case
	public static final Pattern SymbianPattern  = Pattern.compile("symbian(os)?", Pattern.CASE_INSENSITIVE);
	public static final Pattern BlackBerryPattern  = Pattern.compile("BlackBerry", Pattern.CASE_INSENSITIVE);
	public static final Pattern DarwinPattern  = Pattern.compile("Darwin\\/([\\d\\w\\.\\-]+)", Pattern.CASE_INSENSITIVE);
	public static final Pattern AdobeAirPattern  = Pattern.compile("AdobeAir\\/([\\d\\w\\.\\-]+)", Pattern.CASE_INSENSITIVE);
	public static final Pattern JavaPattern  = Pattern.compile("\\(Java[\\s]+([\\d\\w\\.\\-]+)\\)", Pattern.CASE_INSENSITIVE);	
}
