package ifSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_07 {

	public static void main(String[] args) {
		/*
		 * 2 kelime olu�turun: isim1 ve isim2
		 * 
		 * // isim1 �ift say�da karakter i�eriyorsa,
		 * 
		 * // ikinci kelimeyi ilk ad�n ortas�na yerle�tirin
		 * 
		 * // ilk kelime tek sayida karakter iceriyorsa
		 * 
		 * // �isim1, isim2 ye eklenemiyor� yazd�r�n
		 * 
		 * // �rne�in: // isim1= mehmet // isim2= ahmet // Yazd�r ==> mehahmetmet
		 * 
		 * // isim1= memet // isim2= ahmet // Yazd�r ==> isim1, isim2 ye eklenemiyor
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki isim giriniz\nIsim1 :");
		String name1 = scan.next();
		System.out.println("Isim2:  ");
		String name2 = scan.next();
		int OrtaBul;
		if (name1.length() % 2 == 1) {
			System.out
					.println("Ilk isim tek sayida karakter iceriyor\nnormalde ortasina bir kelime yerlestirilemez\nama "
							+ "ben tam ortadaki harfi kaldirip\nonun yerine ikinci kelimeyi yerlestirecegim");
		}
		System.out.println("===================================");
		if (name1.length() % 2 == 1) {
			OrtaBul = name1.length() / 2;
			System.out.println(name1.substring(0, OrtaBul) + name2 + name1.substring(OrtaBul + 1));
		} else {
			OrtaBul = name1.length() / 2;
			System.out.println(name1.substring(0, OrtaBul) + name2 + name1.substring(OrtaBul));
		}

		scan.close();

	}

}
