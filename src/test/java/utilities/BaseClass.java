package utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;






public class BaseClass {

	ReadConfig readconfig= new ReadConfig();
	//public String reportsPath=readconfig.getReportsPath();
	public String browser=readconfig.getBrowser();
	public String path=readconfig.getexcel();
	public static WebDriver driver;
	public static Logger logger;
	public static ExcelData excel;

	
	
	
public void driversetup() {
		
		System.out.println(readconfig.getBrowser());
		
		
		


	}

	
}