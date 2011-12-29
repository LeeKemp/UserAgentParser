package com.kumkee.userAgent;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserAgentParserTest {

	private UserAgentParser userAgentParser;
	
	@Before
	public void setup()
	{
		userAgentParser = new UserAgentParser();
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
}
