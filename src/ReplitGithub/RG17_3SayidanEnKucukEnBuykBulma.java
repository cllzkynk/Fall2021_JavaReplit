package ReplitGithub;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RG17_3SayidanEnKucukEnBuykBulma {

    public static void main(String[] args) {

    /*17---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

        enKucukSayi();

    }

    public static void enKucukSayi() {

        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = scan.nextInt();
        scan.nextLine();



        if (sayi2 > sayi1 && sayi3 >= sayi2) { // sayi1 en kucuk ise
            System.out.println("Girilen en kucuk sayi : " + sayi1);
        } else if (sayi1 > sayi2 && sayi2 <= sayi3) { // sayi2 en kucuk ise
            System.out.println("Girilen en kucuk sayi : " + sayi2);
        } else if (sayi1 > sayi3 && sayi3 <= sayi2) { // sayi3 en kucuk ise
            System.out.println("Girilen en kucuk sayi : " + sayi3);
        }

        // ternary ile
        System.out.println(sayi1<sayi2 ? (sayi1<sayi3 ? sayi1: sayi3 ):(sayi2<sayi3? sayi2: sayi3));
    }

    }

