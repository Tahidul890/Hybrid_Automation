package usa.tohid.javaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class RemoveDuplicates {
	@Test
	public void removeDuplicatesUsingList() {
		List<Object> value = Arrays.asList(12, 23, 45, 67,78, 12, 45, "Java", "Maven", "Java");
		List<Object> store = value.stream().distinct().collect(Collectors.toList());
		System.out.println(store);
	}
}
