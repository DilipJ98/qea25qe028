package com.externalfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataXl {
	public static void main(String[] args) throws IOException {
		ReadDataXl obj = new ReadDataXl();
		obj.readData();
	}
	public Object[][] readData() throws IOException {
		File file = new File("C:/Users/Dilip/Desktop/credentials.xlsx");
		FileInputStream input = new FileInputStream(file);
		
		XSSFWorkbook book = new XSSFWorkbook(input);
		
		Sheet sheet = book.getSheetAt(0);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
		
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++ ) {
			Row row = sheet.getRow(i);
			for (int k = 0; k < row.getLastCellNum(); k++) {
				Cell cell = row.getCell(k);
				data[i - 1][k] = cell.toString();
			}
		}
		
		book.close();
		input.close();
	
		return data;
		
	}
}

//XLSX -> XSSFWORK
//XLSM -> HSSFwork