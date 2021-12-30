package javaKodSorulari04;

import java.util.Scanner;

public class JavaKodSorulari0403 {

	public static void main(String[] args) {
		
		
		/*
		Ternary kullanarak:
				int variable : FIYAT
				string variable : Secim (String Secim=.....)
				price = $10 ise Print “UCUZ”
				price 10-$20 arasi ise Print “UYGUN”
				diger durumlar icin “PAHALI” yazdirin.
			*/

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir fiyat giriniz");
		
		int fiyat= scan.nextInt();
		
		
		System.out.println((fiyat>0 && fiyat<=10) ? "ucuz" : 
			                                                 (fiyat>10 && fiyat<=20) ? "uygun" : 
			
			                                                                             (fiyat<=0) ? "Lutfen pozitif bir fiyat giriniz" : "pahali");
			
												
																		
		
		
		scan.close();
		
		
		
	}

}
