package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel_test14 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement el = driver.findElement(By.linkText("text fields"));
		Actions action = new Actions(driver);
		
		action.contextClick(el).perform();
		driver.findElement(By.linkText("Open link in new tab")).click();
		
	}

	}

