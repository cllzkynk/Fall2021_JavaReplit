package Code_Hunter;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		// 3-Kullanicidan aldiginiz
		// Yilin  ay numarasina gore ,
		// ayin kac gun oldugunu sayi ile yazdiriniz
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("lutfen yilin kacinci ayinda oldugunuzu giriniz : ");
		int ay = scanner.nextInt();
		
		
		// 1 3 5 7 8 10 12 ==> 31 gun olan aylar
		// 4 6 9 11 ==> 30 gun olan aylar
		// 2 ==> 29 ve 4 yilda bir 28 gun olan ay
		
		switch (ay) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Girdiginiz ay 31 gun cekiyor");
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Girdiginiz ay 30 gun cekiyor");
			break;
		
		case 2:
			System.out.println("Yilinizi giriniz");
			int yil=scanner.nextInt();
			
			if (yil%4==0) {
				System.out.println("Girdiginiz ay 29 gun cekiyor");
			}else {
				System.out.println("Girdiginiz ay 28 gun cekiyor");
			}
			break;

		
		default:
			System.out.println("Hatali giris yaptiniz");
		
	}
		scanner.close();
		
	}

}
