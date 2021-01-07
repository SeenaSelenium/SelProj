package selTraining1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test27 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// count of links on screen
		
		int linksOnScreen = driver.findElements(By.tagName("a")).size();
		System.out.println("Links on screen are ; "+ linksOnScreen);
		
		//count of links in footer
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int linksOnFooter = footerDriver.findElements(By.tagName("a")).size();
		System.out.println("Links on Footer sections are : " + linksOnFooter);
		
		//count of links in first column of footer
		
		WebElement footerColDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int linksOnFooterCol1 = footerColDriver.findElements(By.tagName("a")).size();
		System.out.println("Links on Footer section Column1 are : " + linksOnFooterCol1);
		
		//Open all links in first column of footer . 
		//done by opening the links in different tabs by using keyboard seq ie ctrl+enter
		
		for(int i=1;i<linksOnFooterCol1;i++)
		{
			String clickSeq = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerColDriver.findElements(By.tagName("a")).get(i).sendKeys(clickSeq);
		}
		
		//Get the page title of all tabs opened
		//done using while loop with function hasNext() meaning as long as there is a next value go through the loop
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}
	
	
}
