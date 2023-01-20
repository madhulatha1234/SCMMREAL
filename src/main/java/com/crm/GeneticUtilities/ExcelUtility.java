package com.crm.GeneticUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelUtility {
	/**
	 * 
	 * @param SheetName
	 * @param RowNo
	 * @param ColumnNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String SheetName, int RowNo,int ColumnNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row ro = sh.getRow(RowNo);
		Cell cell = ro.getCell(ColumnNo);
		String value = cell.getStringCellValue();
		return value;
	}
	public void writedataintoexcel(String SheetName,int RowNo,int ColumnNo,String Data) throws Throwable {
		FileInputStream fis=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row ro = sh.createRow(RowNo);
		Cell cell = ro.createCell(ColumnNo);
		cell.setCellValue(Data);
		FileOutputStream fos=new FileOutputStream(IPathConstant.EXCELPATH);
	}
	public int getLastRowNo(String SheetName) throws Throwable {
		FileInputStream fis=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int count = sh.getLastRowNum();
		return count;
	}
	public Map<String,String>getList(String SheetName,int keyCell,int valueCell) throws Throwable, IOException{
		FileInputStream fis=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int count = sh.getLastRowNum();
		Map<String,String> map=new HashMap<String,String>();
		for(int i=0;i<=count;i++) {
			String key=sh.getRow(i).getCell(keyCell).getStringCellValue();
			String value=sh.getRow(i).getCell(valueCell).getStringCellValue();
			map.put(key, value);
		}
		return map;	

	}
	public void readMultipleData(WebDriver driver,String SheetName,int columnNO1,int columnNO2) throws Throwable {
		FileInputStream fis=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		String key=null;
		String value=null;
		for(int i=0;i<=sh.getLastRowNum();i++) {
			key = sh.getRow(i).getCell(columnNO1).getStringCellValue();
			value = sh.getRow(i).getCell(columnNO2).getStringCellValue();
			driver.findElement(By.id(key)).sendKeys(value);
		}
	}
	public Object[][] readMultipleDataInDataprovider(String SheetName) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		//Row read from 0,1
		//cell read from 1,2
		int lastrow = sh.getLastRowNum()+1;
		System.out.println("last row   "+lastrow);
		int lastcell = sh.getRow(0).getLastCellNum();
		System.out.println("last cell   "+lastcell);
		Object[][] obj = new Object[lastrow][lastcell];
		for(int i=0;i<lastrow;i++) {
			for(int j=0;j<lastcell;j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
}
