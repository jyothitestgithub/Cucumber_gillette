package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.ProductsUI;


public class ProductsPage extends ProductsUI {
	WebDriver ldriver;
	WebDriverHelper helper;
	
	public ProductsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	
	public void product() {
	
		Actions a = new Actions(ldriver);
		 a.moveToElement(Products).perform();
	}
	
	public void link() {
		
		mach.click();  
	}
	 
	

}
