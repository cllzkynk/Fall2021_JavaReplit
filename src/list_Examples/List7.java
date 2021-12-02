/**
 * 
 */
package list_Examples;

import java.util.Arrays;

/**
 * @author CELÝL
 */
public class List7 {

	/**
	 * write a Java program to removes a specific element from an array and put the
	 * remaining elements in a new array and prints the new array
	 * 
	 * Input :{1,2,3,4,5,6}
	 * 
	 * element:6
	 * 
	 * Output : [1,2,3,4,5]
	 */
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 }; // verilen odevde son element kaldirildigi icin indexte sorun olmuyor
													// ama j`yi tanimlayip sorunu handle etmezsek aradan bir elemani
													// kaldirmak isdex sirasinda sorun cikariyor

		// remove element 6

		int[] arrnew = new int[arr1.length - 1];

		int j = 0;  // verilen odevde son element kaldirildigi icin indexte sorun olmuyor
		            // ama j`yi tanimlayip sorunu handle etmezsek aradan bir elemani
		            // kaldirmak isdex sirasinda sorun cikariyor

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 6) {
				arrnew[j] = arr1[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(arrnew));

	}

}
