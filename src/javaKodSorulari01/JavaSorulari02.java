package javaKodSorulari01;

import java.util.Scanner;

public class JavaSorulari02 {

	public static void main(String[] args) {
		
		
		/*
		Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun. Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
		1 seker= 1.7 gr
		Ornek: Input ⇒      
		Cay : 10
		Seker :2
		Output : 12.41 kg/yil
		*/  

		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Lutfen gunde kac cay ictiginizi giriniz");
		
		
		double cay = scan.nextDouble();
		
		System.out.println("Lutfen cayi kac sekerli ictiginizi giriniz");
		
		double seker = scan.nextDouble();
		
		double sekerKg =  (seker * 1.7 / 1000) * cay * 365 ;
		
		System.out.println("Bir yilda kullandiginiz seker miktari : " + sekerKg + " kg/yil");
		
		scan.close();
	}

}
