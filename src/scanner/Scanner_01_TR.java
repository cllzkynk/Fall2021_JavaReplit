/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author CELÝL
 */
public class Scanner_01_TR {

	
	public static void main(String[] args) {
/*Kullanýcýdan bir sayý alýn ve sayýnýn küpünün yarýsýný konsola yazdýran bir program yazýn. */
		
		
		
		Scanner input=new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double sayi=input.nextDouble();
		double sonuc=(sayi*sayi*sayi)/2;
		
		System.out.printf("%.1f ",sonuc);
		
		input.close();
	}

}
