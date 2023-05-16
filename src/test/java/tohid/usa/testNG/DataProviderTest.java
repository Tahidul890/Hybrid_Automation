package tohid.usa.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DataProviderTest {
	
	WebDriver driver;
	
	@DataProvider(name = "Authentication")
	public static Object [][] Information(){
		return new Object[][] {{"tahidulhaque1234@gmail.com", "1234"},
			                   {"tahidulhaque12345@gmail.com", "12345"}};
	}
	
	@Test(dataProvider = "Authentication")		
	public void getLogin(String username, String password) throws InterruptedException {
		
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
	}		
		
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	}


