package org.stepdef;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class StepDefinitions {
	WebDriver driver;

	@Given("user launch browser in chrome browser")
	public void user_launch_browser_in_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(string);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(string2);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@Then("user validates homepage")
	public void user_validates_homepage() {
		String expected = "Hello subashbose!";

		String findElement = driver.findElement(By.xpath("//input[@id='username_show']")).getAttribute("value");
		if (expected.equalsIgnoreCase(findElement)) {
			System.out.println("login succesful");

		}
	}
//SECOND SCENARIO
	@Then("user validates error message")
	public void user_validates_error_message() {

		String expected = "Invalid Login details or Your Password might have expired. Click here to reset your password";

		String text = driver.findElement(By.xpath("//div[@class='auth_error']")).getText();
		Assert.assertEquals(expected, text);
		System.out.println("Invalid login");

	}
//THIRD SCENARIO
	@Then("user validates homepage and book hotel using wrong checkin")
	public void user_validates_homepage_and_book_hotel_using_wrong_checkin() {

		WebElement findElement = driver.findElement(By.id("location"));

		Select dropDown = new Select(findElement);
		dropDown.selectByVisibleText("Sydney");

		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select dropDown2 = new Select(findElement2);
		dropDown2.selectByVisibleText("Hotel Creek");

		WebElement findElement3 = driver.findElement(By.id("room_type"));
		Select dropDown3 = new Select(findElement3);
		dropDown3.selectByVisibleText("Standard");

		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("14/05/2022");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("13/05/2022");

		driver.findElement(By.id("room_nos")).sendKeys("One");

		driver.findElement(By.id("adult_room")).sendKeys("One");

		driver.findElement(By.id("child_room")).sendKeys("One");
		WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
		search.click();
		String expected="Check-Out Date shall be after than Check-In Date";
		String actual = driver.findElement(By.xpath("//span[@id='checkout_span']\r\n")).getText();
		if (expected.equalsIgnoreCase(actual)) {
			System.out.println("swap dates");
		}

	}
	
	@Then("user enters hotel details and search")
	public void user_enters_hotel_details_and_search() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user selects hotel and continue")
	public void user_selects_hotel_and_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user enters personal details and book")
	public void user_enters_personal_details_and_book() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
