package com.kumkee.userAgent;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAgentParser
{

    private static final UserAgentParser instance = new UserAgentParser();

    public static UserAgentParser getInstance() {
        return instance;
    }

    private UserAgentParser() {}

	public UserAgent parse(String userAgentString)
	{
		UserAgent userAgent = new UserAgent();
		userAgent.setBrowser(this.browser(userAgentString));
		userAgent.setVersion(this.browserVersion(userAgentString, userAgent.getBrowser()));
		userAgent.setEngine(this.engine(userAgentString));
		userAgent.setEngineVersion(engineVersion(userAgentString));
		userAgent.setOs(this.OS(userAgentString));
		userAgent.setPlatform(this.platform(userAgentString));
		userAgent.setMobile(Platform.mobilePlatforms.contains(userAgent.getPlatform()) || userAgent.getBrowser().equalsIgnoreCase(Browser.PSP));
		return userAgent;
	}

	public String engineVersion(String userAgentString)
	{
		String regexp = engine(userAgentString)+"[\\/\\- ]([\\d\\w\\.\\-]+)";
		// System.out.println("Engine Version: "+regexp);
		Pattern pattern = Pattern.compile(regexp, Pattern.CASE_INSENSITIVE); 
		Matcher matcher = pattern.matcher(userAgentString);
		//System.out.println(matcher.groupCount());
		
		if(matcher.find())
		{
			String version = matcher.group(1);
			// System.out.println("Verison: "+version);
			return version;
		}
		
		return null;
	}
	
	public String engine(String userAgentString)
	{
		if(matches(Engine.WebkitPattern, userAgentString))
			return Engine.Webkit;
		if(matches(Engine.KHTMLPattern, userAgentString))
			return Engine.KHTML;
		if(matches(Engine.KonquerorPattern, userAgentString))
			return Engine.Konqeror;
		if(matches(Engine.ChromePattern, userAgentString))
			return Engine.Chrome;
		if(matches(Engine.PrestoPattern, userAgentString))
			return Engine.Presto;
		if(matches(Engine.GeckoPattern, userAgentString))
			return Engine.Gecko;
		if(matches(Engine.OperaPattern, userAgentString))
			return Engine.Unknown;
		if(matches(Engine.MSIEPattern, userAgentString))
			return Engine.MSIE;
		if(matches(Engine.MIDPPattern, userAgentString))
			return Engine.MIDP;
		
		return Engine.Unknown;
	}
	
	public String platform(String userAgentString)
	{
		if(matches(Platform.WindowsPhonePattern, userAgentString))
			return "Windows Phone";
		if(matches(Platform.WindowsPattern, userAgentString))
			return "Windows";
		if(matches(Platform.MacPattern, userAgentString))
			return "Mac";
		if(matches(Platform.AndroidPattern, userAgentString))
			return "Android";
		if(matches(Platform.BlackberryPattern, userAgentString))
			return "Blackberry";
		if(matches(Platform.LinuxPattern, userAgentString))
			return "Linux";
		if(matches(Platform.WiiPattern, userAgentString))
			return "Wii";
		if(matches(Platform.PlaystationPattern, userAgentString))
			return "Playstation";
		if(matches(Platform.iPadPattern, userAgentString))
			return "iPad";
		if(matches(Platform.iPodPattern, userAgentString))
			return "iPod";
		if(matches(Platform.iPhonePattern, userAgentString))
			return "iPhone";
		if(matches(Platform.SymbianPattern, userAgentString))
			return "Symbian";
		if(matches(Platform.JavaPattern, userAgentString))
			return "Java";
		
		return "Unknown";
	}
	
	public String browser(String userAgentString)
	{
		if(matches(Browser.KonquerorPattern, userAgentString))
			return Browser.Konqueror;
		else if(matches(Browser.ChromePattern, userAgentString))
			return Browser.Chrome;
		else if(matches(Browser.SafariPattern, userAgentString))
			return Browser.Safari;
		else if(matches(Browser.OperaPattern, userAgentString))
			return Browser.Opera;
		else if(matches(Browser.PS3Pattern, userAgentString))
			return Browser.PS3;
		else if(matches(Browser.PSPPattern, userAgentString))
			return Browser.PSP;
		else if(matches(Browser.FirefoxPattern, userAgentString))
			return Browser.Firefox;
		else if(matches(Browser.LotusPattern, userAgentString))
			return Browser.Lotus;
		else if(matches(Browser.NetscapePattern, userAgentString))
			return Browser.Netscape;
		else if(matches(Browser.SeamonkeyPattern, userAgentString))
			return Browser.Seamonkey;
		else if(matches(Browser.ThumderbirdPattern, userAgentString))
			return Browser.Thunderbird;
		else if(matches(Browser.OutlookPattern, userAgentString))
			return Browser.Outlook;
		else if(matches(Browser.EvolutionPattern, userAgentString))
			return Browser.Evolution;
		else if(matches(Browser.MSIEMobilePattern, userAgentString))
			return Browser.MSIEMobile;
		else if(matches(Browser.MSIEPattern, userAgentString))
			return Browser.MSIE;
		else if(matches(Browser.BlackberryPattern, userAgentString))
			return Browser.Blackberry;
		else if(matches(Browser.GabblePattern, userAgentString))
			return Browser.Gabble;
		else if(matches(Browser.YammerDesktopPattern, userAgentString))
			return Browser.YammerDesktop;
		else if(matches(Browser.YammerMobilePattern, userAgentString))
			return Browser.YammerMobile;
		else if(matches(Browser.ApacheHTTPClientPattern, userAgentString))
			return Browser.ApacheHTTPClient;
		else
			return Browser.Unknown;
	}

	public String browserVersion(String userAgentString, String browser)
	{
		Pattern pattern; 
		
		if(browser.equalsIgnoreCase(Browser.Chrome))
		{
			pattern = BrowserVersion.ChromePattern;
		}
		else if(browser.equalsIgnoreCase(Browser.Safari))
		{
			pattern = BrowserVersion.SafariPattern;
		}
		else if(browser.equalsIgnoreCase(Browser.PS3))
		{
			pattern = BrowserVersion.PS3Pattern;
		}
		else if(browser.equalsIgnoreCase(Browser.PSP))
		{
			pattern = BrowserVersion.PSPPattern;
		}
		else if(browser.equalsIgnoreCase(Browser.Lotus))
		{
			pattern = BrowserVersion.LotusPattern;
		}
		else if(browser.equalsIgnoreCase(Browser.Blackberry))
		{
			pattern = BrowserVersion.BlackberryPattern;
		}
		else if(browser.equalsIgnoreCase(Browser.YammerDesktop))
		{
			pattern = BrowserVersion.YammerDesktopPattern;
		}
		else if(browser.equalsIgnoreCase(Browser.YammerMobile))
		{
			pattern = BrowserVersion.YammerMobilePattern;
		}
		else if(browser.equalsIgnoreCase(Browser.ApacheHTTPClient))
		{
			pattern = BrowserVersion.ApacheDesktopClientPattern;
		}
		else
		{
			// Append the Browsers name to the start of the generic "Other" regexp 
			pattern = Pattern.compile(browser + BrowserVersion.Other, Pattern.CASE_INSENSITIVE); 
		}

		Matcher matcher = pattern.matcher(userAgentString);
		if(matcher.find())
		{
			return matcher.group(1);
		}
		else
		{
			return null;
		}
	}

	public String OS(String userAgentString)
	{
		if(matches(OS.AdobeAirPattern, userAgentString))
			return replaceTokens(OS.AdobeAirPattern, userAgentString, "Adobe Air #{$1}");
		if(matches(OS.WindowsPhonePattern, userAgentString))
			return "Windows Phone";
		if(matches(OS.WindowsVistaPattern, userAgentString))
			return "Windows Vista";
		if(matches(OS.Windows7Pattern, userAgentString))
			return "Windows 7";
		if(matches(OS.Windows2003Pattern, userAgentString))
			return "Windows 2003";
		if(matches(OS.WindowsXPPattern, userAgentString))
			return "Windows XP";
		if(matches(OS.Windows2000Pattern, userAgentString))
			return "Windows 2000";
		if(matches(OS.WindowsPattern, userAgentString))
			return "Windows";
		if(matches(OS.OSXPattern, userAgentString))
			return replaceTokens(OS.OSXPattern, userAgentString, "OS X #{$1}.#{$2}");
		if(matches(OS.LinuxPattern, userAgentString))
			return "Linux";
		if(matches(OS.WiiPattern, userAgentString))
			return "Wii";
		if(matches(OS.PS3Pattern, userAgentString))
			return "Playstation 3";
		if(matches(OS.PSPPattern, userAgentString))
			return "Playstation Portable";
		if(matches(OS.YpodPattern, userAgentString))
			return replaceTokens(OS.YpodPattern, userAgentString, "iPhone OS #{$1}.#{$2}");
		if(matches(OS.YpadPattern, userAgentString))
			return replaceTokens(OS.YpadPattern, userAgentString, "iPhone OS #{$1}.#{$2}");
		if(matches(OS.YphonePattern, userAgentString))
			return replaceTokens(OS.YphonePattern, userAgentString, "iPhone OS #{$1}.#{$2}");
		if(matches(OS.IpadPattern, userAgentString))
			return replaceTokens(OS.IpadPattern, userAgentString, "iPad OS #{$1}.#{$2}");
		if(matches(OS.IphonePattern, userAgentString))
			return replaceTokens(OS.IphonePattern, userAgentString, "iPhone OS #{$1}.#{$2}");
		if(matches(OS.DarwinPattern, userAgentString))
			return "Darwin";
		if(matches(OS.JavaPattern, userAgentString))
			return replaceTokens(OS.JavaPattern, userAgentString, "Java #{$1}");
		if(matches(OS.SymbianPattern, userAgentString))
			return "Symbian OS";
		if(matches(OS.BlackBerryPattern, userAgentString))
			return "BlackBerry OS";
		
			//return "OSX";

		return "Unknown";
	}

	public boolean matches(Pattern pattern, String userAgentStr)
	{
		return pattern.matcher(userAgentStr).find();
	}

	/**
	 * Replaces the tokens within the format String with the content of the groups found within the userAgentString. 
	 * <p>
	 * Tokens within the format string are formatted as #{$i} where i is the index of the group in the pattern. 
	 * <p>
	 * TODO: I would expect that there is an easier way to do this. 
	 * 
	 * @param pattern The regexp pattern to search for groups within the userAgentString
	 * @param userAgentString
	 * @param format The string to replace the tokens within
	 * @return The format string with the tokens replaced with the groups found in the userAgentString
	 */
	public String replaceTokens(Pattern pattern, String userAgentString, String format)
	{
		// System.out.println("UserAgent: " + userAgentString);
		// System.out.println("Regexp: " + pattern.toString());
		// System.out.println("Replacement: " + format);

		Matcher m = pattern.matcher(userAgentString);	

		// Move the group content into an array
		List<String> groupContent = new ArrayList<String>();
		// System.out.println("Group Count: "+m.groupCount());

		m.find();
		for(int i=0; i<=m.groupCount(); i++)
		{
			String s = m.group(i);
			// System.out.println("--"+s);
			groupContent.add(s);
		}
		
		// Replace the tokens in the pattern 
		for(int i=0; i<groupContent.size(); i++)
		{
			String token = "#\\{\\$"+i+"\\}";
			// System.out.println("Replacing ["+token+"] with ["+groupContent.get(i)+"]");
			format = format.replaceAll(token, groupContent.get(i));
		}
		
		// System.out.println("Response: "+format);
		return format;
	}
}
