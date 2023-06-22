package org.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\Win-UEFI\\eclipse-workspace\\Data\\excel\\work.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wa = new XSSFWorkbook(fis);
		Sheet sheet = wa.getSheetAt(0);
		Row row = sheet.getRow(1);
		System.out.println(row.getCell(1));

	}

}
