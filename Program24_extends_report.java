import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Program24_extends_report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports extent;
		ExtentTest logger;
		
		extent = new ExtentReports("E:\\mytestresults.html",true);
		logger = extent.startTest("testcase1-home page");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String exptitle = "Demo Web Shop";
		String actitle = driver.getTitle();
		if(exptitle.equals(actitle)){
			logger.log(LogStatus.PASS, "testcase1 is pass");
		}
		else{
			
			logger.log(LogStatus.FAIL,"testcase1 is fail");
		}
		extent.flush();
		extent.endTest(logger);
		logger = extent.startTest("testcase2");
		driver.findElement(By.linkText("Log in")).click();
		exptitle = "Demo Web Shop. Login";
	     actitle = driver.getTitle();
	     if(exptitle.equals(actitle)){
				logger.log(LogStatus.PASS, "testcase2 is pass");
			}
			else{
				
				logger.log(LogStatus.FAIL,"testcase2 is fail");
			}
		logger.log(LogStatus.PASS, "testcase2 is pass");
		extent.flush();
		extent.endTest(logger);
		

	}

}
