package selTraining1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_test19 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		//to select any date will be done later
		//driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/div/a/span")).click();//clicks on arrow for month of may
		//driver.findElement(By.xpath("//td[@data-month='4']")).findElement(By.linkText("15")).click();
		
		
		
		//driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		//new locator for date
		driver.findElement(By.cssSelector("input[id='custom_date_picker_id_1']")).click();
		WebElement monthSelector = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/div/div"));
		
		while(!monthSelector.getText().contains("December"))
		{
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
			////div[@id='ui-datepicker-div']/div[2]/div/a/span
		}
		
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
				
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("To date is disabled");
		}
		else
		{
			System.out.println("To date is enabled");
		}
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement Adultcount = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select dd = new Select(Adultcount);
		dd.selectByIndex(1);
		
		WebElement curr = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dd1= new Select(curr);
		dd1.selectByIndex(3);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		driver.switchTo().alert().accept();
		driver.findElement(By.id("divpaxinfo")).click();
		dd.selectByIndex(3);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
}
