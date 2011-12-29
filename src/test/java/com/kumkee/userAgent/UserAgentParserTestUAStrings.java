package com.kumkee.userAgent;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class UserAgentParserTestUAStrings {

	private UserAgentParser userAgentParser;

	@Before
	public void setUp() {
		userAgentParser = new UserAgentParser();
	}
	
	private void testUa(boolean mobile, String browser, String version,
			String platform, String os, String engine, String engine_version,
			String source) {
		UserAgent agent = userAgentParser.parse(source);
		assertEquals(mobile, agent.isMobile());
		assertEquals(browser, agent.getBrowser());
		assertEquals(platform, agent.getPlatform());
		assertEquals(os, agent.getOs());
		assertEquals(engine, agent.getEngine());
		assertEquals(version, agent.getVersion());
		assertEquals(engine_version, agent.getEngineVersion());
	}

	@Test
	public void test() {
		  testUa( false, Browser.Safari,     "4.0dp1",       Platform.Windows,     "Windows XP",     Engine.Webkit,    "526.9",      "Mozilla/5.0 (Windows; U; Windows NT 5.1; en) AppleWebKit/526.9 (KHTML, like Gecko) Version/4.0dp1 Safari/526.8");
		  testUa( false, Browser.Safari,     "4.0.3",        Platform.Windows,     "Windows Vista",  Engine.Webkit,    "531.9",      "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-us) AppleWebKit/531.9 (KHTML, like Gecko) Version/4.0.3 Safari/531.9");
		  testUa( false, Browser.Safari,     "4.0.2",        Platform.Windows,     "Windows 7",      Engine.Webkit,    "532",        "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US) AppleWebKit/532+ (KHTML, like Gecko) Version/4.0.2 Safari/530.19.1");
		  testUa( false, Browser.Safari,     "4.0.1",        Platform.Mac,   "OS X 10.5",      Engine.Webkit,    "531.2",      "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_5_7; en-us) AppleWebKit/531.2+ (KHTML, like Gecko) Version/4.0.1 Safari/530.18");
		  testUa( false, Browser.Safari,     "4.0",          Platform.Windows,     "Windows Vista",  Engine.Webkit,    "528.16",     "Mozilla/5.0 (Windows; U; Windows NT 6.0; ru-RU) AppleWebKit/528.16 (KHTML, like Gecko) Version/4.0 Safari/528.16");
		  testUa( false, Browser.Safari,     "3.2.3",        Platform.Windows,     "Windows XP",     Engine.Webkit,    "525.28.3",   "Mozilla/5.0 (Windows; U; Windows NT 5.1; cs-CZ) AppleWebKit/525.28.3 (KHTML, like Gecko) Version/3.2.3 Safari/525.29");
		  testUa( true,  Browser.Safari,     "4.0.4",        Platform.iPad,        "iPad OS 3.2",    Engine.Webkit,    "531.21.10",  "Mozilla/5.0 (iPad; U; CPU OS 3_2 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Version/4.0.4 Mobile/7B314 Safari/531.21.10");
		  testUa( true,  Browser.Safari,     "4.0.4",        Platform.iPad,        "iPad OS 3.2",    Engine.Webkit,    "531.21.10",  "Mozilla/5.0 (iPad; U; CPU iPhone OS 3_2 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Version/4.0.4 Mobile/7B314 Safari/531.21.10");
		  testUa( true,  Browser.Safari,     "4.0",          Platform.iPhone,      "iPhone OS 3.0",  Engine.Webkit,    "528.18",     "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16");
		  testUa( true,  Browser.Safari,     "4.0",          Platform.Android,     "Linux",          Engine.Webkit,    "533.1",      "Mozilla/5.0 (Linux; U; Android 2.2; en-us; Nexus One Build/FRF91) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
		  testUa( false, Browser.MSIE,         "8.0",          Platform.Windows,     "Windows 7",      Engine.MSIE,      "8.0",        "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.2; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0)");
		  testUa( false, Browser.MSIE,         "7.0b",         Platform.Windows,     "Windows 2003",   Engine.MSIE,      "7.0b",       "Mozilla/4.0 (compatible; MSIE 7.0b; Windows NT 5.2; .NET CLR 1.1.4322; .NET CLR 2.0.50727; InfoPath.2; .NET CLR 3.0.04506.30)");
		  testUa( false, Browser.MSIE,         "7.0",          Platform.Windows,     "Windows XP",     Engine.MSIE,      "7.0",        "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; .NET CLR 1.1.4322; .NET CLR 2.0.50727; InfoPath.2)");
		  testUa( false, Browser.MSIE,         "7.0",          Platform.Windows,     "Windows XP",     Engine.MSIE,      "7.0",        "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; .NET CLR 1.1.4322; .NET CLR 2.0.50727; InfoPath.2; MSOffice 12)");
		  testUa( false, Browser.MSIE,         "6.0b",         Platform.Windows,     "Windows XP",     Engine.MSIE,      "6.0b",       "Mozilla/4.0 (compatible; MSIE 6.0b; Windows NT 5.1)");
		  testUa( false, Browser.MSIE,         "6.0",          Platform.Windows,     "Windows XP",     Engine.MSIE,      "6.0",        "Mozilla/5.0 (Windows; U; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 2.0.50727)");
		  testUa( false, Browser.Opera,      "9.99",         Platform.Windows,     "Windows XP",     Engine.Presto,    "9.9.9",      "Opera/9.99 (Windows NT 5.1; U; pl) Presto/9.9.9");
		  testUa( false, Browser.Opera,      "9.70",         Platform.Linux,       "Linux",          Engine.Gecko,     "20061208",   "Mozilla/5.0 (Linux i686 ; U; en; rv:1.8.1) Gecko/20061208 Firefox/2.0.0 Opera 9.70");
		  testUa( false, Browser.Opera,      "9.64",         Platform.Linux,       "Linux",          Engine.Presto,    "2.1.1",      "Opera/9.64 (X11; Linux i686; U; Linux Mint; it) Presto/2.1.1");
		  testUa( false, Browser.Opera,      "9.00",         Platform.Wii,         "Wii",            Engine.Unknown,    null,         "Opera/9.00 (Nintindo Wii; U; ; 103858; Wii Shop Channel/1.0; en)");
		  testUa( false, Browser.Chrome,     "6.0.472.62",   Platform.Mac,   "OS X 10.6",      Engine.Webkit,    "534.3",      "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_4; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.62 Safari/534.3");
		  testUa( false, Browser.Chrome,     "6.0.472.63",   Platform.Mac,   "OS X 10.6",      Engine.Webkit,    "534.3",      "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_4; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.63 Safari/534.3");
		  testUa( false, Browser.Chrome,     "6.0.472.55",   Platform.Linux,       "Linux",          Engine.Webkit,    "534.3",      "Mozilla/5.0 (X11; U; Linux i686; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.55 Safari/534.3");
		  testUa( false, Browser.Chrome,     "5.0.375.127",  Platform.Windows,     "Windows XP",     Engine.Webkit,    "533.4",      "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/533.4 (KHTML, like Gecko) Chrome/5.0.375.127 Safari/533.4");
		  testUa( false, Browser.Chrome,     "6.0.472.59",   Platform.Windows,     "Windows XP",     Engine.Webkit,    "534.3",      "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.59 Safari/534.3");
		  testUa( false, Browser.Chrome,     "6.0.472.53",   Platform.Linux,       "Linux",          Engine.Webkit,    "534.3",      "Mozilla/5.0 (X11; U; Linux x86_64; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.53 Safari/534.3");
		  testUa( false, Browser.Chrome,     "4.0.202.2",    Platform.Linux,       "Linux",          Engine.Webkit,    "532.0",      "Mozilla/5.0 (X11; U; Linux i686 (x86_64); en-US) AppleWebKit/532.0 (KHTML, like Gecko) Chrome/4.0.202.2 Safari/532.0");
		  testUa( false, Browser.Chrome,     "0.2.149.27",   Platform.Windows,     "Windows 2003",   Engine.Webkit,    "525.13",     "Mozilla/5.0 (Windows; U; Windows NT 5.2; en-US) AppleWebKit/525.13 (KHTML, like Gecko) Chrome/0.2.149.27 Safari/525.13 ");
		  testUa( false, Browser.Chrome,     "0.2.149.30",   Platform.Windows,     "Windows Vista",  Engine.Webkit,    "525.13",     "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US) AppleWebKit/525.13 (KHTML, like Gecko) Chrome/0.2.149.30 Safari/525.13 ");
		//  testUa( false, Browser.Konqueror,  "4.2",          Platform.Linux,       "Linux",          Engine.KHTML,     "4.2.4",      "Mozilla/5.0 (compatible; Konqueror/4.2; Linux; X11; x86_64) KHTML/4.2.4 (like Gecko) Fedora/4.2.4-2.fc11");
		//  testUa( false, Browser.Konqueror,  "3.1-rc6",      Platform.Linux,       "Linux",          Engine.Konqeror, "3.1-rc6",    "Mozilla/5.0 (compatible; Konqueror/3.1-rc6; i686 Linux; 20021105)");
		  testUa( false, Browser.PS3,        "2.00",         Platform.Playstation, "Playstation 3",    Engine.Unknown,   null,          "Mozilla/5.0 (PLAYSTATION 3; 2.00)");
		  testUa( false, Browser.PS3,        "1.10",         Platform.Playstation, "Playstation 3",    Engine.Unknown,   null,          "Mozilla/5.0 (PLAYSTATION 3; 1.10)");
		  testUa( true,  Browser.PSP,        "2.00",         Platform.Playstation, "Playstation Portable",    Engine.Unknown,   null,          "PSP (PlayStation Portable); 2.00");
		  testUa( true,  Browser.PSP,        "2.00",         Platform.Playstation, "Playstation Portable",    Engine.Unknown,   null,          "Mozilla/4.0 (PSP (PlayStation Portable); 2.00)");
		  testUa( false, Browser.Firefox,    "3.5.13",       Platform.Windows,     "Windows XP",     Engine.Gecko,     "20100914",   "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.1.13) Gecko/20100914 Firefox/3.5.13 (.NET CLR 3.5.30729)");
		  testUa( false, Browser.Firefox,    "3.6.10",       Platform.Windows,     "Windows XP",     Engine.Gecko,     "20100914",   "Mozilla/5.0 (Windows; U; Windows NT 5.1; pt-BR; rv:1.9.2.10) Gecko/20100914 Firefox/3.6.10 GTB7.1");
		  testUa( false, Browser.Firefox,    "3.6.10",       Platform.Windows,     "Windows Vista",  Engine.Gecko,     "20100914",   "Mozilla/5.0 (Windows; U; Windows NT 6.0; pt-BR; rv:1.9.2.10) Gecko/20100914 Firefox/3.6.10 GTB7.1 ( .NET CLR 3.5.30729)");
		  testUa( false, Browser.Firefox,    "3.6.8",        Platform.Linux,       "Linux",          Engine.Gecko,     "20100723",   "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.2.8) Gecko/20100723 Ubuntu/9.10 (karmic) Firefox/3.6.8");
		  testUa( false, Browser.Firefox,    "3.6.9",        Platform.Linux,       "Linux",          Engine.Gecko,     "20100824",   "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.2.9) Gecko/20100824 Firefox/3.6.9");
		  testUa( false, Browser.Firefox,    "3.6.9",        Platform.Linux,       "Linux",          Engine.Gecko,     "20100825",   "Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.2.9) Gecko/20100825 Ubuntu/10.04 (lucid) Firefox/3.6.9");
		  testUa( false, Browser.Opera,      "7.21",         Platform.Windows,     "Windows",        Engine.Unknown,   null,          "Mozilla/4.0 (compatible; MSIE 6.0; Windows 98) Opera 7.21  [pt-BR]");
		  testUa( false, Browser.Netscape,   "7.1",          Platform.Windows,     "Windows XP",     Engine.Gecko,     "20030624",   "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)");
		  testUa( false, Browser.Seamonkey,  "2.0.13",       Platform.Windows,     "Windows Vista",  Engine.Gecko,     "20110320",   "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.18) Gecko/20110320 SeaMonkey/2.0.13");
		  testUa( false, Browser.Outlook,    "14.0.6025",    Platform.Windows,     "Windows 7",      Engine.MSIE,      "7.0",        "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Win64; x64; Trident/4.0; .NET CLR 2.0.50727; SLCC2; .NET4.0C; .NET4.0E; InfoPath.3; Microsoft Outlook 14.0.6025; ms-office; MSOffice 14)");
		  testUa( false, Browser.Evolution,  "2.32.2",       Platform.Unknown,     "Unknown",        Engine.Unknown,   null,          "CamelHttpStream/1.0 Evolution/2.32.2");
		  testUa( true,  Browser.MSIEMobile,   "7.6",         Platform.WindowsPhone, "Windows Phone", Engine.MSIE,     "6.0",        "Mozilla/4.0 (compatible; MSIE 6.0; Windows CE; IEMobile 7.6)");
		  testUa( true,  Browser.MSIEMobile,   null,           Platform.WindowsPhone, "Windows Phone", Engine.MSIE,     "6.0",        "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; Windows Phone 6.5.3.5)");
		  testUa( true,  Browser.MSIEMobile,   "7.0",         Platform.WindowsPhone, "Windows Phone", Engine.MSIE,     "7.0",        "Mozilla/4.0 (compatible; MSIE 7.0; Windows Phone OS 7.0; Trident/3.1; IEMobile/7.0; HTC; 7 Mozart; Orange)");
		  testUa( true,  Browser.Safari,     null,            Platform.Symbian,     "Symbian OS",     Engine.Webkit,    "413",        "Mozilla/5.0 (SymbianOS/9.2; U; Series60/3.1 NokiaE71-3/300.21.012; Profile/MIDP-2.0 Configuration/CLDC-1.1 ) AppleWebKit/413 (KHTML, like Gecko) Safari/413");
		  testUa( true,  Browser.Blackberry,         "5.0.0.732", Platform.Blackberry, "BlackBerry OS",   Engine.MIDP,    "2.1",      "BlackBerry9650/5.0.0.732 Profile/MIDP-2.1 Configuration/CLDC-1.1 VendorID/105");
		  testUa( false, Browser.Gabble,             "1.5.2",     Platform.Mac,  "Darwin",          Engine.Unknown, null,       "Gabble/1.5.2 CFNetwork/520.0.13 Darwin/11.1.0 (x86_64) (MacBookPro8%2C1)");
		  testUa( false, Browser.YammerDesktop,     "300216",    Platform.Windows,    "Adobe Air 3.0",   Engine.Webkit,  "533.19.4", "Mozilla/5.0 (Windows; U; en-US) AppleWebKit/533.19.4 (KHTML like Gecko) AdobeAIR/3.0 300216/Yammer");
		  testUa( false, Browser.YammerDesktop,     "300214",    Platform.Mac,  "Adobe Air 2.7.1", Engine.Webkit,  "531.9",    "Mozilla/5.0 (Macintosh; U; Intel Mac OS X; en) AppleWebKit/531.9 (KHTML like Gecko) AdobeAIR/2.7.1 300214/Yammer");
		  testUa( false, Browser.ApacheHTTPClient, "4.1.2",     Platform.Java,       "Java 1.5",        Engine.Unknown, null,        "Apache-HttpClient/4.1.2 (java 1.5)");
		  testUa( true,  Browser.YammerMobile,      "4.1.1.668", Platform.iPhone,     "iPhone OS 5.0",   Engine.Unknown, null,        "Yammer 4.1.1.668 (iPhone; iPhone OS 5.0.1; en_US)");
		  testUa( true,  Browser.YammerMobile,      "4.1.1.669", Platform.iPod,       "iPhone OS 5.0",   Engine.Unknown, null,        "Yammer 4.1.1.669 (iPod touch; iPhone OS 5.0; es_AR)");
		  testUa( true,  Browser.YammerMobile,      "4.1.1.778", Platform.iPad,       "iPhone OS 5.0",   Engine.Unknown, null,        "Yammer 4.1.1.778 (iPad; iPhone OS 5.0.1; nl_NL)");
	}



}
