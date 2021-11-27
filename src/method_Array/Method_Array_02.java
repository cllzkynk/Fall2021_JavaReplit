package method_Array;

import java.util.Scanner;

public class Method_Array_02 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that reverse a sentence by using Array (with all spaces
		 * and special characters).
		 * 
		 * Input : Coding is greate.
		 * 
		 * Output : .etaerg si gnidoC
		 */
Scanner scan=new Scanner (System.in);
System.out.println("Gir bisiler");
String str=scan.nextLine();
String[]strarr=str.split("");

for (int i = strarr.length-1; i >=0; i--) {
	System.out.print(strarr[i]);
}
scan.close();
	}

}
