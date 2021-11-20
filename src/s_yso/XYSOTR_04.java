package s_yso;
/*
 * Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.

r=7;

Pi=3.14

Ipucu:

Dairenin Cevresi : 2Pir

Dairenin Alani : Pirr

Ornek Cikti:

43.96

153.86
 */

import java.util.Scanner;

public class XYSOTR_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen hesaplama yapmak istediginiz dairenin yari capini  giriniz");
		double cap = scan.nextDouble();

		double cevre = 2 * Math.PI * cap;

		double alan = Math.PI * cap * cap; // Math.PI matematik classindan bi ozellik pow sqrt gibi

		System.out.println("Dairenin ; \nCevresi : " + cevre + "\nAlani   : " + alan);

		scan.close();
	}
}