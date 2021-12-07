package ReplitGithub;

import java.util.Scanner;

public class RG05_ElmasDesenliYazdirma {

    public static void main(String[] args) {

    /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yarim elmas uzunlugunu giriniz");
        int uznluk = scan.nextInt();

        withFoorLoop(uznluk);

        System.out.println("~~~~~~~~~~~~~~~~~~~~2. yol~~~~~~~~~~~~~~~~~~~~");

        kisaYol(uznluk);

    }

    private static void kisaYol(int uznluk) {
        int count = 1;
        for (int i = 1; i <= uznluk * 2 - 1; i++) {//hem ust ucgen hem alt ucgen var o yuzden "uznluk*2-1" bu sekilde belirleedik.7 ustte 6 altta =>7+6=13
            for (int j = count; j <= uznluk; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("*");
            }
            if (i < uznluk) {// ust ucgen
                count++;
            } else count--;
            System.out.println();
        }
    }

    private static void withFoorLoop(int uznluk) {

        for (int i = 1; i <= uznluk; i++) {//uznluk=7
            int k = 0;
            for (int j = uznluk; j >= i; --j) {//j=7 7>=1 =>7,6,5,4,3,2,1>=1 boylce 7 tane bosluk ekleriz
                System.out.print(" ");// boslklar

            }//1 3 5 7
            while (k != 2 * i - 1) {//0!=1, 1!=1 dongu kirilir sadece 1 yildiz yazar
                System.out.print("*");// bosluk bitince * eklerz
                k++;
            }

            System.out.println();

        }

        for (int i = uznluk - 1; i >= 1; i--) {//uznluk=7-1-6
            int k = 0;
            for (int j = i - 1; j <= uznluk - 1; j++) {//j=5 j<=6 icin dongu 2 defa doner (j=5.j=6)
                System.out.print(" ");// boylece baslangicta 2 defa bosluk olur

            }//11 9 5 ..
            while (k != 2 * i - 1) {//k!= 11==>(2*6-1)
                System.out.print("*");//k=0 ,k=1 .k=2,k=3,...k=10,k=11 oldda dongu kirilir.ve 11 yildz olur
                k++;
            }

            System.out.println();

        }
    }
}
