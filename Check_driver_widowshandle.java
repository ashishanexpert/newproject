import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_driver_widowshandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		System.out.println("the title of main window is  " +  driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		Set<String> s = driver.getWindowHandles();
	    Iterator<String> iter = s.iterator();
	    
	    String mainwindow = iter.next();
	    String childwindow = iter.next();
	    driver.switchTo().window(childwindow);	    
		System.out.println("the title of next window  " + driver.getTitle());
		
		
		
		//driver.close();
		

	}

}
