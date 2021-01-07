package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_test20 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Adults = driver.findElement(By.id("Adults"));
		Select dd = new Select(Adults);
		dd.selectByValue("2");
		
		WebElement Children = driver.findElement(By.id("Childrens"));
		Select dd1= new Select(Children);
		dd1.selectByIndex(2);
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("American Airlines");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("SearchBtn")).click();
		String error = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(error);
		
	}
}
