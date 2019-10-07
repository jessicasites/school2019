// print out first 12 Fibonacci numbers using for loop 

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("The first 12 Fibonacci numbers are:");

		int a = 0; 
		int b = 1; 
		int c; 
		
		for(int i = 0; i <12; i++) 
		{
		
			System.out.print(a + ", ");
			c = a + b;
			a = b;
			b = c;
		
	}

}
}
