/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author CEL�L
 */
public class Scanner_01_TR {

	
	public static void main(String[] args) {
/*Kullan�c�dan bir say� al�n ve say�n�n k�p�n�n yar�s�n� konsola yazd�ran bir program yaz�n. */
		
		
		
		Scanner input=new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double sayi=input.nextDouble();
		double sonuc=(sayi*sayi*sayi)/2;
		
		System.out.printf("%.1f ",sonuc);
		
		input.close();
	}

}
