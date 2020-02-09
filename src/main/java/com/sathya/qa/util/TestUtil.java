package com.sathya.qa.util;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


import com.sathya.qa.base.BaseClass;

public class TestUtil extends BaseClass{
	
	public static File excel;
	public static File file;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static FileInputStream fin;
	
	public static long IM_WT=5000;
	public static long PL_WT=60000;


	public static void excelwrite(String sheetName,String tableXpath) {
		try {
			excel=new File("D:\\Eclipse2018-09\\SathyaMain\\src\\main\\java\\com\\sathya\\qa\\testdata"
					+ "\\sathya.xlsx");
			FileInputStream fin=new FileInputStream(excel);
			wb=new XSSFWorkbook(fin);
			sheet=wb.createSheet(sheetName);
			WebElement table=driver.findElement(By.xpath(tableXpath));
			
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			for(int i=0;i<rows.size();i++) {
				List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
				sheet.createRow(i);
				for(int j=0;j<columns.size();j++) {
					String t=columns.get(j).getText();
					sheet.getRow(i).createCell(j).setCellValue(t);	
				}
				System.out.println();
			}
			FileOutputStream fout=new FileOutputStream(excel);
			wb.write(fout);
		} catch (Exception e) {
			System.out.println("Error in excel"+e.getMessage());
		
	}
		
		
}
	public static String getdata(String sheetname,int rowNum,int cellNum) {
		
		try {
			excel=new File("D:\\Eclipse2018-09\\SathyaMain\\src\\main\\java\\com\\sathya\\qa\\testdata"
					+ "\\sathya.xlsx");
			fin=new FileInputStream(excel);
			wb=new XSSFWorkbook(fin);
			sheet=wb.getSheet(sheetname);
			
		} catch (Exception e) {
			System.out.println("excel read error "+e.getMessage());
		} if(sheet.getRow(rowNum).getCell(cellNum).getCellType()==sheet.getRow(rowNum).getCell(cellNum).CELL_TYPE_NUMERIC)
		{
		String data=String.valueOf((long)sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue());
		return data;
		}
		else {
			String data=sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
			return data;
		}
		
	}
	
	public static int lastrow(String sheetname) {
		try {
			excel=new File("D:\\Eclipse2018-09\\SathyaMain\\src\\main\\java\\com\\sathya\\qa\\testdata"
					+ "\\sathya.xlsx");
			fin=new FileInputStream(excel);
			wb=new XSSFWorkbook(fin);
			sheet=wb.getSheet(sheetname);
			
		} catch (Exception e) {
			System.out.println("excel read error "+e.getMessage());
	}
	return sheet.getLastRowNum();
	}
	public static int lastcell(String sheetname) {
		try {
			excel=new File("D:\\Eclipse2018-09\\SathyaMain\\src\\main\\java\\com\\sathya\\qa\\testdata"
					+ "\\sathya.xlsx");
			fin=new FileInputStream(excel);
			wb=new XSSFWorkbook(fin);
			sheet=wb.getSheet(sheetname);
			
		} catch (Exception e) {
			System.out.println("excel read error "+e.getMessage());
	}
	return sheet.getRow(0).getLastCellNum();
	}
	
	public static void screenshot(String fileName) {
		
		try {
			 file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,new File("D:\\Eclipse2018-09\\SathyaMain\\"
					+ "src\\main\\java\\com\\sathya\\qa\\testdata"+fileName+".jpg"));
		} catch (Exception e) {
			
			System.out.println("screenshot error "+e.getMessage());
		}
}
}