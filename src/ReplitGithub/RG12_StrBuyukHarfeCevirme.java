package ReplitGithub;

import java.util.Locale;
import java.util.Scanner;

public class RG12_StrBuyukHarfeCevirme {

    public static void main(String[] args) {

    /*12----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz : ");
        String str = scan.nextLine().toUpperCase();

        System.out.println(str);

    }
}
