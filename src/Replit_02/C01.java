package Replit_02;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve
		// sayinin kupunun yarisini konsola yazdiran bir program yazin.

		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen bir sayi giriniz : ");
		int sayi=scan.nextInt();
		System.out.println(sayi*sayi*sayi/2);
		
		
		scan.close();
		
	}

}
