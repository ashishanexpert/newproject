import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Excercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		Actions action = new Actions(driver);
		WebElement computers= driver.findElement(By.linkText("COMPUTERS"));
		action.moveToElement(computers).build().perform();	
		driver.findElement(By.linkText("Accessories")).click();
		

	}

}
