package LoginExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class PrintExcelDemo {
	@Test
public void exceldata() throws Exception
{
FileInputStream fis = new FileInputStream("D:\\ChromeExcelData_Flipcart.xlsx");
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sh = wb.getSheetAt(0);
//find total row
int rowcount = sh.getFirstRowNum()+sh.getLastRowNum();
//create a loop
for(int i=0;i<rowcount+1;i++)
{
	Row row= sh.getRow(i);
	
	for(int j=0;j<row.getLastCellNum();j++){
		Cell cell = row.getCell(j);
		switch(cell.getCellType()){
			case Cell.CELL_TYPE_STRING:
			System.out.println("get string value"+row.getCell(j).getStringCellValue());
			
				break;
				
			case Cell.CELL_TYPE_NUMERIC:
				System.out.println("get numeric value"+row.getCell(j).getNumericCellValue());
				
				break;
				
		}
		System.out.println(row.getCell(j).getStringCellValue());
	}
	//System.out.println();
}

}

	
	
	

}
