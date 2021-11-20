package scanner;

import java.util.Scanner;

/*
 * @author CELÝL
 *
 */
public class Scanner_10_TR {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan dakika girmesini isteyin, Dakikalarý birkaç yýl ve gün sayýsýna
		 * dönüþtürmek için bir Java programý yazýn.
		 * 
		 * INPUT:
		 * 
		 * Dakika sayýsý: 3456789
		 * 
		 * OUTPUT :
		 * 
		 * 3456789 dakika yaklaþýk 6 yýl 210 gündür
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" kac dakika ");
		int dk=scan.nextInt();
		int yil=(dk/60/24/365);
		int gun=(dk/60/24)%364;
		
		System.out.println(dk +"  dakika yaklasik "+ yil + " yil "+ gun+ " gundur ");
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
