package javaKodSorulari04;

import java.util.Scanner;

public class JavaKodSorulari0402 {

	public static void main(String[] args) {

		/*
		 * Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java
		 * kodunu yaziniz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir ay giriniz");

		String ay = scan.next().toUpperCase();

		switch (ay) {
		case "OCAK":
			System.out.println("Girdiginiz ay 31 gundur");
			break;
		case "SUBAT":
			System.out.println("Girdiginiz ay 28 gundur");
			break;
		case "MART":
			System.out.println("Girdiginiz ay 31 gundur");
			break;
		case "NISAN":
			System.out.println("Girdiginiz ay 30 gundur");
			break;
		case "MAYIS":
			System.out.println("Girdiginiz ay 31 gundur");
			break;
		case "HAZIRAN":
			System.out.println("Girdiginiz ay 30 gundur");
			break;
		case "TEMMUZ":
			System.out.println("Girdiginiz ay 31 gundur");
			break;
		case "AGUSTOS":
			System.out.println("Girdiginiz ay 30 gundur");
			break;
		case "EYLUL":
			System.out.println("Girdiginiz ay 31 gundur");
			break;
		case "EKIM":
			System.out.println("Girdiginiz ay 30 gundur");
			break;
		case "KASIM":
			System.out.println("Girdiginiz ay 31 gundur");
			break;
		case "ARALIK":
			System.out.println("Girdiginiz ay 30 gundur");
		default:
			System.out.println("Lutfen gecerli bir ay adi giriniz");
		}
		scan.close();
	}

}
