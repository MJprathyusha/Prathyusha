package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class First {
	WebDriver dr;
	
	
	
	
	
	@BeforeMethod
	
	public void Setup() 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    dr=new ChromeDriver();
		 dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  JavascriptExecutor js = (JavascriptExecutor)dr;
		    dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  
		    js.executeScript("window.scrollBy(0,600)");
		    dr.manage().window().maximize();
		    dr.navigate().refresh();
		    dr.get("http://demo.guru99.com/test/newtours/");
	}
	
	@Test (priority=1)
	public void TiltleOfThePage() {
		String tittle=dr.getTitle();
		Assert.assertEquals(tittle,"guru");
		
	
	}
	

	
	
	
	@AfterMethod
	public void tearDown() {
		dr.quit();
	}
	
	
	
	

}
