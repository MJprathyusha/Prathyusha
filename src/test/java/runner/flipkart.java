package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;

public class flipkart {
	WebDriver dr=null;   
	@Given("google browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    dr=new ChromeDriver();
	    JavascriptExecutor js = (JavascriptExecutor)dr;
	   // dr.navigate().to("http://demo.guru99.com/test/newtours/"); 
	    dr.get("https://www.flipkart.com/");
	    dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  
	    js.executeScript("window.scrollBy(0,600)");
	    dr.manage().window().maximize();
	    dr.navigate().refresh();
	    
		
	}

	@And("user is on flipkart login page")
	public void user_is_on_login_page() {
		   dr.get("https://www.flipkart.com/"); 
	}


}
