package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializeDriver {

		public  WebDriver driver;
		public static Properties prop;
		
	public WebDriver browserLaunch() throws IOException
	{
		
	prop= new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\PageObjectPattern\\File.txt");

	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);

	if(browserName.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 	}
	else if (browserName.equals("firefox"))
	{
		 driver= new FirefoxDriver();
			}
	return driver;
	}

	}
