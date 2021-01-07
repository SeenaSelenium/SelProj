package selTraining1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test31 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22585/aus-vs-nz-1st-odi-new-zealand-tour-of-australia-2020");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement selectedTable = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> colEntries = selectedTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		
		int sum = 0;
		for(int i=0;i<colEntries.size()-2;i++)
		{
			String strRuns = colEntries.get(i).getText();
			int intRuns = Integer.parseInt(strRuns);
			sum=sum+intRuns;
		}
		
		
		
		String strExtras = selectedTable.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int intExtras = Integer.parseInt(strExtras);
		sum =sum+intExtras;
		
		String strTotal = selectedTable.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int intTotal = Integer.parseInt(strTotal);
		
		if(sum==intTotal)
		{
			System.out.println("Total run Score matches as : "+sum);
		}
		else
			System.out.println("Total run score is incorrect");
	}
}
