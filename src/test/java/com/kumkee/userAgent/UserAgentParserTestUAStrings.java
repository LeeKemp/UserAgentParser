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
	
	private void testUa(boolean mobile, Browser browser, String version,
			Platform platform, String os, Engine engine, String engine_version,
			String source) {
		UserAgent agent = userAgentParser.parse(source);
		assertEquals(agent.isMobile(), mobile);
		assertEquals(agent.getBrowser(), browser);
		assertEquals(agent.getPlatform(), platform);
		assertEquals(agent.getOs(), os);
		assertEquals(agent.getEngine(), engine);
		assertEquals(agent.getVersion(), version);
		assertEquals(agent.getEngineVersion(), engine_version);
	}

	@Test
	public void test() {
		  testUa( false, Browser.SAFARI,     "4.0dp1",       Platform.WINDOWS,     "Windows XP",     Engine.WEBKIT,    "526.9",      "Mozilla/5.0 (Windows; U; Windows NT 5.1; en) AppleWebKit/526.9 (KHTML, like Gecko) Version/4.0dp1 Safari/526.8");
		  testUa( false, Browser.SAFARI,     "4.0.3",        Platform.WINDOWS,     "Windows Vista",  Engine.WEBKIT,    "531.9",      "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-us) AppleWebKit/531.9 (KHTML, like Gecko) Version/4.0.3 Safari/531.9");
		  testUa( false, Browser.SAFARI,     "4.0.2",        Platform.WINDOWS,     "Windows 7",      Engine.WEBKIT,    "532",        "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US) AppleWebKit/532+ (KHTML, like Gecko) Version/4.0.2 Safari/530.19.1");
		  testUa( false, Browser.SAFARI,     "4.0.1",        Platform.MAC,   "OS X 10.5",      Engine.WEBKIT,    "531.2",      "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_5_7; en-us) AppleWebKit/531.2+ (KHTML, like Gecko) Version/4.0.1 Safari/530.18");
		  testUa( false, Browser.SAFARI,     "4.0",          Platform.WINDOWS,     "Windows Vista",  Engine.WEBKIT,    "528.16",     "Mozilla/5.0 (Windows; U; Windows NT 6.0; ru-RU) AppleWebKit/528.16 (KHTML, like Gecko) Version/4.0 Safari/528.16");
		  testUa( false, Browser.SAFARI,     "3.2.3",        Platform.WINDOWS,     "Windows XP",     Engine.WEBKIT,    "525.28.3",   "Mozilla/5.0 (Windows; U; Windows NT 5.1; cs-CZ) AppleWebKit/525.28.3 (KHTML, like Gecko) Version/3.2.3 Safari/525.29");
		  testUa( true,  Browser.SAFARI,     "4.0.4",        Platform.IPAD,        "iPad OS 3.2",    Engine.WEBKIT,    "531.21.10",  "Mozilla/5.0 (iPad; U; CPU OS 3_2 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Version/4.0.4 Mobile/7B314 Safari/531.21.10");
		  testUa( true,  Browser.SAFARI,     "4.0.4",        Platform.IPAD,        "iPad OS 3.2",    Engine.WEBKIT,    "531.21.10",  "Mozilla/5.0 (iPad; U; CPU iPhone OS 3_2 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Version/4.0.4 Mobile/7B314 Safari/531.21.10");
		  testUa( true,  Browser.SAFARI,     "4.0",          Platform.IPHONE,      "iPhone OS 3.0",  Engine.WEBKIT,    "528.18",     "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16");
		  testUa( true,  Browser.SAFARI,     "4.0",          Platform.ANDROID,     "Linux",          Engine.WEBKIT,    "533.1",      "Mozilla/5.0 (Linux; U; Android 2.2; en-us; Nexus One Build/FRF91) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
		  testUa( false, Browser.IE,         "8.0",          Platform.WINDOWS,     "Windows 7",      Engine.MSIE,      "8.0",        "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.2; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0)");
		  testUa( false, Browser.IE,         "7.0b",         Platform.WINDOWS,     "Windows 2003",   Engine.MSIE,      "7.0b",       "Mozilla/4.0 (compatible; MSIE 7.0b; Windows NT 5.2; .NET CLR 1.1.4322; .NET CLR 2.0.50727; InfoPath.2; .NET CLR 3.0.04506.30)");
		  testUa( false, Browser.IE,         "7.0",          Platform.WINDOWS,     "Windows XP",     Engine.MSIE,      "7.0",        "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; .NET CLR 1.1.4322; .NET CLR 2.0.50727; InfoPath.2)");
		  testUa( false, Browser.IE,         "7.0",          Platform.WINDOWS,     "Windows XP",     Engine.MSIE,      "7.0",        "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; .NET CLR 1.1.4322; .NET CLR 2.0.50727; InfoPath.2; MSOffice 12)");
		  testUa( false, Browser.IE,         "6.0b",         Platform.WINDOWS,     "Windows XP",     Engine.MSIE,      "6.0b",       "Mozilla/4.0 (compatible; MSIE 6.0b; Windows NT 5.1)");
		  testUa( false, Browser.IE,         "6.0",          Platform.WINDOWS,     "Windows XP",     Engine.MSIE,      "6.0",        "Mozilla/5.0 (Windows; U; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 2.0.50727)");
		  testUa( false, Browser.OPERA,      "9.99",         Platform.WINDOWS,     "Windows XP",     Engine.PRESTO,    "9.9.9",      "Opera/9.99 (Windows NT 5.1; U; pl) Presto/9.9.9");
		  testUa( false, Browser.OPERA,      "9.70",         Platform.LINUX,       "Linux",          Engine.GECKO,     "20061208",   "Mozilla/5.0 (Linux i686 ; U; en; rv:1.8.1) Gecko/20061208 Firefox/2.0.0 Opera 9.70");
		  testUa( false, Browser.OPERA,      "9.64",         Platform.LINUX,       "Linux",          Engine.PRESTO,    "2.1.1",      "Opera/9.64 (X11; Linux i686; U; Linux Mint; it) Presto/2.1.1");
		  testUa( false, Browser.OPERA,      "9.00",         Platform.WII,         "Wii",            Engine.UNKNOWN,    null,         "Opera/9.00 (Nintindo Wii; U; ; 103858; Wii Shop Channel/1.0; en)");
		  testUa( false, Browser.CHROME,     "6.0.472.62",   Platform.MAC,   "OS X 10.6",      Engine.WEBKIT,    "534.3",      "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_4; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.62 Safari/534.3");
		  testUa( false, Browser.CHROME,     "6.0.472.63",   Platform.MAC,   "OS X 10.6",      Engine.WEBKIT,    "534.3",      "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_4; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.63 Safari/534.3");
		  testUa( false, Browser.CHROME,     "6.0.472.55",   Platform.LINUX,       "Linux",          Engine.WEBKIT,    "534.3",      "Mozilla/5.0 (X11; U; Linux i686; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.55 Safari/534.3");
		  testUa( false, Browser.CHROME,     "5.0.375.127",  Platform.WINDOWS,     "Windows XP",     Engine.WEBKIT,    "533.4",      "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/533.4 (KHTML, like Gecko) Chrome/5.0.375.127 Safari/533.4");
		  testUa( false, Browser.CHROME,     "6.0.472.59",   Platform.WINDOWS,     "Windows XP",     Engine.WEBKIT,    "534.3",      "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.59 Safari/534.3");
		  testUa( false, Browser.CHROME,     "6.0.472.53",   Platform.LINUX,       "Linux",          Engine.WEBKIT,    "534.3",      "Mozilla/5.0 (X11; U; Linux x86_64; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.53 Safari/534.3");
		  testUa( false, Browser.CHROME,     "4.0.202.2",    Platform.LINUX,       "Linux",          Engine.WEBKIT,    "532.0",      "Mozilla/5.0 (X11; U; Linux i686 (x86_64); en-US) AppleWebKit/532.0 (KHTML, like Gecko) Chrome/4.0.202.2 Safari/532.0");
		  testUa( false, Browser.CHROME,     "0.2.149.27",   Platform.WINDOWS,     "Windows 2003",   Engine.WEBKIT,    "525.13",     "Mozilla/5.0 (Windows; U; Windows NT 5.2; en-US) AppleWebKit/525.13 (KHTML, like Gecko) Chrome/0.2.149.27 Safari/525.13 ");
		  testUa( false, Browser.CHROME,     "0.2.149.30",   Platform.WINDOWS,     "Windows Vista",  Engine.WEBKIT,    "525.13",     "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US) AppleWebKit/525.13 (KHTML, like Gecko) Chrome/0.2.149.30 Safari/525.13 ");
		  testUa( false, Browser.KONQUEROR,  "4.2",          Platform.LINUX,       "Linux",          Engine.KHTML,     "4.2.4",      "Mozilla/5.0 (compatible; Konqueror/4.2; Linux; X11; x86_64) KHTML/4.2.4 (like Gecko) Fedora/4.2.4-2.fc11");
		  testUa( false, Browser.KONQUEROR,  "3.1-rc6",      Platform.LINUX,       "Linux",          Engine.KONQUEROR, "3.1-rc6",    "Mozilla/5.0 (compatible; Konqueror/3.1-rc6; i686 Linux; 20021105)");
		  testUa( false, Browser.PS3,        "2.00",         Platform.PLAYSTATION, "Playstation",    Engine.UNKNOWN,   null,          "Mozilla/5.0 (PLAYSTATION 3; 2.00)");
		  testUa( false, Browser.PS3,        "1.10",         Platform.PLAYSTATION, "Playstation",    Engine.UNKNOWN,   null,          "Mozilla/5.0 (PLAYSTATION 3; 1.10)");
		  testUa( true,  Browser.PS3,        "2.00",         Platform.PLAYSTATION, "Playstation",    Engine.UNKNOWN,   null,          "PSP (PlayStation Portable); 2.00");
		  testUa( true,  Browser.PS3,        "2.00",         Platform.PLAYSTATION, "Playstation",    Engine.UNKNOWN,   null,          "Mozilla/4.0 (PSP (PlayStation Portable); 2.00)");
		  testUa( false, Browser.FIREFOX,    "3.5.13",       Platform.WINDOWS,     "Windows XP",     Engine.GECKO,     "20100914",   "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.1.13) Gecko/20100914 Firefox/3.5.13 (.NET CLR 3.5.30729)");
		  testUa( false, Browser.FIREFOX,    "3.6.10",       Platform.WINDOWS,     "Windows XP",     Engine.GECKO,     "20100914",   "Mozilla/5.0 (Windows; U; Windows NT 5.1; pt-BR; rv:1.9.2.10) Gecko/20100914 Firefox/3.6.10 GTB7.1");
		  testUa( false, Browser.FIREFOX,    "3.6.10",       Platform.WINDOWS,     "Windows Vista",  Engine.GECKO,     "20100914",   "Mozilla/5.0 (Windows; U; Windows NT 6.0; pt-BR; rv:1.9.2.10) Gecko/20100914 Firefox/3.6.10 GTB7.1 ( .NET CLR 3.5.30729)");
		  testUa( false, Browser.FIREFOX,    "3.6.8",        Platform.LINUX,       "Linux",          Engine.GECKO,     "20100723",   "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.2.8) Gecko/20100723 Ubuntu/9.10 (karmic) Firefox/3.6.8");
		  testUa( false, Browser.FIREFOX,    "3.6.9",        Platform.LINUX,       "Linux",          Engine.GECKO,     "20100824",   "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.2.9) Gecko/20100824 Firefox/3.6.9");
		  testUa( false, Browser.FIREFOX,    "3.6.9",        Platform.LINUX,       "Linux",          Engine.GECKO,     "20100825",   "Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.2.9) Gecko/20100825 Ubuntu/10.04 (lucid) Firefox/3.6.9");
		  testUa( false, Browser.OPERA,      "7.21",         Platform.WINDOWS,     "Windows",        Engine.UNKNOWN,   null,          "Mozilla/4.0 (compatible; MSIE 6.0; Windows 98) Opera 7.21  [pt-BR]");
		  testUa( false, Browser.LOTUS,      "6.0",          Platform.WINDOWS,     "Windows",        Engine.UNKNOWN,   null,          "Mozilla/4.0 (compatible; Lotus-Notes/6.0; Windows-NT)");
		  testUa( false, Browser.THUNDERBIRD, "2.0.0.23",    Platform.WINDOWS,     "Windows XP",     Engine.GECKO,     "20090812",   "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-GB; rv:1.8.1.23) Gecko/20090812 Thunderbird/2.0.0.23");
		  testUa( false, Browser.NETSCAPE,   "7.1",          Platform.WINDOWS,     "Windows XP",     Engine.GECKO,     "20030624",   "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)");
		  testUa( false, Browser.SEAMONKEY,  "2.0.13",       Platform.WINDOWS,     "Windows Vista",  Engine.GECKO,     "20110320",   "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.18) Gecko/20110320 SeaMonkey/2.0.13");
		  testUa( false, Browser.OUTLOOK,    "14.0.6025",    Platform.WINDOWS,     "Windows 7",      Engine.MSIE,      "7.0",        "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Win64; x64; Trident/4.0; .NET CLR 2.0.50727; SLCC2; .NET4.0C; .NET4.0E; InfoPath.3; Microsoft Outlook 14.0.6025; ms-office; MSOffice 14)");
		  testUa( false, Browser.EVOLUTION,  "2.32.2",       Platform.UNKNOWN,     "Unknown",        Engine.UNKNOWN,   null,          "CamelHttpStream/1.0 Evolution/2.32.2");
		  testUa( true,  Browser.IE_MOBILE,   "7.6",         Platform.WINDOWS_PHONE, "Windows Phone", Engine.MSIE,     "6.0",        "Mozilla/4.0 (compatible; MSIE 6.0; Windows CE; IEMobile 7.6)");
		  testUa( true,  Browser.IE_MOBILE,   null,           Platform.WINDOWS_PHONE, "Windows Phone", Engine.MSIE,     "6.0",        "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; Windows Phone 6.5.3.5)");
		  testUa( true,  Browser.IE_MOBILE,   "7.0",         Platform.WINDOWS_PHONE, "Windows Phone", Engine.MSIE,     "7.0",        "Mozilla/4.0 (compatible; MSIE 7.0; Windows Phone OS 7.0; Trident/3.1; IEMobile/7.0; HTC; 7 Mozart; Orange)");
		  testUa( true,  Browser.SAFARI,     null,            Platform.SYMBIAN,     "Symbian OS",     Engine.WEBKIT,    "413",        "Mozilla/5.0 (SymbianOS/9.2; U; Series60/3.1 NokiaE71-3/300.21.012; Profile/MIDP-2.0 Configuration/CLDC-1.1 ) AppleWebKit/413 (KHTML, like Gecko) Safari/413");
		  testUa( true,  Browser.BLACKBERRY,         "5.0.0.732", Platform.BLACKBERRY, "BlackBerry OS",   Engine.MIDP,    "2.1",      "BlackBerry9650/5.0.0.732 Profile/MIDP-2.1 Configuration/CLDC-1.1 VendorID/105");
		  testUa( false, Browser.GABBLE,             "1.5.2",     Platform.MAC,  "Darwin",          Engine.UNKNOWN, null,       "Gabble/1.5.2 CFNetwork/520.0.13 Darwin/11.1.0 (x86_64) (MacBookPro8%2C1)");
		  testUa( false, Browser.YAMMER_DESKTOP,     "300216",    Platform.WINDOWS,    "Adobe Air 3.0",   Engine.WEBKIT,  "533.19.4", "Mozilla/5.0 (Windows; U; en-US) AppleWebKit/533.19.4 (KHTML like Gecko) AdobeAIR/3.0 300216/Yammer");
		  testUa( false, Browser.YAMMER_DESKTOP,     "300214",    Platform.MAC,  "Adobe Air 2.7.1", Engine.WEBKIT,  "531.9",    "Mozilla/5.0 (Macintosh; U; Intel Mac OS X; en) AppleWebKit/531.9 (KHTML like Gecko) AdobeAIR/2.7.1 300214/Yammer");
		  testUa( false, Browser.APACHE_HTTP_CLIENT, "4.1.2",     Platform.JAVA,       "Java 1.5",        Engine.UNKNOWN, null,        "Apache-HttpClient/4.1.2 (java 1.5)");
		  testUa( true,  Browser.YAMMER_MOBILE,      "4.1.1.668", Platform.IPHONE,     "iPhone OS 5.0",   Engine.UNKNOWN, null,        "Yammer 4.1.1.668 (iPhone; iPhone OS 5.0.1; en_US)");
		  testUa( true,  Browser.YAMMER_MOBILE,      "4.1.1.669", Platform.IPOD,       "iPhone OS 5.0",   Engine.UNKNOWN, null,        "Yammer 4.1.1.669 (iPod touch; iPhone OS 5.0; es_AR)");
		  testUa( true,  Browser.YAMMER_MOBILE,      "4.1.1.778", Platform.IPAD,       "iPhone OS 5.0",   Engine.UNKNOWN, null,        "Yammer 4.1.1.778 (iPad; iPhone OS 5.0.1; nl_NL)");
	}



}
