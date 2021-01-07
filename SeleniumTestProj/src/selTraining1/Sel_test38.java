package selTraining1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test38 {
	
	public static void main(String[] args) {
		
		//sorting using collections framework and also using array List
				//checking the columns if they are sorted in ascending order by after clicking on the header twice.
		//sort function by default sorts in ascending order
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();
				driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();
				List<WebElement> colvalues = driver.findElements(By.cssSelector("tr td:nth-child(1)"));
				
				ArrayList<String> orgList = new ArrayList<String>();
				for(int i=0;i<colvalues.size();i++)
				{
					orgList.add(colvalues.get(i).getText());
				}
				
				System.out.println("*****OrginalList*****");
				
				for(int i=0;i<orgList.size();i++)
				{
					String s1=orgList.get(i);
					System.out.println(s1);
				}
				
				ArrayList<String> sortList = new ArrayList<String>();
				
				for(int i=0;i<orgList.size();i++)
				{
					sortList.add(orgList.get(i));
				}
				
				Collections.sort(sortList);
				
				System.out.println("*****SortedList*****");
				
				for(int i=0;i<sortList.size();i++)
				{
					String s2=sortList.get(i);
					System.out.println(s2);
				}
				
				if(orgList.equals(sortList))
				{
					System.out.println("Column is sorted i ascending order when clickng the header twice");
				}
				else
					System.out.println("Column is not sorted");
				
	}

}
