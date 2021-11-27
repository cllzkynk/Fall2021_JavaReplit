package method_Array;

public class Method_Array_07 {
	/*
	 * Write a method that accepts an array as parameter and returns sum off all
	 * elements in the array Then print the result in the main method.
	 * 
	 * Eg :
	 * 
	 * input : {1,2,3,4,5,6,7,8};
	 * 
	 * output: 36
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println(sumOfElements(arr));
	}

	public static int sumOfElements(int[] arr) {
		int toplam = 0;
		for (int i = 0; i < arr.length; i++) {
			toplam += arr[i];
		}

		return toplam;
	}
}
