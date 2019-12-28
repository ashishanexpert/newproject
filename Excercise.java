import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		  
	     WebElement register,submit;
	     register = driver.findElement(By.linkText("Register"));
	     register.click();
	     String s;
	     s = driver.getTitle();
	     System.out.println(s);
	     List<WebElement>gender= driver.findElements(By.name("Gender"));
	     gender.get(0).click();
	     driver.findElement(By.id("FirstName")).sendKeys("AshishKumarsingh");;
	     driver.findElement(By.id("LastName")).sendKeys("ashish123");
	     driver.findElement(By.id("Email")).sendKeys("charan12@gmail.com");
	     driver.findElement(By.id("Password")).sendKeys("123456789");
	     driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
	     submit = driver.findElement(By.id("register-button"));
	     submit.click();
	     driver.close();
	     
	     

	}

}
