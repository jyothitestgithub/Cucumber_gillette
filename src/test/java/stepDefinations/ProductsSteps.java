package stepDefinations;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ProductsPage;
import pageObjects.SearchPage;
import pageObjects.StylingPage;
import reusable.WebDriverHelper;
import utilities.BaseClass;
import utilities.ExcelData;

import utilities.CaptureScreenshot;


public class ProductsSteps extends BaseClass {
	
	public WebDriver driver;
	public ProductsPage pp;
	public SearchPage sp;
	public StylingPage stp;
	public ExcelData excel;
	public CaptureScreenshot screenshot;
	
	
	public WebDriverHelper helper;
    
	@Before
	public void setup()
	{
		
		logger=Logger.getLogger("gillette");
		PropertyConfigurator.configure("Log4j.properties");
		excel = new ExcelData();
		screenshot =new CaptureScreenshot();
		
		 
		
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	         driver=new ChromeDriver();
	         logger.info("--Launching browser--");
	         driver.manage().window().maximize();
		}
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
			driver =new FirefoxDriver();
		}	}
	
	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() {
		
		
	    pp=new ProductsPage(driver);
	    sp=new SearchPage(driver);
	    stp=new StylingPage(driver);
	}

	@Given("Navigate to {string} site")
	public void navigate_to_site(String url) {
	  driver.get(url);  
	  logger.info("Url is opened");
	}

	@When("User hovers on Products")
	public void user_hovers_on_Products() throws InterruptedException {
	   pp.product();
	   logger.info("Hovered over Poducts");
	   
	}

	@When("User clicks on {string} under By Brands")
	public void user_clicks_on_under_By_Brands(String string) {
	   pp.link();
	   logger.info("User clicked on  a category under by brands");
	}

	@Then("Verify that text {string} is displayed under out of products list")
	public void verify_that_text_is_displayed_under_out_of_products_list(String value) throws IOException {
	   if(driver.getPageSource().contains(value)) {
		   logger.info("--Products verfication passed--");
		   Assert.assertTrue(true);
	   }else {
		   
		   logger.info("--Products verfication failed--");
		   screenshot.takeScreenshot(driver);
		   
		   Assert.assertTrue(false);
		   
		  
	   }
	}

	@Then("close browser")
	public void close_browser() {
	 logger.info("--Exiting browser--");
	 driver.quit();    	
	}
	
 //steps remaining for search page 
	
	 @When("User clicks on Search icon")
	    public void user_clicks_on_search_icon() throws Throwable {
	       sp.searchoption();
	       logger.info("User clicked on Search icon");
	       
	    }

	    @When("^User enters search (.+)$")
	    public void user_enters_search(String keyword) throws Throwable {
	        sp.bar(keyword);
	        logger.info("User entered search keyword");
	    }

	    @When("^User again clicks on Search icon$")
	    public void user_again_clicks_on_search_icon() throws Throwable {
	       
	       sp.clkagain();   
	       logger.info("User submitted entered search keyword");
	    }
	    
	    @Then("^Verify that text (.+) is displayed at the top of search results$")
	    public void verify_that_text_is_displayed_at_the_top_of_search_results(String result) throws Throwable {
	    	if(driver.getPageSource().contains(result)) {
	    		 boolean check=sp.verify();
	    		 if(check=true) {
	 		   Assert.assertTrue(true);
	 		  logger.info("--Search  functionality passed--");
	 	   }}else {
	 		   Assert.assertTrue(false);
	 		  logger.info("--Search  functionality failed--");
	 	   }
	    }

	 //steps remaining for styling page
	 
	    @When("^User clicks on \"([^\"]*)\" under \"([^\"]*)\" in footer$")
	    public void user_clicks_on_something_under_something_in_footer(String strArg1, String strArg2) throws Throwable {
	        stp.learn();
	        logger.info("User clicked on  a category in footer");
	    }

	    @Then("^Verify that text \"([^\"]*)\" is displayed under list of articles under styling$")
	    public void verify_that_text_something_is_displayed_under_list_of_articles_under_styling(String strArg1) throws Throwable {
	    	
	    	if(driver.getPageSource().contains(strArg1)) {
	  		   Assert.assertTrue(true);
	  	   	 logger.info("--Styling verfication passed--");
	  	   }else {
	  		 
	  		  Assert.assertTrue(false);
	  		logger.info("--Styling verfication failed--");
	  	   }
	    }
}
