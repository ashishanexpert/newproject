//this Test Scripts shows the execution of the signup page with valid deatails





import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sing_up_Valid {
	WebDriver driver;
  @Test
  public void signup() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@value='Submit'and@type='button']")).click();
	  driver.findElement(By.name("member(user).username")).sendKeys("Supriya");
	  driver.findElement(By.name("member(name)")).sendKeys("Supriya G");
	  driver.findElement(By.name("member(email)")).sendKeys("supriyaanexpert@gmail.com");
	  driver.findElement(By.name("member(customValues).value")).sendKeys("13/05/1997");
	  driver.findElement(By.id("_radio_2_0")).click();
	  driver.findElement(By.xpath("//input[@fieldname='address']")).sendKeys("WoodStock Ambience");
	  driver.findElement(By.xpath("//input[@fieldname='postalCode']")).sendKeys("987654");
	  driver.findElement(By.xpath("//input[@fieldname='city']")).sendKeys("Bangalore");
	  Select data = new Select(driver.findElement(By.id("custom_field_select_6")));
	  data.selectByVisibleText("Example area");
	  driver.findElement(By.xpath("//input[@fieldname='phone']")).sendKeys("8899890989");
	  driver.findElement(By.xpath("//input[@fieldname='mobilePhone']")).sendKeys("8899893454");
	  driver.findElement(By.xpath("//input[@fieldname='fax']")).sendKeys("123456789");
	  driver.findElement(By.xpath("//input[@fieldname='url']")).sendKeys("www.google.com");
	  driver.findElement(By.name("member(user).password")).sendKeys("supriya123");
	  driver.findElement(By.name("confirmPassword")).sendKeys("supriya123");
	 Thread.sleep(15000);
	  driver.findElement(By.id("saveButton")).click();
	  String expected = "The given login name (Supriya) is already in use";
	  Alert alert = driver.switchTo().alert();
	  String actual = alert.getText();
	  System.out.println(actual);
	  Assert.assertTrue(actual.contains(expected));
	  alert.accept();
	  
  }
 


  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get(" http://localhost:8585/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
