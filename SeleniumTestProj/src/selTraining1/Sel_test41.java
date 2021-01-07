package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test41 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Basic Auth")).click();
		String actualtxt = driver.findElement(By.xpath("//div[@class='example'][h3][p]")).getText().split("\n")[1];
		if (actualtxt.equalsIgnoreCase("Congratulations! You must have the proper credentials."))
		{
			System.out.println("Windows popup was handled");
		}
		else
		{
			System.out.println("Windows popup was not handled");
		}
		driver.close();
	}
}
