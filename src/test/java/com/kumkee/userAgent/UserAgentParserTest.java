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
		Browser browser = userAgentParser.browser(userAgentString);
		assertEquals(Browser.FIREFOX, browser);
	}

	@Test
	public void testBrowserName_apacheHttpClient() {
		String userAgentString = "Apache-HttpClient/4.1.2 (java 1.5)";
		Browser browser = userAgentParser.browser(userAgentString);
		assertEquals(Browser.APACHE_HTTP_CLIENT, browser);
	}

	@Test
	public void testBrowserVersion_firefox() {
		String userAgentString = "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.1.13) Gecko/20100914 Firefox/3.5.13 (.NET CLR 3.5.30729)";
		String verison = Browser.FIREFOX.getVersion(userAgentString);
		assertEquals("3.5.13", verison);
	}
	
	@Test
	public void testBrowserVersion_apacheHttpClient() {
		String userAgentString = "Apache-HttpClient/4.1.2 (java 1.5)";
		String verison = Browser.APACHE_HTTP_CLIENT.getVersion(userAgentString);
		assertEquals("4.1.2", verison);
	}
}
