import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reg {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",  "C:\\Users\\hp\\OneDrive\\Pictures\\Screenshots\\chromedriver_win32 (1)/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		//name
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Sathiyanantham M N");
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("sathianand29@gmail.com");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9600527573");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Sathiya@123");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		Thread.sleep(20000);
		register.click();
		Thread.sleep(20000);
  }
}
