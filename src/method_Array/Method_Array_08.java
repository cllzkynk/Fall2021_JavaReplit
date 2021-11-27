package method_Array;

import java.util.Arrays;

public class Method_Array_08 {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts 2 integer Arrays as parameters And adds 2
		 * array into a new Array and prints it.
		 * 
		 * Input1={1,2,3,4}
		 * 
		 * Input2={5,6}
		 * 
		 * Output={1,2,3,4,5,6}
		 */

	int arr1[]={1,2,3,4,7,8};
	int arr2[]={5,6};
	
	
	System.out.println(Arrays.toString(add(arr1,arr2)));
	
	}
	
	public static int[] add(int[] arr1, int[] arr2) {
		int arr3[] = new int [arr1.length+arr2.length];
		for ( int i = 0; i < arr1.length; i++) {
			arr3[i]=arr1[i];
		}
		
		for (int j = 0; j < arr2.length; j++) {
			arr3[arr1.length+j]=arr2[j];
		}
		
		Arrays.sort(arr3);
		
		
		
		return arr3;
	}

}
