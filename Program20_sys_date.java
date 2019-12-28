import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program20_sys_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date d = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("MMM dd,YYYY");
		String expDate = format.format(d);
		System.out.println(expDate);
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/demo.html");
		
		WebElement mydate = driver.findElement(By.xpath("/html/body/div[1]"));
		String actdate = mydate.getText();
		System.out.println(actdate);
		if(expDate==actdate){
			System.out.println("Test Case is Pass");
		}
		else{
			System.out.println("Test Case is Failed");
		}
		driver.quit();
		
		
		
		

	}

}
