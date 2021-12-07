package Code_Hunter;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
		// ceviren bir method yaziniz.
		// Bu methodu main methodun disinda olusturup main methodun
		// h*3600 s mil=km*1.6 gram=kg*1000
		// icinden cagiriniz.

		Scanner scan = new Scanner(System.in);
		System.out.print("Degistireceginiz birimi giriniz :");
		String birim = scan.nextLine();

		System.out.println("Cevrilecek birimin miktarini giriniz :");
		double miktar = scan.nextDouble();

		cevirici(birim, miktar);
		scan.close();
	}

	public static void cevirici(String birim, double miktar) {

		switch (birim) {
		case "saat":
			System.out.println(miktar * 3600);
			break;
		case "mil":
			System.out.println(miktar * 1.6);
			break;
		case "kilogram":
			System.out.println(miktar * 1000);
			break;
		default:
			System.out.println("hatali birim girdiniz");
		}

	}

}
