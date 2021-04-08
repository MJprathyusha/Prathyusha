package runner;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class New {

WebDriver dr=null;
@Given("navigate to Gmail page")
public void navigate_to_Gmail_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\Downloads\\chromedriver_win32\\chromedriver.exe");
    dr=new ChromeDriver();
    dr.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"); 
    
}

@When("user logged in using username as \"(.*)\"  and password as \"(.*)\"$\"")
public void user_logged_in_using_username_as_username_and_password_as_password(String username,String password) {
	 dr.findElement(By.id("identifierId")).sendKeys("username");
     dr.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(password);
     dr.findElement(By.xpath("//*[@id='signIn']")).click();
     dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   
}

@Then("^home page should be displayed$")
public void verifySuccessful(){
      String expectedText="Gmail";
      String actualText=         dr.findElement(By.xpath("//*[@id='gbq1']/div/a/span")).getText();
      Assert.assertTrue("Login not successful",expectedText.equals(actualText));
      }
}
