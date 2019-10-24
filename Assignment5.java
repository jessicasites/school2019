//*******************************************************************
// Two methods: season and printGPA 
// Description of the class or method purpose: season: take a date from user
//to name which season it's in. printGPA: calculates student's grade 
//By: Jessica Sites 
//Date: 10/23/19
//*******************************************************************
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
        System.out.print("Please enter the month as a number: ");
        int month = console.nextInt();
        System.out.print("Please enter the day: ");
        int day = console.nextInt();
       
        System.out.println(season(month,day));
		printGPA();	
	}
// 12/16 and 3/15, the method should return "winter".
// 3/16 and 6/15, the method should return "spring".
// 6/16 and 9/15, the method should return "summer".
// 9/16 and 12/15, the method should return "fall".
     public static String season(int month, int day){
     	if (month < 3 || (month == 3 && day <= 15)) {
             return "Winter";
         } else if (month < 6 || (month == 6 && day <= 15)) {
             return "Spring";
         } else if (month < 9 || (month == 9 && day <= 15)) {
             return "Summer";
         } else if (month < 12 || (month == 12 && day <= 15)) {
             return "Fall";
         } else {
             return "Winter";
         }
     } 
	 public static void printGPA (){ 
		  Scanner console = new Scanner(System.in); 
		  System.out.print("Enter the student's name,");
		  System.out.print(" how many scores and the scores seperated");
		  System.out.print(" by spaces: "); 
		  double sum = 0.0;
		  String name = "";
		  name = console.next(); 
		  int score = console.nextInt(); 
		  
		 for(int i = 0; i < score; i ++){ 
		    sum += console.nextInt();
		 }
	
		 System.out.println(name + "'s grade is " +  sum/ score); 
	}
	
}