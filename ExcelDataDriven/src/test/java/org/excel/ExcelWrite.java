package org.excel;

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
		
		File file =new File("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\ExcelDataDriven\\target\\ExcelPractise.xlsx");
		FileInputStream stream= new FileInputStream(file);
		Workbook book= new XSSFWorkbook(stream);
		Sheet sheet=book.createSheet();
		Object[][] data={{"Name","Email","PhoneNumber","cgpa"},{"Subash","subash123@gmail.com",8489081984l,7.2f},{"Cruze","cruze@gmail.com",8489081986l,8.5f}};
		
		for (int i = 0; i < data.length; i++) {
			
			Row row=sheet.createRow(i);
			for (int j = 0; j < data.length; j++) {
				
				Cell cell=row.createCell(j);
				Object value=data[i][j];
				if (value instanceof String) {
					
					cell.setCellValue((String) value);
	
				} else if (value instanceof Float) {
					
					cell.setCellValue((Float) value);

				}else if(value instanceof Long) {
					cell.setCellValue((Long) value);

				}

			}
         }
		FileOutputStream fo= new FileOutputStream(file);
		book.write(fo);
}

}
