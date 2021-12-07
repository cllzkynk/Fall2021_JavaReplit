package ReplitGithub;

import java.util.Scanner;

public class RG06_SesliSessizHarfBulma {

    public static void main(String[] args) {

    /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String  str = scan.next();
        char  harf = str.charAt(0);

        if ((harf<='z' && harf>='a' || harf<='Z' && harf>='A') && str.length()==1){
            if (harf=='a' || harf=='e' || harf=='i' || harf=='o' || harf=='u' ||
                    harf=='A' || harf=='E' || harf=='I' || harf=='O' || harf=='U'){
                System.out.println(harf +" harfi sesli harftir.");
            }
            else System.out.println(harf +" harfi sessiz harftir.");
        }
        else System.out.println("Yanlis karakter girdiniz!");

    }
            }




