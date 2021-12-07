package ReplitGithub;

import java.util.Scanner;

public class RG42_KelimelerinilkHarfiniBuyukYapma {

    public static void main(String[] args) {

    /*42----
    İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
    küçük yapan bir method yazınız.

    Örnekler
    getKelime("kal", "em") ? "Kalem"
    getWord("gözl", "emlemek") ? "Gözlemlemek"
    getWord("zor", "luk") ? "Zorluk"
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lufen birlestirilecek kelimeleri giriniz");
        System.out.print("1. kelime: ");
        String klm1 = scan.next();
        System.out.print("2. kelime: ");
        String klm2 = scan.next();
        getWord(klm1, klm2);


    }

    private static void getWord(String klm1, String klm2) {
        String yeniKlm = klm1.concat(klm2);
        String sonKlm = yeniKlm.toUpperCase().charAt(0) + yeniKlm.substring(1);
        System.out.println(sonKlm);
    }
}