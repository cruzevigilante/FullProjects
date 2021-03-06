package org.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone13", Keys.ENTER);
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

		ArrayList<String> s = new ArrayList<String>();
		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();
			s.add(text);
		}

		List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		ArrayList<Integer> s1 = new ArrayList<Integer>();

		for (int j = 0; j < findElements2.size(); j++) {
			String text2 = findElements2.get(j).getText().replace("₹", "").replace(",", "");
			int parseInt = Integer.parseInt(text2);
			s1.add(parseInt);

		}

		Map<Integer, String> m = new TreeMap<Integer, String>();

		for (int i = 0; i < s1.size(); i++) {
			m.put(s1.get(i), s.get(i));

		}
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}

	}

}
