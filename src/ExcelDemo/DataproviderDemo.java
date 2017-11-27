package ExcelDemo;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;


public class DataproviderDemo {
	
	@Test(dataProvider="facebooklogin")
	public void facebook(String Email, String password){
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Email");
		  driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("password");
		  driver.findElement(By.xpath(".//*[@id='u_0_r']")).click();
		  System.out.println(driver.getTitle());
		  
		
	}
	@DataProvider(name="facebooklogin")	public Object[][] passdata(){
		Object[][] data = new Object[2][2];
		data[0][0]="k.suchismita";
		data[0][1]="suchi";
		
		data[1][0]="k.suchismita567@gmail.com";
		data[1][1]="suchi@123";
		
		return data;
		
	}

}
