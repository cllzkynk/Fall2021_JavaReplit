
package forWhile;

import java.util.Scanner;

/**
 * @author CEL�L
 *
 */
public class For_While_01_TR {
	/*
	 * Kullan�c�dan bir isim ve bir karakter girmesini isteyin, ard�ndan d�ng�leri
	 * kullanarak karakterin isimde ka� kez tekrarland���n� kontrol edin.
	 * 
	 * char ch1= 'a' ;
	 * 
	 * String name =�John came late"
	 * 
	 * Expected Output:
	 * 
	 * 
	 * Number of a = 2
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir isim giriniz");
		String str = scan.nextLine();
		System.out.println("Girilen ismin icinde aramak istedigniz karakteri giriniz");
		char ch = scan.next().charAt(0);

		int chAdet = 0;

		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				chAdet += 1;

			}

		}

		System.out.println("Girilen ifadede aradiginiz karakter olan " + ch + " , " + chAdet + "  kez  bulunuyor");
		scan.close();
	}
}
