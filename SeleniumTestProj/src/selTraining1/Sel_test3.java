package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test3 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Boolean IsButtonPresent = driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		if (IsButtonPresent == true)
		{
			String Tagname = driver.findElement(By.xpath("//input[@type='submit']")).getTagName();
			String ActualTagname = "input";
			Boolean ButtonEnabled = driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
			
			if (Tagname.equals(ActualTagname) & ButtonEnabled == true)
			{
				System.out.println("Login is a button and enabled");
			}
			
		}
		else
		{
			System.out.println("Login button not present");
		}
		
		driver.close();
	}

}
