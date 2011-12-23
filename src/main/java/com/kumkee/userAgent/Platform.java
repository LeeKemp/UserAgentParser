package com.kumkee.userAgent;

import java.util.regex.Pattern;

public class Platform {
	public static final Pattern WindowsPattern = Pattern.compile("windows", Pattern.CASE_INSENSITIVE); 
	public static final Pattern MacPattern = Pattern.compile("(macintosh|darwin)", Pattern.CASE_INSENSITIVE); 
	public static final Pattern iPadPattern = Pattern.compile("ipad", Pattern.CASE_INSENSITIVE);
	public static final Pattern iPhonePattern = Pattern.compile("iphone", Pattern.CASE_INSENSITIVE);
	public static final Pattern AndroidPattern = Pattern.compile("android", Pattern.CASE_INSENSITIVE);
	public static final Pattern LinuxPattern = Pattern.compile("linux", Pattern.CASE_INSENSITIVE); 
	public static final Pattern WiiPattern = Pattern.compile("wii", Pattern.CASE_INSENSITIVE);
	public static final Pattern PlaystationPattern = Pattern.compile("playstation", Pattern.CASE_INSENSITIVE);
	public static final Pattern WindowsPhonePattern = Pattern.compile("windows (ce|phone|mobile)( os)?", Pattern.CASE_INSENSITIVE); 
	public static final Pattern SymbianPattern = Pattern.compile("symbian(os)?", Pattern.CASE_INSENSITIVE); 
	public static final Pattern BlackberryPattern = Pattern.compile("blackberry", Pattern.CASE_INSENSITIVE); 
	public static final Pattern JavaPattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
	public static final Pattern iPodPattern = Pattern.compile("ipod", Pattern.CASE_INSENSITIVE);

	public static final String WindowsPhone = "Windows Phone";
	public static final String Windows = "Windows";
	public static final String Mac = "Mac";
	public static final String Android = "Android";
	public static final String Blackberry = "Blackberry";
	public static final String Linux = "Linux";
	public static final String Wii = "Wii";
	public static final String Playstation = "Playstation";
	public static final String iPad = "iPad";
	public static final String iPod = "iPod";
	public static final String iPhone = "iPhone";
	public static final String Symbian = "Symbian";
	public static final String Java = "Java";
	public static final String Unknown = "Unknown";
	
	public static final String[] mobilePlatforms = {Android, Blackberry, iPad, iPod, iPhone, Symbian, WindowsPhone};
	
}
