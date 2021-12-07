package ReplitGithub;

import java.util.Scanner;

public class RG14_StrEquals {

    public static void main(String[] args) {

    /*14----
    Girilen iki String veriyi karşılaştıran Java kodu yazınız.


    Test data:
    1. String : techproed.com
    2. String : Techproed.com

    Beklenen Çıktı:
    False

    Test data:
    1. String : techproed.com
    2. String : techproed.com

    Beklenen Çıktı:
    true
    */


        String str1="techproed.com";
        String str2="Techproed.com";

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equals(str2)); // false

    }
}
