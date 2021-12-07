package Replit_02;

import java.util.Scanner;

public class C07 {

	
	public static void main(String[] args) {
		// Kullanici tarafindan girilen DOUBLE sayiyi
		// tam sayiya ceviren bir program yaziniz.
		
	

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir double degeri giriniz");
		double sayi1=scan.nextDouble();
				
		int sayi2=(int) sayi1;
		System.out.println("int degisken ile : " + sayi2);
		
		scan.close();
		  }
		
		
		
	}


