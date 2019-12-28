import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program6_learning_radio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/demo.html");
		
		boolean output;
		WebElement textbox = driver.findElement(By.id("checkbox1"));
		 
		
		output = textbox.isSelected();
		Select combobox1 = new Select(driver.findElement(By.id("combo1")));
		combobox1.selectByVisibleText("Us");
		//driver.close();
		
		int total = combobox1.getOptions().size();
		System.out.println(total);
		
		List<WebElement> gender = driver.findElements(By.name("gender"));
		gender.get(0).click();
		gender.get(1).click();

	}

}
