package com.kumkee.userAgent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAgentParser
{

	public UserAgent parse(String userAgentString)
	{
		UserAgent userAgent = new UserAgent();
		userAgent.setBrowser(this.browser(userAgentString));
		userAgent.setVersion(this.browserVersion(userAgentString, userAgent.getBrowser()));
		userAgent.setEngine(this.engine(userAgentString));
		//userAgent.setEngineVersion(engineVersion)
		//userAgent.setMobile(mobile)
		userAgent.setOs(this.OS(userAgentString));
		userAgent.setPlatform(this.platform(userAgentString));
		return userAgent;
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
			return "Pltforma";
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
			return replaceText(OS.AdobeAirPattern, userAgentString, "Adobe Air $1");
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
		if(matches(OS.AdobeAirPattern, userAgentString))
			return replaceText(OS.OSXPattern, userAgentString, "OS X $1.$2");
		if(matches(OS.LinuxPattern, userAgentString))
			return "Linux";
		if(matches(OS.WiiPattern, userAgentString))
			return "Wii";
		if(matches(OS.PS3Pattern, userAgentString))
			return "Playstation 3";
		if(matches(OS.WindowsPattern, userAgentString))
			return "Playstation Portable";
		if(matches(OS.YpodPattern, userAgentString))
			return replaceText(OS.YpodPattern, userAgentString, "iPhone OS $1.$2");
		if(matches(OS.YpadPattern, userAgentString))
			return replaceText(OS.YpadPattern, userAgentString, "iPhone OS $1.$2");
		if(matches(OS.YphonePattern, userAgentString))
			return replaceText(OS.YphonePattern, userAgentString, "iPhone OS $1.$2");
		if(matches(OS.IpadPattern, userAgentString))
			return replaceText(OS.IpadPattern, userAgentString, "iPad OS $1.$2");
		if(matches(OS.IphonePattern, userAgentString))
			return replaceText(OS.IphonePattern, userAgentString, "iPhone OS $1.$2");
		if(matches(OS.DarwinPattern, userAgentString))
			return "Darwin";
		if(matches(OS.JavaPattern, userAgentString))
			return replaceText(OS.JavaPattern, userAgentString, "Java $1");
		if(matches(OS.SymbianPattern, userAgentString))
			return "Symbian OS";
		if(matches(OS.BlackBerryPattern, userAgentString))
			return "BlackBerry OS";
		if(matches(OS.OSXPattern, userAgentString))
			return replaceText(OS.OSXPattern, userAgentString, "OS X $1.$2");
			//return "OSX";

		return "Unknown";
	}

	public boolean matches(Pattern pattern, String userAgentStr)
	{
		return pattern.matcher(userAgentStr).find();
	}

	public String replaceText(Pattern pattern, String userAgentStr, String template)
	{
		// TODO: Fix this method, its not replacing the markers in the template with the results from the regexp
		/*
		System.out.println("Template: " + template);
		System.out.println("UserAgent: " + userAgentStr);
		System.out.println("Regexp: " + pattern.toString());
*/
		Matcher m = pattern.matcher(userAgentStr);
		m.find();
		return m.group();
		//System.out.println("Group: "+m.group());
		/*
		if(m.find())
		{
			for(int i = 0; i < m.groupCount(); i++)
			{
				System.out.println("Group: " + m.group(i));
			}
		}
		String s = m.replaceAll(template);
		System.out.println("Result: " + s);
		return s;
		*/
	}
}
