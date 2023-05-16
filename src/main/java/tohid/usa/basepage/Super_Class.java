package tohid.usa.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Super_Class {
	
	public static WebDriver driver;
	public static Logger log;
	public static Properties prop;
	public static FileInputStream ip;
	public Super_Class() {
		try {
		log = Logger.getLogger("QA Lead::");
		PropertyConfigurator.configure("log4j.properties");
		
		prop = new Properties();
		
			ip = new FileInputStream("./src/main/java/tohid/usa/config/Config.Properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Initialization() {
		String Browser = prop.getProperty("BrowserName");
		if(Browser.equalsIgnoreCase("Chrome")){
			log.info(">>>>>Automation started with Chrome<<<<<");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("Edge")) {
			log.info(">>>>>Automation started with Edge<<<<<");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(Browser.equalsIgnoreCase("Firefox")) {
			log.info(">>>>>Automation started with Firefox<<<<<");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			log.info("No browser found to excute the Automation");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}
}
