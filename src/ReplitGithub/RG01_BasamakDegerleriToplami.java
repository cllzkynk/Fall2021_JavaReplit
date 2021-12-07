package ReplitGithub;

import java.util.Scanner;

public class RG01_BasamakDegerleriToplami {

    public static void main(String[] args) {

    /*1---
    Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

    Test Data
    34
    Beklenen Çıktı
    7
    */


        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");

        int num = scan.nextInt();

        int adet = 0,toplam=0;

        while(num != 0) {
            toplam=(num%10)+toplam;
            num /= 10;
            ++adet;
        }

        System.out.println("Basamak Toplamı: " + toplam);
    }


}
