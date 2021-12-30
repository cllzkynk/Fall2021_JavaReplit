package javaKodSorulari01;

import java.util.Scanner;

public class JavaSorulari04 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari toplamini
		 * konsolda yazdiran programi yaziniz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 3 basamakli bir sayi giriniz");

		int sayi = scan.nextInt();

		int birlerBas = sayi % 10;
		int onlarBas = (sayi / 10) % 10;
		int yuzlerBas = sayi / 100;

		System.out.println("Girdiginiz 3 basamakli sayinin basamaklari toplami : " + (birlerBas + onlarBas + yuzlerBas));

		// Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari toplamini
		// konsolda yazdiran programi yaziniz

		
		System.out.println("Lutfen 3 basamakli bir sayi daha giriniz");

		int sayi2 = scan.nextInt();

		int birlerBas2 = sayi % 10;
		int onlarBas2 = (sayi / 10) % 10;
		int yuzlerBas2 = sayi / 100;
		
		if ((sayi2>=100 && sayi2<=999) || (sayi2 <= -100) && (sayi2>=-999)) {
			System.out.println("Girdiginiz 3 basamakli sayinin basamaklari toplami : " + (birlerBas2 + onlarBas2 + yuzlerBas2));
		} else { 
			System.out.println("Girdiginiz sayi 3 basamakli degildir");

		}
		

		scan.close();
	}

}
