package LoginExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileDemo {
	XSSFWorkbook wb;
	XSSFSheet sh;
	public ReadExcelFileDemo(String excelpath){
		try{
			File src = new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
public String getdata(int sheetnumber, int row, int column){
	sh=wb.getSheetAt(sheetnumber);
	String data= sh.getRow(row).getCell(column).getStringCellValue();
	
	return data;
	
	
	
}
public int getRowCount(int sheetindex){
	int rows=wb.getSheetAt(sheetindex).getLastRowNum();
	rows=rows+1;
	return rows;
	
}
}
