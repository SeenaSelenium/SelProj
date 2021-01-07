package selTraining1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test32 {
	
 public static void main(String[] args) {
	 
	 	WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement tableGrid = driver.findElement(By.id("product"));
		int rowCount = tableGrid.findElements(By.tagName("tr")).size();
		System.out.println("Number of rows in table are : " + rowCount);
		
		WebElement thirdRow = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]"));
		int colCount = thirdRow.findElements(By.tagName("td")).size();
		System.out.println("Number of columns in table are :" + colCount);
		
		
		for(int i=0;i<colCount;i++)
		{
			String thirdRowValues = thirdRow.findElements(By.tagName("td")).get(i).getText();
			System.out.print(thirdRowValues + "   ");
		}
		
		

		    
 }
}

