package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel_test15 {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/tooltip-and-double-click/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement el = driver.findElement(By.id("rightClickBtn"));
		Actions action = new Actions(driver);
		
		action.contextClick(el).perform();
		driver.findElement(By.linkText("Copy me")).click();
		
	}
}
