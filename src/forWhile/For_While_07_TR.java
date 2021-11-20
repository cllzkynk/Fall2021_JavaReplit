/**
 * 
 */
package forWhile;

import java.util.Scanner;

/**
 * @author CELÝL
 * 
 */
public class For_While_07_TR {

	/** Sayinin Mükemmel sayý olup olmadýðýný kontrol eden Java kodunu yazýn.
	 * Sayýnýn kendisi hariç pozitif bölenlerinin toplamý o sayýya eþitse, herhangi
	 * bir sayý Mükemmel Sayý olarak bilinir. Input :
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
