package selTraining1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test12 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		String ParentWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> Handles = driver.getWindowHandles();
		Object[] WindowHandles = Handles.toArray();
		String ChildWindow = WindowHandles[1].toString();
		
		driver.switchTo().window(ChildWindow);
		String ActualContent = driver.findElement(By.cssSelector("body > div > h3")).getText();
		String ExpectedContent  = "New Window";
		
		if (ActualContent.equals(ExpectedContent))
		{
			System.out.println("TestCase Passed");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
				
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		driver.navigate().back();
		
		driver.close();
	}
	
	
	

}
