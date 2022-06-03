package Activities;

import java.util.Arrays;

public class Activity4 {
	
	public static int[] ascendSort(int[] Arr35) {
		
		int[] Array = Arr35;
		int i , j=1, temp = 0;
		for (i=1;i<=Array.length-1;i++) {
			temp = Array[i];
			j=i-1;
			 while(j>=0 && temp < Array[j]) {
				 Array[j+1]=Array[j];
				 j--;
			}
			 Array[j+1]=temp;
		}
		
		return Array;
		
	}
	
	public static void main(String args[]) {
		int[] Arr = {5,9,4,2,1};
		int[] Arr2 = ascendSort(Arr);
		System.out.println(Arrays.toString(Arr));
		System.out.println(Arrays.toString(Arr2));
	}
}
