package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Lumens {
	WebDriver dr=null;
	@Given("Google browser is open")
	public void google_browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    dr=new ChromeDriver();
	    JavascriptExecutor js = (JavascriptExecutor)dr;
	   // dr.navigate().to("http://demo.guru99.com/test/newtours/"); 
	    dr.get("https://www.lumens.com/");
	    dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  
	    js.executeScript("window.scrollBy(0,600)");
	    dr.manage().window().maximize();
	    dr.navigate().refresh();
	   
	}

	@Given("Verify  User is able to Create an account in Lumens application")
	public void verify_User_is_able_to_Create_an_account_in_Lumens_application() {
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.navigate().refresh();
		
		Actions actions = new Actions(dr);
		WebElement newaccount = dr.findElement(By.xpath("//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/button/i"));
		actions.moveToElement(newaccount).perform();
		//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/div/div/a")).click();
		//dr.navigate().refresh();
		//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//*[@id=\"createAccountBtn\"]/span")).click();
		//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(By.id("dwfrm_profile_customer_firstname")).sendKeys("PrathyushaMJ");
		dr.findElement(By.id("dwfrm_profile_customer_lastname")).sendKeys("M");
		dr.findElement(By.id("dwfrm_profile_customer_email")).sendKeys("m.j.prathyusha12@gmail.com");
		dr.findElement(By.id("dwfrm_profile_customer_emailconfirm")).sendKeys("m.j.prathyusha12@gmail.com");
		dr.findElement(By.id("dwfrm_profile_login_password")).sendKeys("Mmurthy@2");
	
		dr.findElement(By.id("dwfrm_profile_login_passwordconfirm")).sendKeys("Mmurthy@2");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//*[@id="ltkpopup-close-button"]/a/svg
		dr.findElement(By.xpath("//*[@id=\"RegistrationForm\"]/fieldset/div[4]/button")).click();
		
		dr.navigate().refresh();
		
		
		
		
	}

	@When("Verify user is able to Login Lumens  application")
	public void verify_user_is_able_to_Login_Lumens_application() {
		dr.navigate().refresh();
		Actions actions = new Actions(dr);
		WebElement newaccount = dr.findElement(By.xpath("//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/button/i"));
		actions.moveToElement(newaccount).perform();
		dr.findElement(By.id("dwfrm_login_username")).sendKeys("m.j.prathyusha12@gmail.com");
		dr.findElement(By.name("dwfrm_login_password")).sendKeys("Mmurthy@2");
		dr.findElement(By.name("dwfrm_login_login")).click();
	   
	}

	@When("Verify title of the Lumens application")
	public void verify_title_of_the_Lumens_application() {
		 if (dr.getTitle().equals("Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com"))
         {
             System.out.println("Title is true ");
         }
         else
         {
             System.out.println("Title is not true");
         }
	    
	}

	@Then("Verify user is able to select Ceiling Lights from lightning Tab")
	public void verify_user_is_able_to_select_Ceiling_Lights_from_lightning_Tab() {
		Actions actions = new Actions(dr);
		WebElement newaccount = dr.findElement(By.xpath("//*[@id=\"nav-tab-01\"]/a/span[1]"));
		actions.moveToElement(newaccount).perform();
		dr.findElement(By.xpath("//*[@id=\"nav-tab-01\"]/ul/li/div[1]/span/a")).click();
	    
	}

	@Then("Verify  user is able to select  the specific product by applying  filter")
	public void verify_user_is_able_to_select_the_specific_product_by_applying_filter() {
		dr.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[2]/div[4]/div[1]/a")).click();
		WebElement radio2 = dr.findElement(By.xpath("//*[@id=\"refinement-LU_BestSellerScore\"]/div/ul/li[1]/a/span[1]/input"));
		radio2.click();
		//WebElement radio1 = dr.findElement(By.xpath("//*[@id=\"refinement-ProductCategoryPath\"]/div/ul/li[1]/a/span[1]/input"));	
		//radio1.click();
		JavascriptExecutor js1 = (JavascriptExecutor)dr;
		 js1.executeScript("window.scrollBy(0,400)");
		
	   
	}

	@Then("Verify  user is able to add the selected product to the cart")
	public void verify_user_is_able_to_add_the_selected_product_to_the_cart() {
		 dr.get("https://www.lumens.com/saucer-bubble-pendant-by-nelson-bubble-lamps-GNBP151340.html?cgid=2#prefn1=LU_BestSellerScore&prefv1=1%20business%20day&tileIndex=1");
		
		
		dr.findElement(By.xpath("//*[@id=\"6c68c799119a48c8f1eae33a9c\"]/div[1]/div[4]/a")).click();
		// JavascriptExecutor js2 = (JavascriptExecutor)dr;
		 //js2.executeScript("window.scrollBy(0,600)");
		dr.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
		//dr.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
		dr.findElement(By.xpath("//*[@id=\"atcModal\"]/div/div/div/div/div/div[2]/div[2]/a[1]")).click();
		dr.findElement(By.name("dwfrm_cart_shipments_i0_items_i0_quantity")).sendKeys("1");
	   dr.findElement(By.name("dwfrm_cart_checkoutCart")).click();
		//*[@id="6c68c799119a48c8f1eae33a9c"]/div[1]/div[1]/a/img
	}

	@Then("Verify  user is able to view  the added product in the cart")
	public void verify_user_is_able_to_view_the_added_product_in_the_cart() {
	    
	}

	@Then("Verify user is able to search the product")
	public void verify_user_is_able_to_search_the_product() {
	    
	}

	@Then("Verify user is able to login Live chat by entering valid credentials")
	public void verify_user_is_able_to_login_Live_chat_by_entering_valid_credentials() {
	    
	}

	@Then("Verify user is not  able login View chat by entering invalid credentials")
	public void verify_user_is_not_able_login_View_chat_by_entering_invalid_credentials() {
	    
	}

	@Then("Verify the product able to remove from cart")
	public void verify_the_product_able_to_remove_from_cart() {
	   
	}

	@Then("Verify user able to apply coupon code")
	public void verify_user_able_to_apply_coupon_code() {
	   
	}

	@Then("Verify scroll up, scroll down action")
	public void verify_scroll_up_scroll_down_action() {
	    
	}

	@Then("Verify the home page")
	public void verify_the_home_page() {
	    
	}

	@Then("Verify ZIP code")
	public void verify_ZIP_code() {
	    
	}

	@Then("Verify Quantity")
	public void verify_Quantity() {
	    
	}

	@Then("Verify Logout page")
	public void verify_Logout_page() {
	   
	}



}
