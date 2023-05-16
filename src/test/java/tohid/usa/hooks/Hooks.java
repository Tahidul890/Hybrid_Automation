package tohid.usa.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tohid.usa.basepage.Super_Class;

public class Hooks extends Super_Class{
	
	@Before
	public void setUp() {
		System.out.println("===Automation Start===");
		Initialization();
	}
	
	@After
	public void tearDown() {
		System.out.println("===Automation Completed & Close the Browser ===");
		driver.quit();
	}

}
