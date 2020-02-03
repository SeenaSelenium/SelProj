package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel_test16 {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/tooltip-and-double-click/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement el = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		
		action.doubleClick(el).perform();
		driver.switchTo().alert().accept();
		
		//driver.close();
		
	}

}
