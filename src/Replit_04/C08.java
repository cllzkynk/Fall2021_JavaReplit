package Replit_04;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		/* Sedef Hocam
		 * 
		 * Kullanicidan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasindan
		 * olusan yeni bir String yazdirin
		 * 
		 * Kullanicidan alinan isim uzunlugu en az 2 olacaktir.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir isim giriniz");
		String isim=scan.nextLine();
		
		String isim1=isim.substring(isim.length()-2);
		System.out.println(isim1+isim1+isim1);

		
		scan.close();
	}
}
