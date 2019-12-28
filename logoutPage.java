import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutPage {
	
	WebDriver driver;
	WebElement logout;
	logoutPage(WebDriver driver){
		this.driver= driver;
	}
	
	void clickLogout(){
		logout = driver.findElement(By.linkText("Log out"));
		logout.click();
	}

}
