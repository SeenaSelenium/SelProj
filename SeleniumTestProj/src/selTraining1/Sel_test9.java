package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Sel_test9 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Seena");
		driver.findElement(By.name("lastName")).sendKeys("Abraham");
		WebElement countrydd = driver.findElement(By.name("country"));
		Select dropdown = new Select(countrydd);
		
		String FirstValue = dropdown.getFirstSelectedOption().getText();
		System.out.println(FirstValue);
		
		dropdown.selectByVisibleText("INDIA");
		
		dropdown.selectByValue("213");
		
		dropdown.selectByIndex(2);
		
		String WrapText = dropdown.getWrappedElement().getText();
		System.out.println(WrapText);
		
		
		driver.close();
		
		
		
		
	}

}
