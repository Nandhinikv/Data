package org.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenread {
	
	public static void main(String[] args) throws Exception {
		
		 
		
		File f= new File("C:\\Users\\Win-UEFI\\eclipse-workspace\\Data\\excel\\work.xlsx");
			
		FileInputStream fis= new FileInputStream(f);
		
		Workbook wa=new XSSFWorkbook(fis);
		Sheet sheet = wa.getSheetAt(0);
		Iterator<Row> rowiterator = sheet.iterator();
		while (rowiterator.hasNext()) {
			Row row = (Row) rowiterator.next();
			Iterator<Cell> columnIterator = row.cellIterator();
			while (columnIterator.hasNext()) {
				Cell cell = (Cell) columnIterator.next();
				System.out.println(cell);
				
				
			}
			
	}

	}
	




}
