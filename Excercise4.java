import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
	    
		String s;
		s = driver.getTitle();
		System.out.println(s);
		
		Select datab = new Select(driver.findElement(By.name("category_id")));
		datab.selectByVisibleText("Databases");
		//Thread.sleep(5000);
        WebElement search = driver.findElement(By.name("DoSearch"));
		search.click();
		//Thread.sleep(5000);
		WebElement develop = driver.findElement(By.linkText("Web Database Development"));
		develop.click();
		WebElement qty = driver.findElement(By.name("quantity"));
		String store = qty.getAttribute("Value");
		int value = Integer.parseInt(store);
		System.out.println(value);
		WebElement shopping = driver.findElement(By.name("Insert1"));
		shopping.click();
        WebElement rememberme = driver.findElement(By.className("NoiseInput"));
		
		boolean expresult, actresult;
		expresult = false;
		actresult = rememberme.isSelected();
		if(expresult==actresult){
			System.out.println("test is pass");
		}
		else{
			
			System.out.println("test is fail");
			
		}
		
		//	driver.close();

	}

}
