package Replit_02;

import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
		/*
		 * Girilen zamani saniyeye ceviren bir program yaziniz.
		 * Ornek Cikti
		 * 1 saat 10 dakika 50 saniye ==> 4250 saniye
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sirasiyla saat dakika ve saniye giriniz");
		int saat=scan.nextInt();
		int dakika=scan.nextInt();
		int saniye=scan.nextInt();
		
		System.out.println(saat*3600+dakika*60+saniye*1+ " saniye");
		
		scan.close();
	}

}
