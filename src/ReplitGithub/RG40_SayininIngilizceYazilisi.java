package ReplitGithub;

import java.util.Scanner;

public class RG40_SayininIngilizceYazilisi {

    public static void main(String[] args) {

    /*40----
    Girilen sayının ingilizce yazılışını return eden bir method yazınız.

    Örnek

    numToEng(0)
    zero

    numToEng(18)
    eighteen

    numToEng(126)
    one hundred twenty six

    numToEng(909)
    nine hundred nine
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen max 3 bas pozitif bir sayi giriniz : ");
        int num = scan.nextInt();

        sayininOkunusu(num);
    }

    private static void sayininOkunusu(int num) {
        if (num < 0 || num > 999) {
            System.out.println("Lutfen sartlara uyan bir sayi giriniz\nmax 3 bas ve pozitif bir sayi :");
        } else {//365==>36  365
            int birlerBas = num % 10;
            int a = num / 10;
            int onlarBas = a % 10;
            int yuzlerBas = num / 100;

            String[] birlerBas1 = {"zero", "one", "two", "three", "four", "five",
                    "six", "seven", "eight", "nine", "Ten", "Eleven",
                    "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                    "Seventeen", "Eighteen", "Nineteen"};


            //ilk  eleman bos indexleri duzgun kullanmak icin
            String[] onlarBas1 = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String yuz = "hundred";
            if (num < 20) {// girilen sayi ayni zamanda index numarasidir
                System.out.println(birlerBas1[num]);
            } else if (num < 100) {//fifty three-53
                System.out.println(onlarBas1[onlarBas] + " " + birlerBas1[birlerBas]);
            } else {//3 bas icin

                if (birlerBas1[birlerBas] == "zero") {//360 ==>three hundred sixty
                    System.out.println(birlerBas1[yuzlerBas] + " " + yuz + " " + onlarBas1[onlarBas]);
                } else if (birlerBas1[birlerBas] != "zero") {//365 ==>three hundred sixty five
                    System.out.println(birlerBas1[yuzlerBas] + " " + yuz + " " + onlarBas1[onlarBas] + " " + birlerBas1[birlerBas]);
                }

            }
        }
    }
}