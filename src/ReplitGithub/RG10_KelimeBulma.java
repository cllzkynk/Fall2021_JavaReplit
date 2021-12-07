package ReplitGithub;

import java.util.Scanner;

public class RG10_KelimeBulma {

    public static void main(String[] args) {

    /*10-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */

        String str="Java is easy";
        boolean b;
        b=str.contains("is");
        // b=str.contains("and");
        System.out.println(b);

    }
}
