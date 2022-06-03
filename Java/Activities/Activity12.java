package Activities;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Addable a1;
		Addable a2;
		
		Addable a1 = (n1, n2) -> (n1 + n2);
		System.out.println(a1.add(10, 20));
		
		Addable ah2 = (int d1,int d2)->{int D = d1+d2;
		return D;};
			System.out.println("D:"+ah2.add(200, 900));
		
		// Lambda expression without return keyword.
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));
 
        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
	}

}
