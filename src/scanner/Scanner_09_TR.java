package scanner;

import java.util.Scanner;


public class Scanner_09_TR {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Girilen zamaný saniyeye çeviren bir program yazýnýz.
		 * 
		 * Örnek Çýktý:
		 * 
		 * 1 saat 10 dakika 50 saniye ==>
		 * 
		 * 4250 saniye
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Lutfen birimi ve miktari giriniz\nSaat icin   : 1  \nDakika icin : 2 \nSaniye icin : 3 \n seciniz");
		int secim = scan.nextInt();

		System.out.println("Miktar");

		int miktar = scan.nextInt();

		if (secim == 1) {
			System.out.println("Girilen degerin sayiye karsiligi : " + (miktar * 60 * 60));
		}
		if (secim == 2) {
			System.out.println("Girilen degerin sayiye karsiligi : " + (miktar * 60));
		}
		if (secim == 3) {
			System.out.println("Girilen degerin sayiye karsiligi : " + (miktar));
		}
		// veya switch case ile yapilabilir

		switch (secim) {
		case 1:
			System.out.println("Girilen degerin sayiye karsiligi : " + (miktar * 60 * 60));
			break;
		case 2:
			System.out.println("Girilen degerin sayiye karsiligi : " + (miktar * 60));
			break;
		case 3:
			System.out.println("Girilen degerin sayiye karsiligi : " + (miktar));
			break;

		default:
			System.out.println("Lutfen secimi dogru yaptinizdan emin olunuz");

		}

		scan.close();

	}

}
