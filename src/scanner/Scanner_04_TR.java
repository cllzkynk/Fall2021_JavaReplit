/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author CEL�L 
 */
public class Scanner_04_TR {

	public static void main(String[] args) {
		/*
		 * *Kullan�c�ya g�nde ne kadar �ay i�ti�ini ve ne kadar �eker kulland���n�
		 * sorun. Y�lda ka� kg �eker kulland���n� hesaplay�n ve yazd�r�n.
		 * 
		 * 1 �eker = 1.7 gr
		 * 
		 * �rnek ��kt�:
		 * 
		 * Y�lda 12.41 kg �eker kullan�yor.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Gunde kac tane goturuyon bakalim cayi");
		int adetCay = input.nextInt();
		System.out.println("Kac sekerli bu caylar");
		int adetSeker = input.nextInt();
		
		System.out.println("Yilda "+(adetSeker*adetCay*365*1.7)/100 +" kg seker tuketiyon haci ");
input.close();
	}

}
