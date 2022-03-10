package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SearchUI {

	@FindBy(xpath="//button[@id='searchIcon']")
	@CacheLookup
	public static WebElement icon;
	
	@FindBy(xpath="//html/body//form/input")
	@CacheLookup
	public static WebElement searchbar;
	
	@FindBy(xpath="//button[@id='searchIconButton']")
	@CacheLookup
	public static WebElement search;
	
	@FindBy(xpath="//h1[@class='search-heading text-24 leading-34 p-20 font-BoldFont text-navy-dark-blue pt-40 mdl:pt-20 mdl:px-0']")
	@CacheLookup
	public static WebElement heading;
	
}
