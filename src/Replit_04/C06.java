package Replit_04;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		/* Soru 6
		 * 
		 * Kullanicidan bir isim yazmasini isteyin, adin uzunlugu 3 olmalidir. Ardindan,
		 * adin ayni karakterlere sahip olup olmadigini kontrol edin.
		 * 
		 * Eger ayni karakterlere sahipse
		 * "isim ayni karakterlere sahiptir." yazdirin.
		 * 
		 * Eger ayni kaakterlere sahip degilse
		 * "Dizenin benzersiz karakterleri var" yazdirin.
		 * 
		 * Ternary kullanin.
		 * 
		 */
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 Harfli bir isim yaziniz");
		String name=scan.next();
		
		char c1 = name.charAt(0);
        char c2 = name.charAt(1);
        char c3 = name.charAt(2);

        String harfKontrol = name.length() == 3 ? ((c1 != c2 && c1 != c3 && c2 != c3) ?
				"Girdiginiz Dizenin benzersiz karakterleri var "
                : "Girdiginiz isim 3 harfli ve isim ayni karakterlere sahiptir."):"Girdiginiz isim 3 harfli degil";

        System.out.println(harfKontrol);
		
	
        scan.close();
	}
}
