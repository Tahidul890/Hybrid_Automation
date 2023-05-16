package tohid.usa.genericfunctions;

import java.io.File;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import tohid.usa.basepage.Super_Class;



public class CommonMethods extends Super_Class{
	
	public static void mouseHover(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}

	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();

	}
	
	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	public static void dropDownMenu(WebElement ele, String text) {
		Select se = new Select(ele);
		se.selectByVisibleText(text);
	}
	
	public static void handleDropDown(List<WebElement> element, String text) {
		List<WebElement> select = element;
		for(WebElement value: select) {
			String listOfDropDown = value.getText();
			if(listOfDropDown.equalsIgnoreCase(text)) {
				CommonMethods.actionClick(value);
			}
		}
	}
	
	public static void getPageRefresh() {
		driver.navigate().refresh();

	}
	
	public static void takeScreenshot(String ssname) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshots/" + ssname + ".png"));	
		}
		
		catch (Exception ex) {
			System.out.println("Exception happened" + ex.getMessage());
		}
	}

}
