package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_test6 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("Example 1:")).click();
		driver.findElement(By.cssSelector("#start > button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#finish > h4")));
		
		
		
		String ActualWord = driver.findElement(By.cssSelector("#finish > h4")).getText();
		String ExpectedWord = "Hello World!";
		if (ActualWord.equals(ExpectedWord))
		{
			System.out.println("Test case passed");
		}
		else
			System.out.println("Test case failed");
		driver.close();
		
		
	}

}
