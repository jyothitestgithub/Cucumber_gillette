package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;

import uistore.SearchUI;

public class SearchPage extends SearchUI {
	WebDriver ldriver;
	WebDriverHelper helper;
	
	public SearchPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	 
	public void searchoption() {
		
		
		icon.click();
		helper.implicitWait(ldriver, 10);
		//ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void clksearch() throws InterruptedException {
		searchbar.click();
		//Thread.sleep(2000);
		helper.implicitWait(ldriver, 5);
	}
	
	public void bar(String keyword) {
		searchbar.sendKeys(keyword);
	}
	
	public void clkagain() {
		search.click();
	}
	
	public boolean verify() {
		   return	heading.isDisplayed();
		}

}
