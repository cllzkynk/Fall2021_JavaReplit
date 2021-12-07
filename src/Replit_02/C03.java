package Replit_02;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan dikdortgenin kenar uzunluklarini alin
		 * ve dikdortgenin alanini ve
		 * Cevresini konsola yazdiran bir program yazin.
		 * Ornek Cikti:
		 * Alan: 32
		 * Cevre: 24
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen dikdortgenin kenar uzunluklarini giriniz : ");
		
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		System.out.println("alan : " + kenar1*kenar2 + "\ncevresi : " + (kenar1+kenar2)*2);
		
		
		scan.close();
	}

}
