// Jessica Sites 
// Assignment 9: Product Class 
// 11/25/19
import java.text.NumberFormat;

public class Client {

	public static void main(String[] args) {
		// create object of class product and 
		// store data in variable w/ constructor 
		Product chair = new Product(1,"Brown, comfy chair", 200.00, 1);  
		Product couch = new Product(2,"Leather couch", 150.00, 2);
		Product ottoman = new Product(3,"Black ottoman",50.00, 1);
		Product table = new Product(4,"Antique table", 400.00, 1);
		
		System.out.println(chair);
		System.out.println(); 
		System.out.println(couch);
		System.out.println(); 
		System.out.println(ottoman);
		System.out.println(); 
		System.out.println(table);
	}
}