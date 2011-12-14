package com.kumkee.userAgent;

public class UserAgentParser {
	
	public UserAgent parse(String userAgentString)
	{
		UserAgent userAgent = new UserAgent();
		userAgent.setBrowser(browser(userAgentString));
		userAgent.setVersion(this.browserVersion(userAgentString, userAgent.getBrowser()));
		return userAgent;
	}
	
	public Browser browser(String userAgentString)
	{
     if(Browser.KONQUEROR.matches(userAgentString)) 
    	 return Browser.KONQUEROR;
      else if(Browser.CHROME.matches(userAgentString))
    	  return Browser.CHROME;
      else if(Browser.SAFARI.matches(userAgentString))
    	  return Browser.SAFARI;
      else if(Browser.OPERA.matches(userAgentString))
    	  return Browser.OPERA;
      else if(Browser.PS3.matches(userAgentString))
    	  return Browser.PS3;
      else if(Browser.PSP.matches(userAgentString))
    	  return Browser.PSP;
      else if(Browser.FIREFOX.matches(userAgentString))
    	  return Browser.FIREFOX;
      else if(Browser.LOTUS.matches(userAgentString))
    	  return Browser.LOTUS;
      else if(Browser.NETSCAPE.matches(userAgentString))
    	  return Browser.NETSCAPE;
      else if(Browser.SEAMONKEY.matches(userAgentString))
    	  return Browser.SEAMONKEY;
      else if(Browser.THUNDERBIRD.matches(userAgentString))
    	  return Browser.THUNDERBIRD;
      else if(Browser.OUTLOOK.matches(userAgentString))
    	  return Browser.OUTLOOK;
      else if(Browser.EVOLUTION.matches(userAgentString))
    	  return Browser.EVOLUTION;
      else if(Browser.IE_MOBILE.matches(userAgentString))
    	  return Browser.IE_MOBILE;
      else if(Browser.IE.matches(userAgentString))
    	  return Browser.IE;
      else if(Browser.BLACKBERRY.matches(userAgentString))
    	  return Browser.BLACKBERRY;
      else if(Browser.GABBLE.matches(userAgentString))
    	  return Browser.GABBLE;
      else if(Browser.YAMMER_DESKTOP.matches(userAgentString))
    	  return Browser.YAMMER_DESKTOP;
      else if(Browser.YAMMER_MOBILE.matches(userAgentString))
    	  return Browser.YAMMER_MOBILE;
      else if(Browser.APACHE_HTTP_CLIENT.matches(userAgentString))
    	  return Browser.APACHE_HTTP_CLIENT;
      else 
    	  return Browser.UNKNOWN;
	}
	
	public String browserVersion(String userAgentString, Browser browser)
	{
		return browser.getVersion(userAgentString);
	}
	
	// Special case here for the OS because it uses the RegExp to populate the 
	// version number for OS's like iOS. The Enum stuff isn't working overly well with that. 
	// TODO: I would like to find a nicer/more consistent way to do this
}
