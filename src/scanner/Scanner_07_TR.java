package scanner;

import java.util.Scanner;

public class Scanner_07_TR {

	public static void main(String[] args) {

		// Kullanýcý tarafýndan girilen DOUBLE sayýyý tam sayýya çeviren bir program
		// yazýnýz.

		Scanner input = new Scanner(System.in);
		System.out.println("virgullu bi sayi gir");
		double d = input.nextDouble();

		long l = (long) d;
		float f = (float) l;
		int i = (int) f;

		System.out.println("Integer ====>" + i);
		input.close();
	}
}
