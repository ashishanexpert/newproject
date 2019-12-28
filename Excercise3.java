import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
	    
		String s;
		s = driver.getTitle();
		System.out.println(s);
		
		Select datab = new Select(driver.findElement(By.name("category_id")));
		int total = datab.getOptions().size();
		System.out.println(total);
		driver.close();

	}

}
