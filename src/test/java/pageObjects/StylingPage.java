package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;

import uistore.StylingUI;

public class StylingPage extends StylingUI {
	WebDriver ldriver;
	WebDriverHelper helper;
	
	public StylingPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	
	public void learn() {
		helper.implicitWait(ldriver, 10);
		
		Point loc=styling.getLocation();
		
		//Through typecasting
		JavascriptExecutor jse=(JavascriptExecutor)ldriver;
		jse.executeScript("window.scrollBy"+loc);
		
		styling.click();
		helper.implicitWait(ldriver, 10);
	
	}
	
}
