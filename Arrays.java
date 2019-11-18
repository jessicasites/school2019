/* Jessica Sites, 11/16/19
 * 
 * isUnique and isSorted methods 
 * 
 * Method 1. Write a method called isUnique that accepts an array of 
 * integers as a parameter and returns a boolean value 
 * indicating whether or not the values in the array are unique 
 * (true for yes, false for no). The values in the list are 
 * considered unique if there is no pair of values that are 
 * equal. For example, if passed an array containing 
 * {3, 8, 12, 2, 9, 17, 43, -8, 46}, your method should 
 * return true, but if passed {4, 7, 3, 9, 12, -47, 3, 74}, 
 * your method should return false because the value 3 appears 
 * twice.
 * 
 *Method 2. Write a method called isSorted that accepts an array of 
*real numbers as a parameter and returns true if the list is 
*in sorted (nondecreasing) order and false otherwise. For example, 
*if arrays named list1 and list2 store [16.1, 12.3, 22.2, 14.4] 
*and [1.5, 4.3, 7.0, 19.5, 25.1, 46.2] respectively, 
*the calls isSorted(list1) and isSorted(list2) 
*should return false and true respectively. Assume the array has at least one element.
*A one-element array is considered to be sorted.
*/
public class Arrays {

	public static void main(String[] args) {
		double[] l1 = { 16.1, 12.3, 22.2, 14.4 };
		double[] l2 = { 1.5, 4.3, 7.0, 19.5, 25.1 };
		int[] array1 = { 3, 8, 12, 2, 9, 17, 43, -8, 46 };
		int[] array2 = { 4, 7, 3, 9, 12, -47, 3, 74 };
		System.out.println("Method 1:");
		System.out.println(isUnique(array1));
		System.out.println(isUnique(array2));
		System.out.println();
		System.out.println("Method 2:");
		System.out.println(isSorted(l1));
		System.out.println(isSorted(l2));
	}

	public static boolean isSorted(double[] l) {
			for (int i = 0; i < l.length -1; i++) {
				if (l[i+1] < l[i]) {
					return false;
				}
			}
			return true;
		}


	public static boolean isUnique(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
