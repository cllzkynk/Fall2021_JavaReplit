package javaKodSorulari06;

import java.util.Scanner;

/*
 * Kullanicidan sayilar girmesini isteyin
 * ve girdigi sayilari toplayip yazdirin
 * yeni sayi isteyin
 * girilen sayilarin toplami 100'u gecerse
 * "... kere sayi girdin. Bu kadar sayi yeter"
 * yazdirin ve oyunu bitirin.
 */

public class JavaKodSorulari0602 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		
		int toplam=0;
		int count=0;
	
		
		do {
			
			System.out.println("Lutfen toplamak istediginiz sayilari giriniz "
					+ "ama toplami 100 u gecmesin yoksa oyun biter!");
			
			int toplamlar = scan.nextInt();
			
			toplam+=toplamlar;
				count++;	
				System.out.println(" Girdiginiz sayilarin toplami : " + toplam);	
			
		} while (!(toplam>=101));
		
		System.out.println(count + " defa sayi girdiniz bu kadar sayi yeter GAME OVER");
	}
	

	
	
	
	
}


