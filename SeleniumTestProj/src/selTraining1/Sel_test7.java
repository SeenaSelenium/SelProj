package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test7 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("Javadoc")).click();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.partialLinkText("chrome")).click();
		driver.switchTo().defaultContent();
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.partialLinkText("webdriven")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Timer")).click();
		
		driver.close();
		
		
	}

}
