package ifSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_08 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim girmesini isteyin ve son 2 harfinin 3 kopyas�ndan
		 * olu�an yeni bir String yazd�r�n
		 * 
		 * Kullanicidan alinan isim uzunlu�u en az 2 olacakt�r.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki karakterden uzun bi isim gir bakalim:");
		String isim = scan.nextLine();
		if (isim.length() <= 2) {
			System.out.println("Ismin islem yapmak icin cok kisa bee");
		} else {
			String soniki = isim.substring(isim.length() - 2);

			for (int i = 0; i < 3; i++) {
				System.out.print(soniki);
			}

			scan.close();

		}
	}

}
