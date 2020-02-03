package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test5 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("DRESSES")).click();
		driver.findElement(By.partialLinkText("conditions of use")).click();
		
		String ActualText = driver.findElement(By.cssSelector("#center_column > div > h1")).getText();
		
		String ExpectedText = "TERMS AND CONDITIONS OF USE";
		if(ActualText.equals(ExpectedText))
		{
			System.out.println("Test case passed");
		}
		else
			System.out.println("Test case failed");
		
		driver.close();
		
	}

}
