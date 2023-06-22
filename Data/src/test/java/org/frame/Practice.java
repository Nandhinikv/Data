package org.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {
	public static void main(String[] args) throws Exception {
		File v = new File("C:\\Users\\Win-UEFI\\Desktop\\data.xlsx");
		FileInputStream f = new FileInputStream(v);
		Workbook wa = new XSSFWorkbook(f);
		Sheet sheet = wa.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		System.out.println(cellType);
		int code = cellType.getCode();
		if (code==0) {
		if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
			String format2 = format.format(date);
			System.out.println(format2);
		} 
		FileOutputStream file = new FileOutputStream(v);
		wa.write(file);
		wa.close();

	}
	}}
