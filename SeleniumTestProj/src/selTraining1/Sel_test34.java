package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test34 {

	public static void main(String[] args) {
		
		//assignment 8
		//this is done with javaexecutor
		//if get text() does not return a value then getattribute("value") can be used instead of java executor.
		
		WebDriver driver=new ChromeDriver();   
	    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
	    //auto suggestive dropdown using javascript executor
	    driver.findElement(By.id("autocomplete")).sendKeys("ind");
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	   
	   
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    String script = "return document.getElementById(\"autocomplete\").value;";
	    String text = (String) js.executeScript(script);
	    int i=0;
	    while(!text.equalsIgnoreCase("Indonesia"))
	    {
	    	i++;
	    	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    	text = (String) js.executeScript(script);
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
