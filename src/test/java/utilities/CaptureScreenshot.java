package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class CaptureScreenshot {

/*		
	
	public static String captureScreen(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//Date d=new Date();
		//SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		//String date=sdf.format(d);
		
		String path = (System.getProperty("user.dir") + "/Screenshots/"  +CurrentDateTime.getDateTime()+ ".png");
		File dest =new File(path);
		FileUtils.copyFile(source, dest);
		System.out.println("Screenshot taken");
		return path;
	}
	*/
	
	public static String takeScreenshot(WebDriver driver) throws IOException {
		String path = ReadConfig.getScreenshotPath()+CurrentDateTime.getDateTime()+".png";
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path));
		System.out.println("Screenshot taken");
		return path;
	}

	

	
}
