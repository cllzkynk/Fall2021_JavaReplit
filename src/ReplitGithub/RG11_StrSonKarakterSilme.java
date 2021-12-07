package ReplitGithub;

import java.util.Scanner;

public class RG11_StrSonKarakterSilme {

    public static void main(String[] args) {

    /*11----
    Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String str = scan.next();

        String sonHarfiSil = str.substring(0, str.length() - 1); // tersten son indexi sil demektir..

        System.out.println(sonHarfiSil);



    }
}
