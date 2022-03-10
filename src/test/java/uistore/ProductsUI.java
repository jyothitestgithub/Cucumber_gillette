package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductsUI {

	@FindBy(xpath="//button[@title='Products']")
	@CacheLookup
	public static WebElement Products;
	
	@FindBy(xpath="//a[@class='text-navy-dark-blue block font-RegularFont pb-25 text-16 leading-22 cursor-pointer hover:underline event_menu_click'][normalize-space()='MACH3']")
	@CacheLookup
	public static WebElement mach;
}
