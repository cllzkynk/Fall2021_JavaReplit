package Replit_04;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		/* Soru 2
		 * 
		 * Kullaniciya Adi, Soyadi ve kredi karti numaralarini sorarak
		 * verilen formata ceviren java kodunu yaziniz.

		Input : 
		John White
		1234234534561478

		Output : Name : 
		J*** W****
		CCN  : **** **** **** 1478

		* Ilk Harfler Buyuk harf ile baslamalidir.
		*/
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		String isim=scan.nextLine();
		System.out.println("Lutfen soyadinizi giriniz");
		String soyisim=scan.nextLine();
		System.out.println("Lutfen kart numaranizi giriniz");
		String kkNo=scan.nextLine();
		
		String isimDuzenlenmis = isim.substring(0,1).toUpperCase() + 
								 isim.substring(1).replaceAll("\\w", "*"); 
								
		
		String soyisimDuzenlenmis = soyisim.substring(0,1).toUpperCase()+ 
									soyisim.substring(1).replaceAll("\\S", "*");
		
		String kkNoDuzenlenmis= "**** **** **** " + kkNo.substring(12); 
		
		
		
		System.out.println("Name : " + isimDuzenlenmis+" " + soyisimDuzenlenmis 
							+"\nCCN : " + kkNoDuzenlenmis);
		

		scan.close();


		
		
		
		
	}

}
