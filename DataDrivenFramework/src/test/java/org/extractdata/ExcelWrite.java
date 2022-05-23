package org.extractdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
                  
		File file = new File("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\DataDrivenFramework\\AmazonHomework.xlsx");
		FileInputStream Stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(Stream);
        Sheet sheet =book.createSheet("FirstSheet");
        
        Row row=sheet.createRow(0);
        Cell cc=row.createCell(0);
        cc.setCellValue("Name");
        FileOutputStream fos = new FileOutputStream(file);
        book.write(fos);
        System.out.println("Created");
        
        
	}

}
