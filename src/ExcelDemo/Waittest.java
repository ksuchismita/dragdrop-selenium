package ExcelDemo;



import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waittest {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println("implicit wait for 10 seconds");
		
		driver.findElement(By.className("sbib_b")).sendKeys("selenium");
		//Thread.sleep(10000);
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("sbib_b")));
		
		
		driver.findElement(By.className("sbico-c")).click();
		
	}
	
	
	
	}


