package forWhile;

import java.util.Scanner;

/*
 * @author CEL�L 
 */
public class For_While_04_TR {

	/*
	 * *Girdi olarak bir tamsay� kabul eden ve fakt�riyel hesaplayan programi
	 * yaz�niz.
	 * 
	 * Input : 6
	 * 
	 * Output: 6!=65432*1=720
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("fakyoriyeli hesaplanacak sayiyi giriniz");
		long f = scan.nextLong();
		long faktoriyel = 1;
		for (int i = 1; i <= f; i++) {
			faktoriyel *= i;
		}
		System.out.println(faktoriyel);
		scan.close();
	}

}
