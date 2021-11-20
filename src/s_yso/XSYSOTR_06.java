/**
 * 
 */
package s_yso;

import java.util.Scanner;

/**
 * @author CELÝL Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.
 * 
 *         Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50
 * 
 *         Ornek Cikti:
 * 
 *         Sayilarin Ortalamasi : 30
 */
public class XSYSOTR_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ortalamasi alinacak 5 sayi giriniz\nSayi1 :");
		double sayi1 = scan.nextDouble();
		System.out.println("Sayi2 :");
		double sayi2 = scan.nextDouble();
		System.out.println("Sayi3 :");
		double sayi3 = scan.nextDouble();
		System.out.println("Sayi4 :");
		double sayi4 = scan.nextDouble();
		System.out.println("Sayi5 :");
		double sayi5 = scan.nextDouble();

		double ort = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;
		System.out.println("Girilen sayilarin ortalamasi : " + ort);
		scan.close();
	}
}