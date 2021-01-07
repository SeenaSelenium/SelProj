package selTraining1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel_test26 {
	
	public static void main(String[] args) {
		//drag and drop and enter capital leters using actions class
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	WebElement sourcept = driver.findElement(By.xpath("//div[@id='draggable']/p"));
	WebElement targetpt = driver.findElement(By.id("droppable"));
	Actions a = new Actions(driver);
	a.dragAndDrop(sourcept, targetpt).build().perform();
	driver.switchTo().defaultContent();
	a.moveToElement(driver.findElement(By.name("s"))).click().keyDown(Keys.SHIFT).sendKeys("hello").sendKeys(Keys.ENTER).build().perform();
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> listofhandles= handles.iterator();
	listofhandles.next();
	String ChildHandle = listofhandles.next();
	driver.switchTo().window(ChildHandle);
	System.out.println(driver.findElement(By.xpath("//h1[@class='page-title']")).getText());
	
	
	
	}

}
