package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;

@Given("launch facebook page on chrome browser")
public void launch_facebook_page_on_chrome_browser() {
	
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://fb.com");
    
}

@When("enter {string} and {string}")
public void enter_and(String username, String password) {

	WebElement txtusrname = driver.findElement(By.id("email"));
	
	txtusrname.sendKeys("username");
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("password");
	
}

@When("click on login button")
public void click_on_login_button() {
	driver.findElement(By.name("login")).click();
    
	
}

@Then("verify the homepage of facbook is visible or not")
public void verify_the_homepage_of_facbook_is_visible_or_not() {
	System.out.println("Invalid password");


}




}
