package Activities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Red");
		hm.put(2, "Blue");
		hm.put(3, "Green");
		hm.put(4, "White");
		hm.put(5, "Black");
		
		Set<Entry<Integer, String>> hs = hm.entrySet();
		System.out.println(hs);
		
		for (Entry<Integer, String> entry : hs) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println(hs.contains("Blue"));
		
		Set<Integer> keys = hm.keySet();
		for (Integer k : keys) {
			System.out.println("keys:"+k);
		}
		
		//System.out.println(hm.values());
		Collection<String> value = hm.values();
		System.out.println(value);
	}

}
