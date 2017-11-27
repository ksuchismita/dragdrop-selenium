package ExcelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	Actions ac = new Actions(driver);
	driver.get("https://jqueryui.com/slider/#colorpicker");
	WebElement drag = driver.findElement(By.xpath(".//*[@id='green']/span"));
	Thread.sleep(2000);
	
	ac.clickAndHold(drag).moveByOffset(40, 0).release(drag).build().perform();
	Thread.sleep(2000);
	driver.quit();
}
}
