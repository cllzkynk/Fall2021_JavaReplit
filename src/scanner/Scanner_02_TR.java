/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author CELÝL
 *Kullanýcýdan karenin kenar uzunluðunu alýn ve karenin alanýný ve çevresini konsola yazdýran bir program yazýn.

Ornek Cikti :

Alan: 9

Cevre: 12
 */
public class Scanner_02_TR {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Lutfen mevzu bahis karenin bir kenar uzunlugunu giriniz");
		double kenar=input.nextDouble();
		
		System.out.println("Karenin alani   : "+(kenar*kenar)+"\nKarenin cevresi : "+(4*kenar));
		
input.close();
	}

}
