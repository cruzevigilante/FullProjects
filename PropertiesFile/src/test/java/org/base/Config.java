package org.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
public static Properties getDataFromProperty() throws IOException {
	
		
		File file = new File("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\PropertiesFile\\src\\test\\resources\\configuration.properties");
		FileReader fileReader = new FileReader(file);
		Properties prop = new Properties();
		prop.load(fileReader);
		return prop;
		
		}
	public static String getKeyFromProperty(String key) throws IOException {
		String string = getDataFromProperty().get(key).toString();
		return string;
		
		}


}
