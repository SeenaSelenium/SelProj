package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel_test11 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.jqueryfaqs.com/demos/112/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement forhover = driver.findElement(By.id("lnkCategories"));
		
		Actions hover = new Actions(driver);
		hover.moveToElement(forhover).perform();
		
		driver.findElement(By.linkText("General")).click();
		
	}

}
