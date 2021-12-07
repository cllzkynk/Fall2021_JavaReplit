package Replit_02;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		/*
		 * Kullaniciya gunde ne kadar cay ictigini
		 * ve ne kadar seker kullandigini sorun.
		 * Yilda kac kg seker kullandigini hesaplayan ve yazdirin.
		 * 
		 * 
		 * 1 seker = 1.7 gr
		 * Ornek Cikti
		 * Yilda 12.41 kg seker kullaniyor.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Gunde ne kadar cay  icersiniz : ");
		double cay=scan.nextDouble();
		
		System.out.print("Gunde ne kadar seker kullanirsiniz : ");
		double seker=scan.nextDouble();
		
		System.out.println("Yilda "+ (cay*seker*1.7*365)/1000+ " kg seker kullaniyor.");
		
		scan.close();
	}

}
