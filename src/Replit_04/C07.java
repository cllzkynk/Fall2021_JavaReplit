package Replit_04;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		
		// Soru 7
		
		// 2 kelime olusturun: isim1 ve isim2
        // isim1 cift sayida karakter iceriyorsa,
        // ikinci kelimeyi ilk adin ortasina yerlestirin
        // ilk kelime tek sayida karakter iceriyorsa
        // "isim1, isim2 ye eklenemiyor" yazdirin

        // Ornegin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdir ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdir ==> isim1, isim2 ye eklenemiyor
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki isim giriniz"
				+ "\nIlk ismi girdikten sonra enter`a basiniz");
		String isim1 = scan.next();
		String isim2 = scan.next();
		 
		tekCiftKarakter(isim1,isim2);
		
		ternarytekCiftKarakter(isim1,isim2);
		
		
		scan.close();
	}


	private static void ternarytekCiftKarakter(String isim1, String isim2) {
		String cvp =isim1+ ", " + isim2 +"`e eklenemiyor";
		
		
		System.out.println((isim1.length()%2==0) ? isim1.substring(0,(isim1.length()/2))+isim2+isim1.substring((isim1.length()/2)) : cvp);
		
	}

	private static void tekCiftKarakter(String isim1, String isim2) {
		if (isim1.length()%2==0) {
			isim1=isim1.substring(0,(isim1.length()/2))+isim2+isim1.substring((isim1.length()/2));
			System.out.println(isim1);
		}
		else {
			System.out.println(isim1+ ", " + isim2 +"`e eklenemiyor");
		}
	}
}