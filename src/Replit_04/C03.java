package Replit_04;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		/* Soru 3
		 * 
		 * Verilen iki sayinin (sifirdan buyuk veya sifira esit) toplamini hesaplayan ve
		 * yazdiran bir Java programi yazin. Verilen tamsayilar veya toplam 10'dan fazla
		 * basamakli olursa, "OverFlow" yazdirin.
		 * 
		 * Ornek:
		 * 
		 * INPUT :
		 * 25
		 * 46
		 * 
		 * OUTPUT :
		 * Numaralarin Toplami: 71
		 */
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki pozitif tamsayi giriniz"
				+ "\nIlk sayiyi girdikten sonra enter`a basiniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		toplama(sayi1,sayi2);
		
		scan.close();
		
	}

	private static void toplama(int sayi1, int sayi2) {
		if (sayi1>=0 && sayi2>=0) {
			if (sayi1<1000000000 && sayi2<1000000000) {
				System.out.println("Numaralarin Toplami: " + (sayi1+sayi2));
			}
			else {
				System.out.println("OverFlow**");
			}
		} 
		else {
			System.out.println("Lutfen pozitif tamsayi giriniz");
		
	}

		
}
}
