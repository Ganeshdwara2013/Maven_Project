package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Karthik\\eclipse-workspace\\Maven_Project\\Rough Data.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet createSheet = w.createSheet("User Info");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Aara");
		
		w.getSheet("User Info").getRow(0).createCell(1).setCellValue("123");
		
		w.getSheet("User Info").createRow(1).createCell(0).setCellValue("Kasthuri");
		
		w.getSheet("User Info").getRow(1).createCell(1).setCellValue("456");
		
		w.getSheet("User Info").createRow(2).createCell(0).setCellValue("Kishore");
		
		w.getSheet("User Info").getRow(2).createCell(1).setCellValue("789");
		
		w.getSheet("User Info").createRow(3).createCell(0).setCellValue("Ganesh");
		
		w.getSheet("User Info").getRow(3).createCell(1).setCellValue("368");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
	
		w.close();
				
	}

}