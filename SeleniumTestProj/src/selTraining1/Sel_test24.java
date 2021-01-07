package selTraining1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Sel_test24 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> WinHandles = ids.iterator();
		String MainWin = WinHandles.next();
		String ChildWin = WinHandles.next();
		driver.switchTo().window(ChildWin);
		String ChildWinText = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println("Child Window Text is "+ ChildWinText);
		driver.switchTo().window(MainWin);
		String MainWinText = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println("Main Window Text is "+ MainWinText);
		driver.quit();
		

	}
	
	

}
