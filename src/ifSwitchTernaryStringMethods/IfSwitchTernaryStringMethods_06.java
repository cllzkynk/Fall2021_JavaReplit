package ifSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_06 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim yazmas�n� isteyin, ad�n uzunlu�u 3 olmal�d�r. Ard�ndan,
		 * ad�n ayn� karakterlere sahip olup olmad���n� kontrol edin.
		 * 
		 * Eger ayn� karakterlere sahipse
		 * 
		 * "isim ayni karakterlere sahiptir." yazdirin.
		 * 
		 * Eger ayni kaakterlere sahip degilse
		 * 
		 * "Dizenin benzersiz karakterleri var" yazdirin.
		 * 
		 * Ternary kullanin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir kelime  gir");
		String isim = scan.next().toLowerCase();
		boolean flag = false;

		for (int i = 0; i < isim.length(); i++) {
			for (int j = i + 1; j < isim.length(); j++) {
				if (isim.charAt(i) == isim.charAt(j)) {
					flag = true;
				}
			}
		}

		if (flag) {
			System.out.println("     If ile ==>> isim ayni karakterlere sahiptir.");
		} else {
			System.out.println("     If ile ==>>Dizenin benzersiz karakterleri var");
		}
		
		System.out.println(flag?"Ternary ile ==>>isim ayni karakterlere sahiptir.":"Ternary ile ==>>Dizenin benzersiz karakterleri var" );

		scan.close();

	}

}
