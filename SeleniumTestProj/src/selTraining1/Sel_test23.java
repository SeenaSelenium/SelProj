package selTraining1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_test23 {
	
	public static void main(String[] args) {
		
		//handling window handles with iterator
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String MainWindowTitle = driver.getTitle();
		System.out.println(MainWindowTitle);
		driver.findElement(By.linkText("Help")).click();
		 Set<String> ids = driver.getWindowHandles();
		 Iterator<String> Winhandles = ids.iterator();
		 String MainWinHandle = Winhandles.next();
		 String ChindWinHandles = Winhandles.next();
		 driver.switchTo().window(ChindWinHandles);
		 String ChildWinTitle= driver.getTitle();
		 System.out.println(ChildWinTitle);
		 driver.switchTo().window(MainWinHandle);
		 driver.findElement(By.id("firstName")).sendKeys("seena");
		 
		 driver.quit();
	}

}
