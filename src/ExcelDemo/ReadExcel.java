package ExcelDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public ReadExcel(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws Exception {
		try{
		FileInputStream fis = new FileInputStream("D:\\Excel\\Test.xlsx");
		
		//create workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//create sheet
		XSSFSheet sh = wb.getSheetAt(0);
		
		 // getRow() specify which row we want to read.
		 // and getCell() specify which column to read.
		 // getStringCellValue() specify that we are reading String data.
		 
		
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
	}
	catch(Exception e){
		System.out.println(e.getMessage());
		
	}

}

	public int getrow(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
