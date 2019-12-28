import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver;
	WebElement loginLink;
	
	homePage(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	void clickLoginlink(){
		loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
	}

}
