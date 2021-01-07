package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test35 {
	
	public static void main(String[] args) {
		
		//assignment 8 with getatribute
		//this code executed correctly the first time only.
		
		
		WebDriver driver=new ChromeDriver();   
	    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	    driver.findElement(By.id("autocomplete")).sendKeys("uni");
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    String text = driver.findElement(By.id("autocomplete")).getAttribute("value");
	    
	    int i=0;
	    
	    while(!text.equalsIgnoreCase("United States (USA)"))
	    {
	    	i++;
	    	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    	text = driver.findElement(By.id("autocomplete")).getAttribute("value");
	    	if(i>10)
	    	{
	    		break;
	    	}
	    }
	    if(i>10)
	    {
	    	System.out.println("element not found");
	    }
	    else
	    	System.out.println(text);
	}

}
