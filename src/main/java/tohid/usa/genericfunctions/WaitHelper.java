package tohid.usa.genericfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tohid.usa.basepage.Super_Class;

public class WaitHelper extends Super_Class{
	
	public static void seleniumWait(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
