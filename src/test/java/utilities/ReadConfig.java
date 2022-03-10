package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	static Properties pro;
	public ReadConfig()
	{
		File src=new File("./TestData\\config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	
		
	public String getBrowser()
	{
	String browser=pro.getProperty("browser");
	return browser;
	}
	
	public String getexcel()
	{
	String path=pro.getProperty("excelPath");
	return path;
	}
    
	public static String getScreenshotPath() {
		return pro.getProperty("screenshotPath");
	
	}
	
	public static String getReportsConfig() {
		return pro.getProperty("reportsConfig");
	}

	public static String getReportsPath() {
		return pro.getProperty("reportsPath");
	}
}
