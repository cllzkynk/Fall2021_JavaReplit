package ReplitGithub;

import java.util.Arrays;
import java.util.Scanner;

public class RG29_CumleyiTerstenDuzYazdirma {

    public static void main(String[] args) {

    /*29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazin ve tersine ters çevrilmiş String'e atayin.

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
    */

        String str = "java is fun"; // string olarak assign ettim.

        String bolunmusStr[] = str.split(" "); // split yöntemi ile arrayi kelimelere boldum.
        System.out.println(Arrays.toString(bolunmusStr)); // burada bölünmüs elementleri yazdirdim.
        // burada böldügüm arrayi tersten yeniden olusturacagim methoda atamak için yaptim.
        String tersCumle = strTersten(bolunmusStr); // burada bolunmus arrayimi tersten methoduna atadim.
        System.out.println(tersCumle); // burada bi üstte atadigim methodu yazdirdim.
    }

    private static String strTersten(String bolunmusStr[]) { // tersten methodum bu

        String temp = ""; // temporary yani geçici bir String olusturdum
        // deklare ettim uzunlugu ise bolunmus arrayimle ayni
        for (int i = 0; i < bolunmusStr.length; i++) { // forloop olusturdum i 0 dan basladi kelimeyi sondan basa
            // dogru temp'e ekledim
            temp += bolunmusStr[bolunmusStr.length - 1 - i];
            temp += " ";

        }

        return temp; // burada temp kelime kelime tersten yazilmis cumle oldu
    }

}