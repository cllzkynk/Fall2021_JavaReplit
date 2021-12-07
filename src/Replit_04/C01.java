package Replit_04;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		/*Soru 1
		 * Kullaniciya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazin (BMI)

		IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

		BMI 18,5'in altindaysa zayifisiniz
		BMI 18,5 ile 25 arasinda ise kilonuz idealdir
		BMI 25-30 arasindaysa sismansiniz
		BMI 30'dan buyuk veya esitse, obez

		Input:
		Output:
		Agirlik : 71
		Boy : 1,72

		BMI : 23.99945916711736
		Zayifsiniz.
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen boyunuzu giriniz");
		double boy=scan.nextDouble();
		System.out.println("Lutfen kilonuzu  giriniz");
		double kilo=scan.nextDouble();
		double boyM=boy/100;
		
		double BMI=kilo/(boyM*boyM);
		System.out.println(BMI);
		if(BMI<=0) {
			System.out.println("lutfen gecerli birim giriniz");
		   }else if(BMI<18.5) {
				System.out.println("Zayifsiniz");
			}else if(BMI<=25) {
				System.out.println("kilonuz idealdir");
			}else if(BMI<=30) {
				System.out.println("Sismansiniz");
				
			}else {System.out.println("obezsiniz");	
			
			}

        scan.close();
		
	}

}
