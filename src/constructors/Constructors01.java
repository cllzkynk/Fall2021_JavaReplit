/**
 * 
 */
package constructors;

import java.util.Scanner;

/**
 * @author CEL�L
 */
public class Constructors01 {
	/*
	 * Write a Scrabble Game for two person Rules OK== 1- At the beginning Ask to
	 * first Player enter a word for starting game OK 2- Then change the player ask
	 * to new player if given word is valid or not OK i) If new player accepts the
	 * given word add number of letters in the word as points to player who wrote
	 * the word And go to step 3 OK ii) If new player does not accept the word as
	 * valid then print "Invalid word, player X(Current player) won the game" and
	 * finish the game
	 * 
	 * OK 3- Ask to users if user want to continue game or not OK i) If player want
	 * to continue, OK ask to user a letter to add to word OK and ask to user side
	 * to add (beginning or end) OK then add letter to word and run step 2
	 * 
	 * OK ii) If player does not want to continue then print "Game Finished" and
	 * print points and winner
	 */

	static Scanner sc = new Scanner(System.in);
	static int oyuncu = 1;

	static String kelime;
	static String ekleme;
	static int puan1;
	static int puan2;
	static boolean kontrol;

	/*
	 * Iki kisinin oynayacagi bir kelime oyunu uretelim Kurallar 1.Ad�m- Baslangicta
	 * 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
	 *
	 * 2.Ad�m- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini
	 * sorun. * 2. oyuncu Eger kelimeyi kabul ederse 1.oyuncuya kelimedeki harf
	 * sayisi kadar puan ekleyin ve 3.adima gecin * girilen kelimeyi kabul etmezse
	 * "gecersiz kelime" yazdirin ve hangi oyuncunun kazandigini yazip oyunu
	 * bitirin.
	 *
	 * 3.Ad�m- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun * devam
	 * etmek isterse kelimeye eklemek istedigi string'i ve basa mi sona mi
	 * ekleyecegini sorun aldiginiz string'i kelimeye ekleyip 2.adima gidin
	 *
	 * * Devam etmek istemezse "Oyun bitti" yazin kullanicilarin puanlarini ve
	 * kazanan oyuncuyu yazdirin
	 */
	public static void main(String[] args) {
		System.out.print(oyuncu + ". oyuncu l�tefen bir kelime giriniz : ");
		kelime = sc.next();
		System.out.println(oyuncu + ". oyuncunun girdi�i kelime : " + kelime);
		oyuncuDegistir();// 1. oyuncu de��iti 2. oyuncu oldu
		onaySor();
	}

	public static void oyuncuDegistir() {// bu methoda oyuncu nosu de�i�tiriliyor
		if (oyuncu == 1) {// oyuncu nosu 1 ise 2 olarak ata
			oyuncu = 2;
		} else {
			oyuncu = 1;
		} // oyuncu nosu 1 de�ilse 1 olarak ata
	}

	public static void onaySor() {
		System.out.println(oyuncu + ".oyuncu girilen kelimeyi kabul ediyor musunuz ?\n1: Evet \n0: Hay�r");
		int kabul = sc.nextInt();
		if (kabul == 1) {// 1 tercihi girilen kelimeyi kabul ediyor demektir
			if (oyuncu == 1)// i�lemi yapan oyuncu 1. oyunucu ise....
				puan2 += kelime.length();// puan� 2. oyuncuya kelime harf says� kadar ekledik.
			else {
				puan1 += kelime.length();// puan� 1. oyuncuya kelime harf says� kadar ekledik.
				oyunaDevamEdecekMi();
			}
		} else {
			System.out.println("ge�ersiz kelime girdiniz.");
			kontrol = true;
			oyunuBitir();
		} // else:0 yani girilen kelimeyi kabul etmiyor demektir

	}

	public static void oyunaDevamEdecekMi() {
		System.out.println(oyuncu + ".oyuncu oyuna devam etmek istiyor musunuz? :\n1: Evet \n0: Hay�r");
		int devam = sc.nextInt();
		if (devam == 1) {
			kelimeEkle();
		} else {
			oyunuBitir();
		}
	}

	public static void kelimeEkle() {
		System.out.print("eklemek istedi�iniz kelimeyi giriniz : ");
		ekleme = sc.next();
		System.out.println("ekledi�iniz kelimeyi ba�a m� sona m� eklemek istersiniz?\n3: Ba�a \n4: Son");
		int basSon = sc.nextInt();
		if (basSon == 3)
			kelime = ekleme + kelime;
		else
			kelime = kelime + ekleme;
		oyuncuDegistir();
		onaySor();
	}

	public static void oyunuBitir() {
		System.out.println("oyun bitti...");
		System.out.println("1. oyuncu puan� :" + puan1);
		System.out.println("2. oyuncu puan� :" + puan2);
		if (puan1 > puan2) {
			System.out.println("kazanan 1 oyuncu");
		} else if (puan1 < puan2) {
			System.out.println("kazanan 2 oyuncu");
		} else if (puan1 == puan2) {
			System.out.println("oyun berabere bitti..");
		}

		if (kontrol)
			System.out.println("oyunu " + oyuncu + ". oyuncu oyunu kazanad�.��nk� di�er oyuncu yanl�� kelime girdi.");

	}
}
