package org.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	public static void main(String[] args) throws Exception {
		File f= new File("C:\\Users\\Win-UEFI\\eclipse-workspace\\Data\\excel\\work.xlsx");
		
		FileInputStream fis= new FileInputStream(f);
		
		Workbook wbb=new XSSFWorkbook(fis);
		Sheet sheet = wbb.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("no.of row"+lastRowNum);
		
		
		
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
					
			       DataFormatter da=new DataFormatter();
			       String value = da.formatCellValue(cell);
				System.out.println(value);
				
			}
			wbb.close();
			
			
		}
		
		
		
	}

}
