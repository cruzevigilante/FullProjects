package org.upload;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UploadFileAndDownload {

	public static void main(String[] args) throws InterruptedException, IOException {
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Browser Launch\\Driver\\chromedriver.exe");
		String downloadPath=System.getProperty("user.dir");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options=new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://pdftoimage.com/");
		driver.findElement(By.cssSelector("label[aria-label='Upload Files']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\subas\\Downloads\\FileUpload.exe");
		Thread.sleep(5000); 
	
		driver.findElement(By.cssSelector("button[aria-label='Download All'] span[class='button__text']")).click();
		File file = new File(downloadPath+"/pdftoimage.zip");
		
		if(file.exists()) {
			System.out.println("FileFound");
		}
		
		
	}

}
