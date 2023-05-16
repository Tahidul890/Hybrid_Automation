package usa.tohid.javaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ReomivingAndFindingDuplicates {
	@Test//98, 87, 76, 65, 54, 43, 32, 87, 54
	public void FindTheDuplicatesFromArray() {

		String salary[] = { "Tohid", "Rofiq", "Meraz", "Fahad", "Tohid" };
		for (int i = 0; i < salary.length; i++) {
			for (int j = i + 1; j < salary.length; j++) {
				if (salary[i] == salary[j]) {
					System.out.println(salary[i]);
				}
			}
		}
	}
	@Test
	public void RemoveDuplicates() {

		List<Integer> num = Arrays.asList(12, 23, 34, 45, 56, 12, 34);
		List<Integer> dupNum = num.stream().distinct().collect(Collectors.toList());
		System.out.println(dupNum);

	}
	
	@Test
	public void RemoveDuplicates1() {
		List<String> name = Arrays.asList("Tohid", "Rofiq", "Meraz", "Fahad", "Tohid");
		List<String> distName = name.stream().distinct().collect(Collectors.toList());
		System.out.println(distName);
	}
}