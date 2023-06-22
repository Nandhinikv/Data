package org.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivenwrite {

	public static void main(String[] args) throws Exception {
		File v = new File("C:\\Users\\Win-UEFI\\Desktop\\file.xlsx");
		Workbook wa = new XSSFWorkbook();
		Sheet sheet = wa.createSheet("fh");
		sheet.createRow(0).createCell(0).setCellValue("nandhini");
		sheet.createRow(1).createCell(0).setCellValue("karthikeyan");
		FileOutputStream fo = new FileOutputStream(v);
		wa.write(fo);
		wa.close();
	}

}
