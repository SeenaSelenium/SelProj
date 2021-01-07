package selTraining1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test30 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		WebElement monthSelector = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div/div"));
		////div[@class='ui-datepicker-group ui-datepicker-group-first']/div/div
		while(!monthSelector.getText().contains("December"))
		{
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			////div[@id='ui-datepicker-div']/div[2]/div/a/span
		}
		
		//traversing to a child using css selector when child has a valid attribute that can be used ..that is not dynamic
		List<WebElement> fromDates = driver.findElements(By.cssSelector("div[class='ui-datepicker-group ui-datepicker-group-first'] td[data-handler='selectDay']"));
		int dateCount = fromDates.size();
		for(int i=0;i<=dateCount;i++)
		{
			String dateTobeSel = fromDates.get(i).getText();
			if(dateTobeSel.equalsIgnoreCase("25"))
			{
				fromDates.get(i).click();
				break;
			}
		}
	}
}
