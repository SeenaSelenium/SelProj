package selTraining1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test21 {
	
	public static void main(String[] args) {
		
		//convery array to list to add to cart
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		int j=0;
		
		String[] itemsToBeAddedToCart = { "Cucumber", "Brocolli", "Tomato"};
		
		List<WebElement> listOfItemsOnPage= driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<listOfItemsOnPage.size();i++)
		{
			String[] ProductNames = listOfItemsOnPage.get(i).getText().split("-");
			String FormattedProductNames = ProductNames[0].trim();
			
			List<String> listToCart = Arrays.asList(itemsToBeAddedToCart);
			
			if(listToCart.contains(FormattedProductNames))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsToBeAddedToCart.length)
					break;
			}
		}
		
	}

}
