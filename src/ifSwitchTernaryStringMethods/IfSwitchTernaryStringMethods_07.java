package ifSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_07 {

	public static void main(String[] args) {
		/*
		 * Sayinin Mükemmel sayý olup olmadýðýný kontrol eden Java kodunu yazýn.
		 * 
		 * Sayýnýn kendisi hariç pozitif bölenlerinin toplamý o sayýya eþitse, herhangi
		 * bir sayý Mükemmel Sayý olarak bilinir. Input :
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
