//*******************************************************************
// Method name:boyGirl 
//Reads input from file
//By: Jessica Sites 
//Date: 11/13/19 
//*******************************************************************
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BoyGirl {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("boysgirls.txt"));
		boyGirl(input);
	}

	public static void boyGirl(Scanner in) {
		int boyCount = 0;
		int boySum = 0;
		int girlCount = 0;
		int girlSum = 0;

		while (in.hasNext()) {
			in.next();
			boyCount++;
			boySum += in.nextInt();

			if (!in.hasNext())
				break;

			in.next();
			girlCount++;
			girlSum += in.nextInt();
		}

		System.out.println(boyCount + " boys, " + girlCount + " girls");
		System.out.println("Difference between boys' and girls' sums: " + Math.abs(boySum - girlSum));
	}
}
