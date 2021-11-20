/**
 * 
 */
package forWhile;

import java.util.Scanner;

/**
 * @author CEL�L
 * 
 */
public class For_While_07_TR {

	/** Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
	 * Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, herhangi
	 * bir say� M�kemmel Say� olarak bilinir. Input :
	 * 6
	 * Output:
	 * 6 Mukemmel Sayidir.
	 * ======================
	 * Input
	 * 7
	 * Output:
	 * 7 Mukemmel Sayidir degildir.
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Mukemmelligini kontrol icin bir sayi gir");
		int sayi=scan.nextInt();
		int topla=0;
		
		for (int i = 1; i < sayi; i++) {
			if (sayi%i==0) {
				topla+=i;
				
			}
		}
if (topla==sayi) {
	System.out.println("Girilen sayi mukemmel sayidir");
} else {
	System.out.println("Girilen sayi mukemmel sayi degildir");
}
scan.close();
	}

}
