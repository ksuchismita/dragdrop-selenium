package ExcelDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataExcelSheet {

	public static void main(String[] args) throws Exception {
		try{
		
	FileInputStream fis = new FileInputStream("D:\\Excel\\Test.xlsx");
    XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheetAt(0);
	
	//create cell will create column
	//setcell value will set the value
	sh.getRow(0).createCell(0).setCellValue("hello");
	sh.getRow(0).createCell(1).setCellValue("bye");
	sh.getRow(1).createCell(0).setCellValue("uname");
	sh.getRow(1).createCell(1).setCellValue("psw");
	//save file where we want
	FileOutputStream fos = new FileOutputStream(new File("D:\\Excel\\WriteExcel.xlsx"));
     //write content
	wb.write(fos);
	//close file
	fos.close();
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	}
}
