package com.Actitime.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class contains 
 * @author ADMIN
 *
 */

public class FileLibrary {
	/**
	 * This Method is  Generic Method which is user to read data from property file 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String ReadDataFromProprtyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/commondata1.property");
		Properties p=new Properties();
		p.load(fis);
	  String value = p.getProperty(key);
	  return value;
	}
	/**
	 * this method is generic method which is used to read data from excelsheet
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String ReadDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("/Testdata/textdata1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
}
