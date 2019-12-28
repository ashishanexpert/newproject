import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program21_using_properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream("C:\\Users\\IBM\\Desktop\\myscript2\\Demotest\\src\\obj.properties");
		obj.load(objfile);
		/*System.out.println(obj.getProperty("login"));
		System.out.println(obj.getProperty("username"));
		System.out.println(obj.getProperty("password"));
		System.out.println(obj.getProperty("submit"));*/
		String login = obj.getProperty("login");
		String un = obj.getProperty("username");
		String pwd = obj.getProperty("password");
		String submit = obj.getProperty("submit");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText(login)).click();
		driver.findElement(By.id(un)).sendKeys("cvenkata_raman@rediffmail.com");
		driver.findElement(By.id(pwd)).sendKeys("satyam123$");
		driver.findElement(By.xpath(submit)).click();
		driver.findElement(By.linkText("Log out")).click();

	}

}
