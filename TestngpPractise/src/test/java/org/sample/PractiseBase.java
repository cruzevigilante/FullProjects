package org.sample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PractiseBase extends BaseClass {
    @Test
	public void fb() {
		launchBrowser("https://fb.com","edge");
		String text = getText(driver.findElement(By.xpath("//h2[@class='_8eso']")));
		System.out.println(text);
		typeText(driver.findElement(By.id("email")), "subash");
	}
	
}
