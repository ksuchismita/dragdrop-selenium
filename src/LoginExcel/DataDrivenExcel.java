package LoginExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenExcel {
	WebDriver driver;
	@Test(dataProvider = "testdata")
		public void Demoproject(String usname, String password) throws Exception{
		
		driver= new FirefoxDriver();
		
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//A[@class='_2k0gmP'][text()='Log In']")).click();
			driver.findElement(By.xpath("(//INPUT[@type='text'])[2]")).sendKeys(usname);
			driver.findElement(By.xpath("//INPUT[@type='password']")).sendKeys(password);
			driver.findElement(By.xpath("//BUTTON[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
			Thread.sleep(2000);
			
			System.out.println("login sucessfully");
		}
	
	/*@Test
	public void verify(){
		WebElement actual= driver.findElement(By.xpath("//DIV[@class='JAUzCh'][text()='You are not registered with us. Please sign up.']"));
		String expected = "You are not registered with us";
		Assert.assertEquals(actual, expected);
		System.out.println("matches actual with expected");
	}*/
		/*@AfterMethod
		public void programterminate(){
			driver.quit();
	}*/
	@DataProvider(name="testdata")
	public Object[][] testdata(){
		ReadExcelFileDemo config = new ReadExcelFileDemo("D:\\ChromeExcelData_Flipcart.xlsx");
		int row = config.getRowCount(1);
		Object[][] credential= new Object[row][2];
		for(int i=0;i<row;i++){
			credential[i][0]=config.getdata(0, i, 0);
			credential[i][1]=config.getdata(0, i, 1);
			
		}
		return credential;
		
	}
}
	