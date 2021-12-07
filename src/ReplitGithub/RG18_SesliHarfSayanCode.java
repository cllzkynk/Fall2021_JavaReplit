package ReplitGithub;

import java.util.Locale;
import java.util.Scanner;

public class RG18_SesliHarfSayanCode {

    public static void main(String[] args) {

    /*18----
    Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

    Test Data:
    java is fun

    Beklenen Çıktı:

    Stringdeki sesli harf sayısı: 4
    */


        String cumle = "developer";

        int sesli=0;

        for (int i = 0; i < cumle.length(); i++) {
            char c = cumle.toLowerCase().charAt(i);
            if (c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sesli++;
            }
        }
        System.out.println("Girilen cumledeki sesli harf sayisi : " + sesli);
    }

}


