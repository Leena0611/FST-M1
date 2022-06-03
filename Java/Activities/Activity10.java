package Activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Ron");
		hs.add("Hermoine");
		hs.add("Harry");
		hs.add("Snape");
		hs.add("Dumbledore");
		hs.add("Black");
		
		System.out.println(hs);
		System.out.println(hs.size());	
		
		hs.remove("Snape");
		System.out.println(hs.contains("Ron"));
		
		System.out.println(hs);
			
		
	}

}
