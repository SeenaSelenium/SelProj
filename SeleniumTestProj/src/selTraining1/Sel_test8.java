package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver .findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		Thread.sleep(5000);
		String AlertText = driver.switchTo().alert().getText();
		System.out.println(AlertText);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		
	}

}
