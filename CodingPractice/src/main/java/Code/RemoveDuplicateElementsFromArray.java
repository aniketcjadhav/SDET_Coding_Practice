package Code;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		
		
		int[] arr = {10, 20, 10, 30, 20, 40};
		
		int result[] = Arrays.stream(arr).distinct().toArray();
		
		System.out.println(Arrays.toString(result));

		
		Set<Integer> set = new LinkedHashSet<>(); //tomantain order
		
		for(int i : arr)
		{
			set.add(i);
		}
		
		System.out.println(set);
		int resultArr [] = set.stream().mapToInt(Integer::intValue).toArray();
		
		
	}

}
