package usa.tohid.javaCoding;

import java.util.Arrays;

import org.testng.annotations.Test;

@Test
public class FindingHighestNumber {
	public void findThirdHighestNum() {
		int num[] = { 45, 13, 42, 98, 47, 94, 35 };
		Arrays.sort(num);
		int store = num.length;
		int result = num[store - 3];
		System.out.println(result);
	}
}
