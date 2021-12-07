package Replit_02;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan uc basamakli bir sayi girmesini
		 * ve bu sayinin basamaklarinin
		 * toplamini bulmasini isteyin.
		 * 
		 * Ornek Cikti
		 * 
		 * Verilen tamsaynin rakamlari toplami 10'dur.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();

		int toplam=0;
		int kalan=0;
		
			while(sayi>0) {
				kalan = sayi%10;
				toplam += kalan;
				sayi/=10;
			}
			System.out.println("Verilen tamsayinin rakamlari toplami " + toplam + "`dur.");


			scan.close();
}
}