package org.stepdef;

import java.util.List;

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

	@Given("launch adactin website on chrome browser")
	public void launch_adactin_website_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com");

	}

	@When("enter {string} and {string}")
	public void enter_and(String string, String string2) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(string);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(string2);
	}

	@When("click on login button")
	public void click_on_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();

	}

	@When("user selects location")
	public void user_selects_location() {
		WebElement findElement = driver.findElement(By.id("location"));

		Select dropDown = new Select(findElement);
		dropDown.selectByIndex(1);

	}

	@When("user should select hotel")
	public void user_should_select_hotel() {
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select dropDown2 = new Select(findElement2);
		dropDown2.selectByIndex(1);
	}

	@When("user should select hotel room type")
	public void user_should_select_hotel_room_type() {
		WebElement findElement3 = driver.findElement(By.id("room_type"));
		Select dropDown3 = new Select(findElement3);
		dropDown3.selectByIndex(1);

	}

	@When("user should select number of rooms")
	public void user_should_select_number_of_rooms() {
		WebElement findElement4 = driver.findElement(By.id("room_nos"));
		Select dropDown4 = new Select(findElement4);
		dropDown4.selectByIndex(1);

	}

	@When("user should select number of adults per room")
	public void user_should_select_number_of_adults_per_room() {
		WebElement findElement5 = driver.findElement(By.id("adult_room"));
		Select dropDown5 = new Select(findElement5);
		dropDown5.selectByIndex(1);

	}

	@When("user should select number of childrens per room")
	public void user_should_select_number_of_childrens_per_room() {
		WebElement findElement6 = driver.findElement(By.id("child_room"));

		Select dropDown6 = new Select(findElement6);
		dropDown6.selectByIndex(1);

	}

	@Then("user should search hotel")
	public void user_should_search_hotel() {
		WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
		search.click();
	}

	@Then("user should select the hotel and continue to next page")
	public void user_should_select_the_hotel_and_continue_to_next_page() {
		WebElement radioButton = driver.findElement(By.id("radiobutton_0"));
		radioButton.click();

		WebElement search = driver.findElement(By.id("continue"));
		search.click();

	}

	@When("user should enter personal details")
	public void user_should_enter_personal_details() {
		driver.findElement(By.id("first_name")).sendKeys("subash");
		driver.findElement(By.id("last_name")).sendKeys("chandrabose");
		driver.findElement(By.id("address")).sendKeys("Thoraipakkam,chennai-60047");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		WebElement findElement7 = driver.findElement(By.id("cc_type"));
		Select dropDown7 = new Select(findElement7);
		dropDown7.selectByIndex(1);
		WebElement findElement8 = driver.findElement(By.id("cc_exp_month"));
		Select dropDown8 = new Select(findElement8);
		dropDown8.selectByIndex(1);
		WebElement findElement9 = driver.findElement(By.id("cc_exp_year"));
		Select dropDown9 = new Select(findElement9);
		dropDown9.selectByIndex(11);
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
	}

	@Then("user should click on booking")
	public void user_should_click_on_booking() throws InterruptedException {
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
	}

	@Then("user should click on my itenary")
	public void user_should_click_on_my_itenary() {
		WebElement myItenary = driver.findElement(By.id("my_itinerary"));
		myItenary.click();

	}
	@Then("get booking details from itenary")
	public void get_booking_details_from_itenary() {
		/*WebElement findElement = driver.findElement(By.id("check_all"));
		Select sel= new Select(findElement);
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		System.out.println(firstSelectedOption);*/
		
		
		List<WebElement> findElements = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < findElements.size(); i++) {
			WebElement webElement = findElements.get(i);
			String text=webElement.getText();
			//System.out.println(text);
			if (text.equals("Order Id")) {
				System.out.println(text);
				
			}
			
		}
		
		
		
		
		
		
				}
			    
	
	}

	


