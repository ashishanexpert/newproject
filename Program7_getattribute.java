import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program7_getattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/demo.html");
		WebElement textbook1 = driver.findElement(By.id("textbook1"));
		textbook1.sendKeys("Ashishkumarsingh");
		int total = textbook1.getAttribute("value").length();
		WebElement textbook2 = driver.findElement(By.id("textbook2"));
		String  x = Integer.toString(total);
	     textbook2.sendKeys(x);

	}

}
