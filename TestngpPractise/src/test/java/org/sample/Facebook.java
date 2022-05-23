package org.sample;

import org.testng.annotations.Test;

public class Facebook extends BaseClass {
	@Test
	public void Homepage() {
		 launchBrowser("https://fb.com", "chrome");
		 PageObject pg= new PageObject(driver);
		 pg.username().sendKeys("subash");
		 pg.password().sendKeys("123456");
		 pg.login().click();
		 
		}
	
}
