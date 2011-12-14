package com.kumkee.userAgent;

import java.util.regex.Pattern;

public enum Engine {
	WEBKIT("/webkit/i"), 
	MSIE("/msie/i"), 
	PRESTO("/presto/i"), 
	GECKO("/gecko/i"), 
	UNKNOWN(null), 
	KHTML("/khtml/i"), 
	KONQUEROR("/konqueror/i"), 
	MIDP("/MIDP/i"),
	CHROME("/chrome/i");

	private Engine(String regexpStr) {
		regexp = regexpStr != null? Pattern.compile(regexpStr) : null;
	}

	private Pattern regexp; 
	
}
