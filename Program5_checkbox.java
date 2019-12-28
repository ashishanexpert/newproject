import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5_checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/demo.html");
		
		
		WebElement rememberme = driver.findElement(By.id("checkbox1"));
		
		boolean expresult, actresult;
		expresult = false;
		actresult = rememberme.isSelected();
		if(expresult==actresult){
			System.out.println("test is pass");
		}
		else{
			
			System.out.println("test is fail");
			
		}
		driver.close();
		


	}

}
