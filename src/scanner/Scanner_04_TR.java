/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author CELÝL 
 */
public class Scanner_04_TR {

	public static void main(String[] args) {
		/*
		 * *Kullanýcýya günde ne kadar çay içtiðini ve ne kadar þeker kullandýðýný
		 * sorun. Yýlda kaç kg þeker kullandýðýný hesaplayýn ve yazdýrýn.
		 * 
		 * 1 þeker = 1.7 gr
		 * 
		 * Örnek Çýktý:
		 * 
		 * Yýlda 12.41 kg þeker kullanýyor.
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
