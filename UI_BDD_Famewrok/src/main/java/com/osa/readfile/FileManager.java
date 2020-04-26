package com.osa.readfile;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileManager {
	public static void main(String[] args) {
		String s=FileManager.readExcel("Test.xlsx", "A:1");
		System.out.println(s);
	}
	public static String readExcel(String fileName,String cellName) {
		String cellValue="";
		String newCellName=cellName.replace(":", "");
		try {
		InputStream excelFileToRead=new FileInputStream("src/test/resources/Files/"+fileName);
		XSSFWorkbook wb=new XSSFWorkbook(excelFileToRead);
		XSSFSheet sheet=wb.getSheetAt(0);
		CellReference cellReference=new CellReference(newCellName);
		Row row=sheet.getRow(cellReference.getRow());
		Cell cell=row.getCell(cellReference.getCol());
		cellValue=cell.getStringCellValue();
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
				
				
		return cellValue;
	}

}
