package org.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FacebookLogin extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\PropertiesFile\\src\\test\\resources\\configuration.properties");
		
		FileReader fs = new FileReader(f);
		
		Properties pro = new Properties();
		
		pro.load(fs);
		
		Object object = pro.get("url");
		
		String string = object.toString();
		
		System.out.println(string);
	}
}
