
public class printPowersOfN {

		public static void main(String[] args) {
			printPowersOfN(4,3);
			printPowersOfN(5,6);
			printPowersOfN(-2,8);
		}
		
		//print powers of N 
		public static void printPowersOfN (final int base, final int pow) {
			for (int i = 0; i <= (int) pow; i++) {
				System.out.print((int)Math.pow(base, i) + ",");
			}
			System.out.println();
		}
		
		}