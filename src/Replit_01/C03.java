package Replit_01;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan dikdortgenin kenar uzunluklarini alin ve dikdortgenin alanini ve
		 * Cevresini konsola yazdiran bir program yazin.
		 * 
		 * Ornek cikti:
		 * 
		 * Alan: 32
		 * 
		 * Cevre: 24
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Dikdortgenin kenar uzunluklarini giriniz :");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();

		System.out.println("Alan : " + kenar1 * kenar2);
		System.out.println("Cevre : " + (kenar1 + kenar2) * 2);
		scan.close();

	}

}
