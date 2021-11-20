/**
 * 
 */
package s_yso;

import java.util.Scanner;

/**
 * @author CELÝL Verilen integer sayilarin Toplamini, carpimini, cikarma
 *         islemini ve bolme islemini yapan java kodunu yaziniz.
 * 
 *         num1=100;
 * 
 *         num2=25;
 * 
 *         Ornek Cikti:
 * 
 *         125
 * 
 *         2500
 * 
 *         75
 * 
 *         4
 */
public class XSYSOTR_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sirayla iki  tamsayi giriniz\nSayi1 :");
		int sayi1 = scan.nextInt();

		System.out.println("Sayi2 :");
		int sayi2 = scan.nextInt();

		topla(sayi1, sayi2);
		cikar(sayi1, sayi2);
		carp(sayi1, sayi2);
		bol((double) sayi1, (double) sayi2);

		System.out.println("Girilen " + sayi1 + " ve " + sayi2 + " icin\nToplamlari : " + topla(sayi1, sayi2)
				+ "\nFarklari   : " + cikar(sayi1, sayi2) + "\nCarpimlari : " + carp(sayi1, sayi2) + "\nBolumleri  : "
				+ bol((double) sayi1, (double) sayi2));
		scan.close();
	}

	public static int topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;

		return toplam;
	}

	public static int cikar(int sayi1, int sayi2) {
		int fark = sayi1 - sayi2;
		return fark;
	}

	public static int carp(int sayi1, int sayi2) {
		int carpim = sayi1 * sayi2;
		return carpim;
	}

	public static double bol(double sayi1, double sayi2) {
		double bolum = (double) sayi1 / (double) sayi2;
		return bolum;
	}

}