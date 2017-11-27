package ExcelDemo;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class ExcelFacebook {
 
WebDriver driver;
XSSFWorkbook wb;
XSSFSheet sh1;
int numrow;
String username;
String password;
 
@BeforeTest
public void Setup()
 
{
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.facebook.com");
}
 
@Test(dataProvider="testdata")
public void TestFireFox(String uname,String password1)
 
{
 
driver.findElement(By.id("email")).clear();
driver.findElement(By.id("email")).sendKeys(uname);
driver.findElement(By.id("pass")).clear();
driver.findElement(By.id("pass")).sendKeys(password1);
}
 
@DataProvider(name="testdata")
public Object[][] TestDataFeed(){
 
try {
 
// load workbook
wb=new XSSFWorkbook(new File("D:\\Excel\\Facebooddata.xlsx"));
 
// load sheet in my case I am referring to first sheet only
sh1= wb.getSheetAt(0);
 
// get number of rows so that we can run loop based on this
sh1.getRow(0).getCell(0).getStringCellValue();
}
catch (Exception e)
 
{
e.printStackTrace();
}
 
// Create 2 D array and pass row and columns
Object [][] facebookdata=new Object[2][3];
 
// This will run a loop and each iteration  it will fetch new row
for(int i=0;i<5;i++){
 
// Fetch first row username
facebookdata[i][0]=sh1.getSheetName();
// Fetch first row password
facebookdata[i][1]=sh1.getSheetName();
 
}
 
// Return 2d array object so that test script can use the same
return facebookdata;
}
 
@AfterTest
public void QuitTC(){
 
// close browser after execution
driver.quit();
}
 
}
 

 
