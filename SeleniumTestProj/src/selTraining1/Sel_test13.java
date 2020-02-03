package selTraining1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test13 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//List<WebElement> el = driver.findElements(By.xpath("//input[contains(@type,'checkbox')]"));
		//works but since page has checkbox and radio button as tagname input so selects radio button too.
		List<WebElement> el = driver.findElements(By.tagName("input"));
		
		for(WebElement els : el)
		{
			if(!els.isSelected())
			{
				els.click();
			}
		}
		//driver.close();
	}

}
