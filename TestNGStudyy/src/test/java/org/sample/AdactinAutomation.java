package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class AdactinAutomation extends BaseClass {


	@Test()
	public void adactinLogin() {
		launchBrowser("https://adactinhotelapp.com/");
		WebElement txtUsername = locators("id", "username");
		txtUsername.sendKeys("subashbose");
		WebElement txtPass = locators("id", "password");
		txtPass.sendKeys("subash");
		
		WebElement login = driver.findElement(By.id("login"));

		clkButton(login);
			}
		

		

}
