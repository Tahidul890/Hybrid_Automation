package tohid.usa.testNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(dependsOnMethods = {"test1"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(dependsOnMethods = {"test2"})
	public void test3() {
		System.out.println("test3");
	}

}
