package Code;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		Map<Integer, String> reverseMap = new HashMap<>();
		
		for(Map.Entry<String, Integer> e : map.entrySet())
		{
			reverseMap.put(e.getValue(), e.getKey());
		}
		
		System.out.println(map);
		System.out.println(reverseMap);
	}

}
