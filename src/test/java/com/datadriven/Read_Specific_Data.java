package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Specific_Data {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Karthik\\eclipse-workspace\\Maven_Project\\Rough Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		// Interface     //class
		Workbook w = new XSSFWorkbook(fis); // upcasting
		
		Sheet sheetAt = w.getSheetAt(0);
				
		Row row = sheetAt.getRow(0);
				
		Cell cell = row.getCell(1);
				
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(cellType.STRING)){
			
			 String value = cell.getStringCellValue(); // here we are giving cell to call, because data's are stored in cell only, not in cell type.
			 System.out.println(value);
			 
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double value = cell.getNumericCellValue();
			int num = (int) value; //narrowing typecasting
			System.out.println(num);
			
		}	
	}
}