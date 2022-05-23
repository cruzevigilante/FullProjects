package org.base;

import java.io.IOException;

public class LoginPage extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserLaunch("https://fb.com");
		
		Config.getKeyFromProperty("url");

 }
	}

