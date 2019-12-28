import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		homePage home = new homePage(driver);
		home.clickLoginlink();
		loginPage login = new loginPage(driver);
		login.enterUsername("cvenkata_raman@rediffmail.com");
		login.enterPassword("satyam123$");
		login.clickLoginbutton();
		logoutPage logout = new logoutPage(driver);
		driver.quit();
	}

}
