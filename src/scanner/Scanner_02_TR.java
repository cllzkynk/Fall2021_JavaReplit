/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author CEL�L
 *Kullan�c�dan karenin kenar uzunlu�unu al�n ve karenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.

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
