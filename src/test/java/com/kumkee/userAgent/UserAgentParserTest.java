package com.kumkee.userAgent;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserAgentParserTest {

	private UserAgentParser userAgentParser;
	
	@Before
	public void setup()
	{
		userAgentParser = UserAgentParser.getInstance();
	}
	
	@Test
	public void testBrowserName_firefox() {
		String userAgentString = "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.1.13) Gecko/20100914 Firefox/3.5.13 (.NET CLR 3.5.30729)";
		String browser = userAgentParser.browser(userAgentString);
		assertEquals(Browser.Firefox, browser);
	}

	@Test
	public void testBrowserName_apacheHttpClient() {
		String userAgentString = "Apache-HttpClient/4.1.2 (java 1.5)";
		String browser = userAgentParser.browser(userAgentString);
		assertEquals(Browser.ApacheHTTPClient, browser);
	}

	@Test
	public void testBrowserVersion_firefox() {
		String userAgentString = "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.1.13) Gecko/20100914 Firefox/3.5.13 (.NET CLR 3.5.30729)";
		String verison = userAgentParser.browserVersion(userAgentString, Browser.Firefox);
		assertEquals("3.5.13", verison);
	}
	
	@Test
	public void testBrowserVersion_apacheHttpClient() {
		String userAgentString = "Apache-HttpClient/4.1.2 (java 1.5)";
		String verison = userAgentParser.browserVersion(userAgentString, Browser.ApacheHTTPClient);
		assertEquals("4.1.2", verison);
	}
	
	@Test
	public void testBrowserVersion_konqueror() {
		String userAgentString =   "Mozilla/5.0 (compatible; Konqueror/3.1-rc6; i686 Linux; 20021105)";
		//String userAgentString = "Mozilla/5.0 (compatible; Konqueror/3.1-rc6; i686 Linux; 20021105)";
		String verison = userAgentParser.browserVersion(userAgentString, Browser.Konqueror);
		assertEquals("3.1-rc6", verison);
	}
	
	@Test
	public void testOS_windowsxp()
	{
		String userAgentString = "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.1.13) Gecko/20100914 Firefox/3.5.13 (.NET CLR 3.5.30729)";
		String os = userAgentParser.OS(userAgentString);
		assertEquals("Windows XP", os);
	}

	@Test
	public void testOS_osx()
	{
		String userAgentString = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_4; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.472.63 Safari/534.3";
		String os = userAgentParser.OS(userAgentString);
		assertEquals("OS X 10.6", os); // TODO: This is missing the last part of the version number
	}
	
	@Test
	public void testOS_java()
	{
		String userAgentString = "Apache-HttpClient/4.1.2 (java 1.5)";
		String os = userAgentParser.OS(userAgentString);
		assertEquals("Java 1.5", os); // TODO: This is missing the last part of the version number
	}
	
	//@Test
	public void testOS_iphone()
	{
		String userAgentString = "Yammer 4.1.1.668 (iPhone; iPhone OS 5.0.1; en_US)";
		String os = userAgentParser.OS(userAgentString);
		assertEquals("iPhone OS 5.0.1", os);
	}
	
	@Test
	public void testOS_darwin()
	{
		String userAgentString = "Gabble/1.5.2 CFNetwork/520.0.13 Darwin/11.1.0 (x86_64) (MacBookPro8%2C1)";
		String os = userAgentParser.OS(userAgentString);
		assertEquals("Darwin", os);
	}
	
	@Test
	public void testEngineVersion_KHTML() {
		String userAgentString =   "Mozilla/5.0 (compatible; Konqueror/4.2; Linux; X11; x86_64) KHTML/4.2.4 (like Gecko) Fedora/4.2.4-2.fc11";
		String verison = userAgentParser.engineVersion(userAgentString);
		assertEquals("4.2.4", verison);
	}
	
	@Test
	@Ignore
	public void testEngineVersion_Konqueror() {
		String userAgentString =   "Mozilla/5.0 (compatible; Konqueror/3.1-rc6; i686 Linux; 20021105)";
		String verison = userAgentParser.engineVersion(userAgentString);
		assertEquals("3.1-rc6", verison);
	}
	
}
