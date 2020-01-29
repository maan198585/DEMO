package wellsfargo.WellsFargo;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LOGINGMAIL {
	public WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harneet\\Desktop\\Testing\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.wellsfargo.com/");
		
	}
	@AfterMethod
	public void closeapp() {
		driver.close();
		
	}
	@Test
	public void checkTitle()
	{
		String title= driver.getTitle();
		Assert.assertEquals(title, "Wellsfargo");
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("userid")).sendKeys("abc@mail.com");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='btnSignon']")).click();
	}
		@Test
		public void Tab1()
		{
			WebElement a =driver.findElement(By.id("bankingTab"));
			Actions action=new Actions(driver);
			action.moveToElement(a).click().build().perform();
		}
		
		@Test
		public void Tab2() throws IOException
		{
			WebElement b =driver.findElement(By.id("loansTab"));
			Actions action=new Actions(driver);
			action.moveToElement(b).click().build().perform();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("C:\\Users\\harneet\\Desktop\\Selenium Softwares\\screenshot1.png"));
		}
		@AfterMethod
		public void AfterMethod()
		{
		driver.close();
		
	}
		
			
		}

	

