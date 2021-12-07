package ReplitGithub;

import java.util.Scanner;

public class RG07_UglyNumber {

    public static void main(String[] args) {


    /*7-----
    Ugly Number:

    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.


    Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
    İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

    Test Data:
    13

    Beklenen çıktı:
    ugly number  degildir

    Test Data:
    25
    Beklenen Çıktı:

    ugly number

    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi=scan.nextInt();

        for (int i = 2; i <6; i++) {
            while(sayi%i==0)
            sayi/=i;
        }
        if (sayi==1){
            System.out.println("cirkin sayi");
        }else
            System.out.println("cirkin sayi degildir");
    }
}
