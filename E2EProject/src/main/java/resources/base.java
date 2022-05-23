package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public static Logger log= LogManager.getLogger(base.class.getName());

	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("Browser");
		
		if (BrowserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Browser Launch\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			
		} else if(BrowserName=="FireFox") {
			//Firefox code

		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;

		
		
		
		
	}

}
