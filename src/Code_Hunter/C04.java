package Code_Hunter;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		// 5- Kulanicidan bir kelime isteyin 
		// eger kelime 3 ve daha fazla harfden olusuyorsa
		// son iki harfini 3 kere yan yana yazdirin. 
		// degil ise girilen kelimeyi yazdirin 
		// ornek input = Ali output = lilili
        // input = el  output = el

		Scanner scan = new Scanner(System.in);
		System.out.print("kelime giriniz : ");
		String kelime = scan.nextLine();
		
		if (kelime.length() >=3) {
			String tekrarlanan=kelime.substring(kelime.length()-2);
			System.out.println(tekrarlanan+tekrarlanan+tekrarlanan);

		}else {
			System.out.println("Girilen kelime : " + kelime);

	}
		scan.close();
	}
}
