import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program23_testcase_using_page_object_factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		myobjects obj = new myobjects(driver);
		obj.clickLogin();
		
		obj.enterUsername("cvenkata_raman@rediffmail.com");
		obj.enterPassword("satyam123$");
		obj.clickSubmit();
		driver.findElement(By.linkText("Log out")).click();

	}

}
