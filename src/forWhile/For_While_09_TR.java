package forWhile;

import java.util.Scanner;

/**
 * @author CELÝL
 */
public class For_While_09_TR {
	/*
	 * Kullanýcýnýn girdiði sayýyý tersine çeviren bir java programý yazýnýz.
	 * (Mulakat Sorusu)
	 * 
	 * Input :1238
	 * 
	 * Output :Girilen Numananin Tersi: 8321
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Gir bakalim bir sayi soyle 4~5 basamakli falan");
		int sayi = scan.nextInt();
		String Ssayi = String.valueOf(sayi);

		String depo = "";

		for (int i = Ssayi.length() - 1; i >= 0; i--) {

			depo = depo + Ssayi.charAt(i);

		}
		System.out.println("Cevrilen sayi  : " + depo);
		scan.close();
	}

}
