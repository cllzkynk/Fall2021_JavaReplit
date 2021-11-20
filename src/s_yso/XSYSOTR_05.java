package s_yso;

import java.util.Scanner;

/*
 * Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.

A=5

B=3

Ipucu: Dikdortgenin Cevresi : 2*(A+B);

Dikdortgenin Alani : A * B ;

Ornek Cikti:

Dikdortgenin Cevresi : 16

Dikdortgenin Alani : 15
 */
public class XSYSOTR_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen hesaplama yapmak istediginiz dikdortgenin ilk kenarini giriniz");

		double k1 = scan.nextDouble();
		System.out.println("Ikinci   kenarini giriniz");
		double k2 = scan.nextDouble();

		double cevre = 2 * (k1 + k2);
		double alan = k1 * k2;

		System.out.println("Verilen dikdortgenin ; \nCevresi : " + cevre + "\nAlani   : " + alan);
		scan.close();
	}
}