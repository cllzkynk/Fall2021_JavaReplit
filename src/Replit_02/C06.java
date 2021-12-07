package Replit_02;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		/*
		 * Kullanician bir Float deger girmesini isteyin,
		 * bu sayiyi short degisken tipine donusturun ve konsolda yazdirin.
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir float degeri giriniz");
		float sayi1=scan.nextFloat();
		
		
		short sayi2=(short) sayi1;
	    System.out.println("short degisken ile : " + sayi2);

	    scan.close();

		
		
		
		
		
		

	}

}
