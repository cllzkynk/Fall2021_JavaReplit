package scanner;

import java.util.Scanner;

/*
 * @author CEL�L
 *
 */
public class Scanner_10_TR {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan dakika girmesini isteyin, Dakikalar� birka� y�l ve g�n say�s�na
		 * d�n��t�rmek i�in bir Java program� yaz�n.
		 * 
		 * INPUT:
		 * 
		 * Dakika say�s�: 3456789
		 * 
		 * OUTPUT :
		 * 
		 * 3456789 dakika yakla��k 6 y�l 210 g�nd�r
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
