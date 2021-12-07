package Replit_04;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		/* Soru 4
		 * 
		 * Char degisken yanitinin degerini test eden ve asagidaki islemleri
		 * gerceklestiren bir switch ifadesi yazin:
		 * yanit a ise,
		 * "Talebiniz isleniyor" mesaji yazdirilir
		 * yanit b ise,
		 * "yine de ilgilendiginiz icin tesekkur ederiz" mesaji yazdirilir
		 * yanit c ise,
		 * "Uzgunuz su anda herhangi bir yardim yok" mesaji yazdirilir
		 * baska herhangi bir yanit degeri icin,
		 * "Gecersiz giris, lutfen tekrar deneyin!" yazdirilir
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz : \na veya b veya c");
		char karakter = scan.next().toLowerCase().charAt(0);

		switch (karakter) {
		case 'a':
			System.out.println("Talebiniz isleniyor");
			break;
		case 'b':
			System.out.println("yine de ilgilendiginiz icin tesekkur ederiz");
			break;
		case 'c':
			System.out.println("Uzgunuz su anda herhangi bir yardim yok");
			break;
		default:
			System.out.println("Gecersiz giris, lutfen tekrar deneyin!");
			break;
		}
		scan.close();
	}
}