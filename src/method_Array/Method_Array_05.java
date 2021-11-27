package method_Array;

public class Method_Array_05 {

	public static void main(String[] args) {
		/*
		 * Write a java program that calculates the average value of array elements
		 * 
		 * input[]= {1,2,3,4,5,6,7}
		 * 
		 * Output : 4
		 */
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		double top = 0;

		for (int i = 0; i < arr.length; i++) {
			top += arr[i];
		}
		System.out.println("Listedeki verilerin ortalamasi = " + (top / arr.length));

	}

}
