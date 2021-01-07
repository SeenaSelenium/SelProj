package selTraining1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sel_test29 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("travel_date")).click();
		
		//selecting a month and year
		WebElement monYear = driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[2]"));
		while(!monYear.getText().contains("December 2021"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[3]")).click();
		}
		
		//selecting the date
		List<WebElement> dates = driver.findElements(By.xpath("//td[@class='day']"));
		int numOfDates = dates.size();
		for(int i=0;i<=numOfDates;i++)
		{
			String toBeSelDate = dates.get(i).getText();
			if(toBeSelDate.equalsIgnoreCase("25"))
			{
				dates.get(i).click();
				break;
			}
		}
		
		
		
	}
}
