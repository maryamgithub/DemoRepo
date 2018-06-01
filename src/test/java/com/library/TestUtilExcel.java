package com.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.IIOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtilExcel {
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	private static String path;

	public TestUtilExcel(String TESTDATA_SHEET_PATH) {
		path = TESTDATA_SHEET_PATH;
	}

	public Object[][] getTestdata(String SheetName) throws Exception {
		FileInputStream file = null;
		try {
			file = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IIOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(SheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				System.out.println("data: " + data[i][k]);
			}
		}
		return data;
	}
	
}
