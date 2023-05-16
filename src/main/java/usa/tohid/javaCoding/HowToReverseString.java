package usa.tohid.javaCoding;



import org.testng.annotations.Test;

public class HowToReverseString {
	@Test
	public void reverseString() {
		String value = "Infosys";
		char [] store = value.toCharArray();
		for(int i = (store.length)-1; i >= 0; i--) {
			System.out.println(store[i]);
		}
	}
}
	