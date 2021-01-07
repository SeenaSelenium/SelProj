package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_test28 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("checkBoxOption2")).click();
		String selectedOption = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		System.out.println(selectedOption);
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select dd = new Select(dropDown);
		dd.selectByValue(selectedOption);
		driver.findElement(By.id("name")).sendKeys(selectedOption);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		if(alertText.contains(selectedOption))
		{
			System.out.println("Alert Text contains the option selected");
		}
		driver.switchTo().alert().accept();
	}

}
