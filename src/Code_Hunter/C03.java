package Code_Hunter;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		/* Bakiye ogrenme
		 * para cekme
		 * para yatirma ve
		 * Cikis islemlerinin
		 * oldugu bir bankamatik pr kodlayiniz
		 */
		
		
		System.out.println("1.Islem : Bakiye sorma\n2.Islem : Para Cekme\n3.Islem : Para Yatirma\n4. Islem : Cikis");
		int bakiye=5000;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("lutfen yapacaginiz islemi seciniz : ");
		int secim=scan.nextInt();
		
		switch (secim) {
		case 1:
			System.out.println("Bakiyeniz : " + bakiye);
			break;
		case 2:
			System.out.println("Cekeceginiz miktari giriniz : ");
			int cekilenMiktar=scan.nextInt();
				if (cekilenMiktar>bakiye) {
					System.out.println("Bakiyeniz yeterli degil");
				}else {
					bakiye-=cekilenMiktar;
					System.out.println("Yeni bakiyeniz : " +bakiye);
				}
			break;
		case 3:
			System.out.println("yatiracaginiz miktari giriniz : ");
			int yatirilanMiktar=scan.nextInt();
			bakiye+=yatirilanMiktar;
			System.out.println("Yeni bakiyeniz : " +bakiye);
			break;
		case 4:
			System.out.println("islemden cikinizz : ");
			break;
	
		default:
		
	}	
		scan.close();
	}
		

	}


