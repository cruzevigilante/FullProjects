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

public class StepDefinitions {
	WebDriver driver;


	@Given("launch chrome browser and open Acatin website")
	public void launch_chrome_browser_and_open_Acatin_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com");

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(string);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(string2);
		WebElement login = driver.findElement(By.id("login"));
		login.click();

	}

	@Then("user enters {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enters_and_and_and_and_and(String string, String string2, String string3, String string4,
			String string5, String string6) {

		WebElement findElement = driver.findElement(By.id("location"));

		Select dropDown = new Select(findElement);
		dropDown.selectByVisibleText(string);

		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select dropDown2 = new Select(findElement2);
		dropDown2.selectByVisibleText(string2);

		WebElement findElement3 = driver.findElement(By.id("room_type"));
		Select dropDown3 = new Select(findElement3);
		dropDown3.selectByVisibleText(string3);

		driver.findElement(By.id("room_nos")).sendKeys(string4);

		driver.findElement(By.id("adult_room")).sendKeys(string5);

		driver.findElement(By.id("child_room")).sendKeys(string6);

	}

	@Then("user should click on search")
	public void user_should_click_on_search() {
		WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
		search.click();
	}

	@Then("user should select hotel")
	public void user_should_select_hotel() {
		WebElement radioButton = driver.findElement(By.id("radiobutton_0"));
		radioButton.click();

		WebElement search = driver.findElement(By.id("continue"));
		search.click();

	}

	@Then("user should enter {string} and {string} and {string}")
	public void user_should_enter_and_and(String string, String string2, String string3) {
		driver.findElement(By.id("first_name")).sendKeys(string);
		driver.findElement(By.id("last_name")).sendKeys(string2);
		driver.findElement(By.id("address")).sendKeys(string3);
	}

	@Then("user should enter {string}")
	public void user_should_enter(String string) throws InterruptedException {
		driver.findElement(By.id("cc_num")).sendKeys(string);
		WebElement findElement7 = driver.findElement(By.id("cc_type"));
		Select dropDown7 = new Select(findElement7);
		dropDown7.selectByIndex(1);
		WebElement findElement8 = driver.findElement(By.id("cc_exp_month"));
		Select dropDown8 = new Select(findElement8);
		dropDown8.selectByIndex(7);
		WebElement findElement9 = driver.findElement(By.id("cc_exp_year"));
		Select dropDown9 = new Select(findElement9);
		dropDown9.selectByIndex(12);
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();


	}
	@Then("user should get the order id")
	public void user_should_get_the_order_id() throws InterruptedException {
		Thread.sleep(5000);
	   String text=driver.findElement(By.id("order_no")).getAttribute("value");
	   System.out.println(text);
	   driver.quit();
	}

	
	
	
	
	
	
	
	
	

}
