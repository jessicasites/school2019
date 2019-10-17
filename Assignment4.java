//*******************************************************************
// Assignment 4 
// Write a method called repl that accepts a String and a number
// of repetitions as parameters and returns 
// the String concatenated that many times.
// For example, the call repl("hello", 3) should return "hellohellohello". 
// Name: Jessica Sites 
// Date: 10/16/19 
//*******************************************************************
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = console.nextLine();
		System.out.print("Enter a number: ");
		int number = console.nextInt();
		
		System.out.println(repl(word, (int) number));
	        
	}

	public static String repl(String word, int number) { 
	String result = "";
		for(int i=0; i<  number; i++) {
			result += word + ", ";
			
			}
		return result; 
	
				
	
	
	
}
	}