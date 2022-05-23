package org.adactin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login extends BaseClass {
	@Test
	public void userLogin()  throws InterruptedException {
		
		launchBrowser();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("subashbose");
		driver.findElement(By.id("password")).sendKeys("subash");
		driver.findElement(By.id("login")).click();
		WebElement findElement = driver.findElement(By.id("location"));
		
		Select dropDown = new Select(findElement);
		dropDown.selectByIndex(1);
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select dropDown2 = new Select(findElement2);
		dropDown2.selectByIndex(1);
		WebElement findElement3 = driver.findElement(By.id("room_type"));
		Select dropDown3 = new Select(findElement3);
		dropDown3.selectByIndex(1);
		WebElement findElement4 = driver.findElement(By.id("room_nos"));
		Select dropDown4 = new Select(findElement4);
		dropDown4.selectByIndex(1);
		WebElement findElement5 = driver.findElement(By.id("adult_room"));
		Select dropDown5 = new Select(findElement5);
		dropDown5.selectByIndex(1);
		WebElement findElement6 = driver.findElement(By.id("child_room"));

		Select dropDown6 = new Select(findElement6);
		dropDown6.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("subash");
		driver.findElement(By.id("last_name")).sendKeys("chandrabose");
		driver.findElement(By.id("address")).sendKeys("Thoraipakkam,chennai-60047");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		WebElement findElement7 = driver.findElement(By.id("cc_type"));
		Select dropDown7= new Select(findElement7);
		dropDown7.selectByIndex(1);
		WebElement findElement8 = driver.findElement(By.id("cc_exp_month"));
		Select dropDown8= new Select(findElement8);
		dropDown8.selectByIndex(1);
		WebElement findElement9 = driver.findElement(By.id("cc_exp_year"));
		Select dropDown9= new Select(findElement9);
		dropDown9.selectByIndex(11);
        driver.findElement(By.id("cc_cvv")).sendKeys("123");
        driver.findElement(By.id("book_now")).click();
        Thread.sleep(3000);
   //driver.findElement(By.id("logout")).click();
        driver.close();
		
		
		
	}

}
