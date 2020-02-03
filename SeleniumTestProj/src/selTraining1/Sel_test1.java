package selTraining1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Facebook - Log In or Sign Up";
		String CurrentURL = driver.getCurrentUrl();
		//driver.findElement(By id)
		
		
		if (ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("TestCase Passed");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
		
		System.out.println(CurrentURL);
		driver.close();
	}

}
