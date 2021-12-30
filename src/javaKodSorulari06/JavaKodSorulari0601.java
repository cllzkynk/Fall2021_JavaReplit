package javaKodSorulari06;

import java.util.Arrays;

/*
	 * String'i ters cevirmek icin bir java programi yazin
	 * 1.yol: StringBuilder() kullanarak
	 * 2.yol: String class'ini kullanarak
	 * 3.yol: Bir method olusturun,ardindan methodu main method'dan cagirin.
	 */

public class JavaKodSorulari0601 {
	
	
	
	public static String name = "Ziyaaddin Yaramis";
	
	 public static StringBuilder sb = new StringBuilder("Ziyaaddin Yaramis");
	
	
	
	public static void main(String[] args) {
		
		sb.reverse();
		System.out.println("1.yol :"+ sb);  // 1. yol simaraY niddaayiZ
		
		sb.reverse();
		System.out.println(sb); // Ziyaaddin Yaramis
		
		
		String nameTers1 = "";
		
		for (int i = name.length()-1; i>=0; i--) {
			
			nameTers1 = nameTers1 + name.substring(i, i+1);
		
		}
		
		System.out.println("2. yol : "+ nameTers1); // 2.yol
		
		stringTers(name);
	}

	public static void stringTers(String name) {
		
		String nameTers = "";
		
	for (int i = name.length()-1; i>=0; i--) {
		
		nameTers = nameTers + name.charAt(i);
		
	}
		
	System.out.println("3.yol : "+ nameTers);
	}
}
