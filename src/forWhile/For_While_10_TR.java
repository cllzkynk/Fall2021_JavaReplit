package forWhile;

import java.util.Scanner;

/**
 * @author CEL�L
 */
public class For_While_10_TR{
	/*
	 * *1'den 100'e kadar olan do�al say�lar�n toplam�n� bulan program� yaz�n�z.

OutPut:

Sayilarin Toplami : 5050
	 */
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Sana kaca kadar toplam lazim bakiim");
	int limit=scan.nextInt();
	int toplam=0;
	
	for (int i = 0; i <=limit; i++) {
		toplam+=i;
	}
	System.out.println("Sifirdan  " +limit+ " sayisina kadar olan tam sayilarin toplami = "+ toplam );
	scan.close();
}
}
