import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver;
	WebElement username, password,loginbutton;
	
	loginPage(WebDriver driver){
		this.driver= driver;
	}
	
	void enterUsername(String s)
	{
		username = driver.findElement(By.name("Email"));
		username.sendKeys(s);
	}

	void enterPassword(String s){
	password = driver.findElement(By.name("Password"));
	password.sendKeys(s);
	}
	
	void clickLoginbutton(){
		
		loginbutton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		loginbutton.click();
	}
}
