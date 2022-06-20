package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class Read_All_Data {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Karthik\\eclipse-workspace\\Maven_Project\\Rough Data.xlsx");
	
		FileInputStream fis = new FileInputStream(f);
		
		// Interface     //class
		Workbook w = new XSSFWorkbook(fis); // upcasting
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	
		// outer loop
		for(int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			// inner loop
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
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
	}
}
