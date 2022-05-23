package org.base;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class FbLoginPage extends BaseClass {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		browserLaunch("https://fb.com");
		PageObjects po= new PageObjects();
		po.getUsername().sendKeys(excelData("sheet1",0,0));
		po.getPassword().sendKeys(excelData("sheet1",0,1));
		po.getLogin().click();
		
	}

}
