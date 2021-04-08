package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;

public class DemoLogin {
	WebDriver dr=null;   
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    dr=new ChromeDriver();
	    JavascriptExecutor js = (JavascriptExecutor)dr;
	   // dr.navigate().to("http://demo.guru99.com/test/newtours/"); 
	   // dr.get("http://demo.guru99.com/test/newtours/");
	    dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  
	    js.executeScript("window.scrollBy(0,600)");
	    dr.manage().window().maximize();
	    dr.navigate().refresh();
	    
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		   dr.get("http://demo.guru99.com/test/newtours/"); 
	}

	@When("user is enters username and password")
	public void user_is_enters_username_and_password() {
		dr.findElement(By.name("userName")).sendKeys("Prathyusha");
		dr.findElement(By.name("password")).sendKeys("Demo@123");
		
	}
	
	@When("user clicks on login")
	public void user_clicks_on_login() {
		dr.findElement(By.name("submit")).click();
	    
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		dr.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
		
	
	}
@And("user able to search flights")
public void user_able_to_search_flights() {
	dr.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	Select drPassenger = new Select(dr.findElement(By.name("passCount")));
	drPassenger.selectByVisibleText("2");
	Select drDeptFrom = new Select(dr.findElement(By.name("fromPort")));
	drDeptFrom.selectByVisibleText("London");
	Select drOn = new Select(dr.findElement(By.name("fromMonth")));
	drOn.selectByValue("4");
	Select drToday = new Select(dr.findElement(By.name("toDay")));
	drToday.selectByValue("2");
	dr.findElement(By.name("findFlights")).click();
}


}
