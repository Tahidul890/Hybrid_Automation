package usa.tohid.javaCoding;

import org.testng.annotations.Test;

public class FindingEvenAndOddNumber {
	@Test
	public void findEvenNum() {
		int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i <= num.length; i++) {
			if(i%2 == 0) {
				System.out.println(num[i]);				
			}
		}
	}
}
