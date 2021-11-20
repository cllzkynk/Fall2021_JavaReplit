package ifSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_03 {

	public static void main(String[] args) {
		/*
		 * Verilen iki say�n�n (s�f�rdan b�y�k veya s�f�ra e�it) toplam�n� hesaplayan ve
		 * yazd�ran bir Java program� yaz�n. Verilen tamsay�lar veya toplam 10'dan fazla
		 * basamakli olursa, "OverFlow" yazd�r�n. Ornek: INPUT : 25 46 OUTPUT :
		 * Numaralarin Toplami: 71
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayiyi gir");
		double s1 = scan.nextDouble();
		System.out.println("Ikinci sayiyi gir");
		double s2 = scan.nextDouble();

		double total = s1 + s2;
		String ttl = Double.toString(total);
		// System.out.println(ttl);
		if (ttl.length() > 10) {
			System.out.println("OverFlow");
		} else {
			System.out.println("Total is :" + total);
		}

		scan.close();

	}

}
