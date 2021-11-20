/**
 * 
 */
package forWhile;

import java.util.Scanner;

/*
 * @author CELÝL 
 */
public class For_While_02_TR {
	/*
	 * Kullanýcýdan 2 tamsayý girmesini ve ardýndan GCD (En Büyük Ortak Bölen) ve
	 * LCM'yi (En Küçük Ortak Kat) bulmasýný isteyin. Input : 30 40 Beklenen Cikti:
	 * Beklenen Cikti: 30 ve 40 icin GCD = 10
	 * 
	 * 30 ve 40 icin LCM = 12
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen birinci sayinizi giriniz");
		int db1 = scan.nextInt();
		System.out.println("Lutfen ikinci sayinizi giriniz");
		int db2 = scan.nextInt();

		int ebob = 1;
		int ekok = 1;
		int ekokMax = db1 * db2;

		System.out.println("\n\nEbob sonucu ;");
		for (int i = 1; i <= db1 && i <= db2; i++) {
			if (db1 % i == 0 && db2 % i == 0) {
				ebob = i;			}		}
		System.out.println("\n" + db1 + " ve " + db2 + " sayilarinin EBOB`u " + ebob + " olur");
	
		System.out.println("\n\nEkok sonucu ;");
		for (int i = ekokMax; i >= db1 && i >= db2; i--) {
			if (i % db1 == 0 && i % db2 == 0) {
				ekok = i;
			}
		}
		System.out.println("\n" + db1 + " ve " + db2 + " sayilarinin EKOK`u " + ekok + " olur");
scan.close();   }  }
