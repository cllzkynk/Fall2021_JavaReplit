package ifSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_07 {

	public static void main(String[] args) {
		/*
		 * Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
		 * 
		 * Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, herhangi
		 * bir say� M�kemmel Say� olarak bilinir. Input :
		 * 
		 * 6
		 * 
		 * Output:
		 * 
		 * 6 Mukemmel Sayidir.
		 * 
		 * ======================
		 * 
		 * Input
		 * 
		 * 7
		 * 
		 * Output:
		 * 
		 * 7 Mukemmel Sayidir degildir.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Mukemmel sayi adedini gir");
		int sayi = scan.nextInt();
		int toplam = 0;

		for (int i = 1; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		if (toplam == sayi) {
			System.out.println("MUKKKEMMMELLLL");
		} else {
			System.out.println("Olmadi be kardes tutturamadim ");
		}

		scan.close();

	}

}
