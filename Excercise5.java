import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		  
	     WebElement register;
	     String s;
	     s = driver.getTitle();
	     System.out.println(s);
	     driver.findElement(By.name("user_login")).sendKeys("Ashish123");
	     driver.findElement(By.name("user_password")).sendKeys("Ashish123");
	     driver.findElement(By.name("first_name")).sendKeys("Ashishkumar");
	     driver.findElement(By.name("last_name")).sendKeys("singh");
	     driver.findElement(By.name("email")).sendKeys("ashihs123@gmail.com");
	     driver.findElement(By.name("address1")).sendKeys("bangalore");
	     driver.findElement(By.name("address2")).sendKeys("newdoor");
	     driver.findElement(By.name("address3")).sendKeys("Woodstock Ambience");
	     driver.findElement(By.name("city")).sendKeys("singasandara");
	     Select state = new Select (driver.findElement(By.name("state_id")));
	     state.selectByVisibleText("Alaska");
	     driver.findElement(By.name("zip")).sendKeys("81130");
	     Select country = new Select (driver.findElement(By.name("country_id")));
	     country.selectByVisibleText("Australia");
	     driver.findElement(By.name("phone_home")).sendKeys("8298536364");
	     driver.findElement(By.name("phone_work")).sendKeys("9955234545");
	     Select language = new Select (driver.findElement(By.name("language_id")));
	     language.selectByVisibleText("English");
	     Select age = new Select (driver.findElement(By.name("age_id")));
	     age.selectByVisibleText("18-24");
	     Select gender = new Select (driver.findElement(By.name("gender_id")));
	     gender.selectByVisibleText("Male");
	     Select education = new Select (driver.findElement(By.name("education_id")));
	     education.selectByVisibleText("Graduate School");
	     Select income = new Select (driver.findElement(By.name("income_id")));
	     income.selectByVisibleText("$25,000 - $34,000");
	     driver.findElement(By.name("note")).sendKeys("Registration Complete");
	     register = driver.findElement(By.name("Insert"));
	     register.click();
	     driver.close();
	     
	     
	     
	     

	}

}
