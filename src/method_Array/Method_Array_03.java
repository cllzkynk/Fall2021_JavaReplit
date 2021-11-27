package method_Array;

import java.util.Scanner;

public class Method_Array_03 {

	public static void main(String[] args) {
		/*
		 * Write a method which accepts a String as parameter and prints the sum of the
		 * digits, present in the given string.
		 * 
		 * input : ade1r4d3
		 * 
		 * output : 8
		 * 
		 * Hint : Use Character.isDigit() Integer.valueOf()
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Gir bisiler");
		String str=scan.nextLine();
		
		convertor(str);
scan.close();
	}

	public static void convertor(String str) {
	int toplam=0;
		String strarr[]=str.split("");
	for (int i = 0; i < strarr.length; i++) {
		char ch= strarr[i].charAt(0);
		if( Character.isDigit(ch)) {
			toplam+=Integer.valueOf(strarr[i]);
		}
	}
		System.out.println(toplam);
	}

}
