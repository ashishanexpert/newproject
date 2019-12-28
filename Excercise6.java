import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/demo.html");
		

		WebElement table1 = driver.findElement(By.xpath("/html/body/table/tbody"));
		 List<WebElement> rows = table1.findElements(By.tagName("tr"));
		WebElement table2 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> cols = table2.findElements(By.tagName("td"));
		 System.out.println(rows.size());
		 System.out.println(cols.size());
		 driver.close();
		  

	}

}
