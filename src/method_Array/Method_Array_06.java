package method_Array;

import java.util.Arrays;

public class Method_Array_06 {
/*
 * Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output :

min: 1

max: 6
 */
	public static void main(String[] args) {
		int[] arr = {3,2,5,4,1,6};

		findMaxMin(arr);
		System.out.println("Dizinin en kucuk degeri : "+arr[0]);
		System.out.println("Dizinin en buyuk degeri : "+arr[arr.length-1]);
		
	}

private static int[] findMaxMin(int[] arr) {
Arrays.sort(arr);
return arr;
}
}
