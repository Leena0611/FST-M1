package Activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<String>();
		myList.add("Eleven");
		myList.add("Mike");
		myList.add("Hopper");
		myList.add("Dustin");
		myList.add("Nancy");
		myList.add(5, "Will");
		
		for (int i=0;i<=myList.size()-1;i++) {
			System.out.println(myList.get(i));
		}
		
		System.out.println("Does List contains Nancy: "+myList.contains("Nancy"));
		if (myList.contains("Will")){
			myList.remove("Will");
		}
		
		for (String a : myList) {
			System.out.println(a);
		}
	}

}
