package scanner;

import java.util.Scanner;



public class Scanner_08_TR {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının
		 * toplamını bulmasını isteyin.
		 * 
		 * Örnek Çıktı:
		 * 
		 * Verilen tamsayının rakamları toplamı 10'dur.
		 */
		int birler, onlar, yuzler;
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir  tamsayi  giriniz");
		if (input.hasNextInt()) {
			int sayi = input.nextInt();
			if (sayi >= 100 && sayi <= 999) {

				birler = sayi % 10;
				onlar = (sayi / 10) % 10;
				yuzler = sayi / 100;

				System.out.println("Girilen sayinin rakamlari toplami  : " + (onlar + birler + yuzler));

			} else {
				System.out.println("3 Basamakli girde ugrastirma makinayi");
			}

		} else {
			System.out.println("Tam sayi gir");
		}

		input.close();

	}

}
