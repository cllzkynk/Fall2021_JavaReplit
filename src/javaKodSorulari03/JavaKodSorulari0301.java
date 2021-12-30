package javaKodSorulari03;

import java.util.Scanner;

public class JavaKodSorulari0301 {

	public static void main(String[] args) {


		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa “gecerli bir email girin” yazdirin
       @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
       @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail hesabinizi girin” yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : “gecerli bir email girin”
       INPUT : techproed@gmail.com OUTPUT : “email onaylandi”
       INPUT : techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
       */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen e-mail adresinizi giriniz");
		
		String mail = scan.next();
		
		
		if (!mail.contains("@")) {
			System.out.println("gecerli bir email girin");
		} else {
			
			if (mail.substring(mail.length()-10, mail.length()).equals("@gmail.com")) {
				System.out.println("email onaylandi");
			} else {
				System.out.println("gecerli bir email girin");
			}

		}

		scan.close();
	}

}
