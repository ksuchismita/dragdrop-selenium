package ExcelDemo;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Datadriventestdemo {
	
	WebDriver driver;
	Workbook wb;
    Sheet sh;
    int rownum;
    String  username;
    String password;
    
    public void setup()
    {
    	driver=new FirefoxDriver();
    	driver.get("");
    	
    }
    
    @Test
    
    public void testdemo()
    {
    	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("abc");
    	
    }
}
