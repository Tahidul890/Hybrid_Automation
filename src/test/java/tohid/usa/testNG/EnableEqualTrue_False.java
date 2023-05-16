package tohid.usa.testNG;

import org.testng.annotations.Test;

public class EnableEqualTrue_False {
    @Test(enabled = false)
	public void test1() {
		System.out.println("Print test 1");
	}
    @Test(enabled = true)
	public void test2() {
		System.out.println("Print test 2");
	}
    @Test(enabled = false)
	public void test3() {
		System.out.println("Print test 3");
	}
    @Test(enabled = false)
	public void test4() {
		System.out.println("Print test 4");
	}
	
}
