package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
	
	WebDriver driver;

	public PageObject(WebDriver driver2) {

		this.driver = driver2;

	}

	By username = By.id("email");
	By password = By.id("pass");
	By Login = By.name("login");

	public WebElement username() {

		return driver.findElement(username);
	}

	public WebElement password() {

		return driver.findElement(password);

	}

	public WebElement login() {

		return driver.findElement(Login);
	}

}
