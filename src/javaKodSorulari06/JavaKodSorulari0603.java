package javaKodSorulari06;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
 * önceden tanimlanmis array'de olup olmadigini kullaniciya donen bir method yaziniz
 * 
 * 
 * 
 * 
 * Array={3,5,21,32,34,45,56,57,76,87,95}
 * 
 * 
 * input:5 Output: Girdiginiz sayi Array'de var
 * input:15 Output: Girdiginiz sayi Array'de yok
 */

public class JavaKodSorulari0603 {


	private final static int arr[] = { 3, 5, 21, 32, 34, 45, 56, 57, 76, 87, 95 };
	private static int girilenSayi;
	




	public static void main(String[] args) {

	
		arraydeBulunuyorMu();
		
		
	}

		
	
	public static void arraydeBulunuyorMu() {

		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
		
		girilenSayi= scan.nextInt();
		
		if (Arrays.binarySearch(arr, girilenSayi)>=0) {
			System.out.println("Girdiginiz sayi Array'de var");
		} else {
			System.out.println("Girdiginiz sayi Array'de yok");	
		}

		
	}

	
	
	
	
	
}
