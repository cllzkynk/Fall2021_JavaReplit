package ifSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_04 {

	public static void main(String[] args) {
		/*
		 * Char de�i�ken yan�t�n�n de�erini test eden ve a�a��daki i�lemleri
		 * ger�ekle�tiren bir switch ifadesi yaz�n: yan�t a ise, "Talebiniz i�leniyor"
		 * mesaj� yazd�r�l�r yan�t b ise, "yine de ilgilendi�iniz i�in te�ekk�r ederiz"
		 * mesaj� yazd�r�l�r yan�t c ise, "�zg�n�z, �u anda herhangi bir yard�m yok"
		 * mesaj� yazd�r�l�r ba�ka herhangi bir yan�t de�eri i�in,
		 * 
		 * "Ge�ersiz giri�, l�tfen tekrar deneyin!" yazd�r�l�r
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir karakter (harf) gir");
		String str = scan.next();

		char ch = str.toLowerCase().charAt(0);

		if (str.length() == 1) {

			switch (ch) {
			case 'a':
				System.out.println("Talebiniz i�leniyor");
				break;
			case 'b':
				System.out.println("yine de ilgilendi�iniz i�in te�ekk�r ederiz");
				break;
			case 'c':
				System.out.println("�zg�n�z, �u anda herhangi bir yard�m yok");
				break;

			default:
				System.out.println("Ge�ersiz giri�, l�tfen tekrar deneyin!");
				break;
			}
		} else {
			System.out.println("Lutfen tek harf girisi yapiniz. Bir harf anladin mi bir harf");
		}
		scan.close();
	}

}
