package ifSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_02 {
	public static void main(String[] args) {
		/*
		 * Kullanýcýya Adý, Soyadý ve kredi kartý numaralarýný sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * 
		 * Input :
		 * 
		 * John White
		 * 
		 * 1234234534561478
		 * 
		 * Output : Name :
		 * 
		 * J* W**
		 * 
		 * CCN : ** ** **** 1478
		 * 
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Isminizi ve Soyisminizi giriniz");
		String kisi = scan.nextLine();
		System.out.println("Lutfen kart numaranizi giriniz");
		long card = scan.nextLong();
		String kard = Long.toString(card);

		System.out.println(name(kisi) + "\n" + card(kard));
scan.close();
	}

	private static String name(String kisi) {
		String setname = kisi.toUpperCase().charAt(0) + kisi.substring(1, kisi.indexOf(' ')).replaceAll("\\w", "*")
				+ " "

				+ kisi.toUpperCase().charAt(kisi.indexOf(' ') + 1)
				+ kisi.substring(kisi.indexOf(' ') + 2).replaceAll("\\w", "*");

		return setname;
	}

	private static String card(String kard) {

		String setkard = kard.substring(0, kard.length() - 4).replaceAll("\\d", "*")
				+ kard.substring(kard.length() - 4);

		return setkard;

	}
}
