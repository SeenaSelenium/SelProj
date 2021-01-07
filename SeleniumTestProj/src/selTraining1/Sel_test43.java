package selTraining1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Sel_test43 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		String downloadpath = System.getProperty("user.dir");
		HashMap<String,Object> prefoptions = new HashMap<String,Object>();
		prefoptions.put("profile.default_content_settings.popups", 0);
		prefoptions.put("download.default_directory", downloadpath);
		ChromeOptions ch = new ChromeOptions();
		ch.setExperimentalOption("prefs", prefoptions);
		
		
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://altoconvertpdftojpg.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("[class*='btn--choose']")).click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec("D:\\Seena\\Selenium\\FileUploadscript.exe");
		
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		driver.findElement(By.xpath("//button[@class='button']")).click();


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
		
		

		driver.findElement(By.cssSelector("button[class*='medium']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

		driver.findElement(By.linkText("Download Now")).click();

		Thread.sleep(5000);

		File f=new File(downloadpath+"/Result.zip");

		if(f.exists())

		{

		System.out.println("File downloaded");

		if(f.delete())

		System.out.println("file deleted");
		}
		
		driver.close();
		

	}

}
