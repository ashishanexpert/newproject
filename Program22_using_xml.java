import java.io.File;
import java.net.MalformedURLException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program22_using_xml {

	public static void main(String[] args) throws MalformedURLException, DocumentException {
		// TODO Auto-generated method stub
		
		File inputFile = new File("C:\\Users\\IBM\\Desktop\\myscript2\\Demotest\\src\\obj.xml");
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(inputFile);
		
		String login = document.selectSingleNode("//demowebshop/login").getText();
		String username = document.selectSingleNode("//demowebshop/username").getText();
		String password = document.selectSingleNode("//demowebshop/password").getText();
		String submit = document.selectSingleNode("//demowebshop/submit").getText();
		
		System.out.println(login);
		System.out.println(username);
		System.out.println(password);
		System.out.println(submit);
		

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		driver.findElement(By.linkText(login)).click();
		driver.findElement(By.id(username)).sendKeys("cvenkata_raman@rediffmail.com");
		driver.findElement(By.id(password)).sendKeys("satyam123$");
		driver.findElement(By.xpath(submit)).click();
	    driver.findElement(By.linkText("Log out")).click();
	    
		

	}

}
