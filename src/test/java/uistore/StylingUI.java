package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StylingUI {

	
	@FindBy(xpath="//a[@class='event_menu_click'][normalize-space()='Styling']")
	@CacheLookup
	public static WebElement styling ;
}
