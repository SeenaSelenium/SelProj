package selTraining1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test33 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();   
	    driver.get("https://ksrtc.in/oprs-web/guest/home.do");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
	    //auto suggestive dropdown using javascript executor
	    
	    driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
	    driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	
	   String script = "return document.getElementById(\"fromPlaceName\").value;";
	   String text = (String) js.executeScript(script);
	   
	   
	   //incrementor is used to ensure it does not go into infinite loop incase element is not found
	   
	   int i=0;
	   //BENGALURU INTERNATION AIRPORT
	   while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
	   {
		   i++;
		   driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
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
	   	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
	}
	}


