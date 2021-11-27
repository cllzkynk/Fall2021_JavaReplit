package method_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Array_04 {
	public static void main(String[] args) {
		/*
		 * Create a custom return type method accepts a name as parameter and prints the
		 * name as a char array.
		 * 
		 * (do not use toCharArray() method)
		 * 
		 * Input : John
		 * 
		 * Output :[J, o, h, n]
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Gir bisiler");
		String str=scan.nextLine();
		
	System.out.println(Arrays.toString(convertToArray(str))	);
		
	scan.close();	
	}

	public static String[] convertToArray(String str) {
		String arr[]=str.split("");
	
		return arr;
		
		
		
		
		
	}
}
