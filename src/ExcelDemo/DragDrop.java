package ExcelDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String args[]) throws Exception{
		WebDriver driver = new FirefoxDriver();
		Actions ac = new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		/*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(drag, drop).perform();
		ac.doubleClick(drag);
		ac.contextClick(drag);*/
		
		Thread.sleep(10000);
		
		driver.findElement(By.linkText("Resizable")).click();
		System.out.println("click the button");
		System.out.println("wait second");
		WebElement drag1 = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		Thread.sleep(10000);
		ac.clickAndHold(drag1).moveByOffset(50, 20).release(drag1).build().perform();
		
		
		
		/*WebElement demo = driver.findElement(By.linkText(".//*[@id='menu-top']/li[1]/a"));
		ac.doubleClick(demo);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		*/
		
	}

}
