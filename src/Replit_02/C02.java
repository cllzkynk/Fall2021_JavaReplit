package Replit_02;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan karenin kenar uzunlugunu alın ve
		 * karenin alanını ve cevresini konsola yazdıran bir program yazın.
		 * 
		 * Ornek Cikti :
		 * Alan: 9
		 * Cevre: 12
		 * 
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen karenin bir kenar uzunlugunu giriniz : ");
		int kenar=scan.nextInt();
		
		System.out.println("alan : " + kenar*kenar + "\ncevresi : " + kenar*4);
		
	
		scan.close();

	}

}
