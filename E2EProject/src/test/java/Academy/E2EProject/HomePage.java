package Academy.E2EProject;
import org.apache.logging.log4j.*;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		driver.get("https://www.facebook.com");
		log.info("succesful");
		//return driver;
	}
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password) throws IOException {
		
		//driver =initializeDriver();
		//driver.get("https://www.facebook.com/");
		
		
		LandingPage ld = new LandingPage(driver);
		
		System.out.println(ld.getTitle().getText());
		ld.getUsername().sendKeys(username);
		ld.getPassWord().sendKeys(password);
		ld.submit().click();
		
	}
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[1][2];
		data[0][0]="subash@gmail.com";
		data[0][1]="1234567";
		//data[1][0]="cruze@gmail.com";
		//data[1][1]="aryaa";
		return data;

	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
