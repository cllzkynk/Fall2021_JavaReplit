package ReplitGithub;

import java.util.Scanner;

public class RG16_StrBuyukHarfeCevirme {

    public static void main(String[] args) {

    /*16----
    Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.

    Test Data:
    java is fun

    Beklenen Çıktı:
    JAVA IS FUN
    */

        Scanner scan=new Scanner(System.in);
        String str="java is fun";
        System.out.println(str.toUpperCase());
    }
}
