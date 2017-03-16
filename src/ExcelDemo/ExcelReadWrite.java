package ExcelDemo;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.sl.usermodel.Sheet;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelReadWrite {
		public static void main(String args[]) throws Exception{
			File src = new File("D:\\Excel\\Test.xlsx");
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet xs = wb.getSheetAt(0);
			int rowcount = xs.getLastRowNum();
			System.out.println("rowcount" +rowcount);
		
			for(int i=0;i<rowcount;i++){
				String s = xs.getRow(i).getCell(0).getStringCellValue();
				System.out.println("value is :" +i +"data of cell is:" +s);
				
				
			}
			
			int i=0;
			String s = xs.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Get all row data:" +s);
			String s1 = xs.getRow(1).getCell(1).getStringCellValue();
			System.out.println("Get all column data:" +s1);
			fis.close();
			
		}

	}



