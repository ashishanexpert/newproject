import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program25_testing_code_in_iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("file://E://iframe.html");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.id("one")).sendKeys("AshishKumarSingh");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
	    driver.findElement(By.id("two")).click();
	    driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		List<WebElement> gender = driver.findElements(By.name("three"));
		gender.get(0).click();
		
	
	
	}

}
