/**
 * 
 */
package s_yso;

import java.util.Scanner;

/**
 * @author CELÝL Iki integer'i toplayan java programini yaziniz.
 * 
 *         int a=10
 * 
 *         int b=14
 * 
 *         Ornek Cikti:
 * 
 *         Sayilarin Toplami : 24
 */
public class XSYSOTR_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sirayla iki tamsayi giriniz\nSayi1 :");
		int sayi1 = scan.nextInt();
		System.out.println("Sayi2");
		int sayi2 = scan.nextInt();

		toplam(sayi1, sayi2);
		System.out.println("Girilen sayilar toplami  :" + toplam(sayi1, sayi2));

		scan.close();
	}

	public static int toplam(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;

		return toplam;
	}
}