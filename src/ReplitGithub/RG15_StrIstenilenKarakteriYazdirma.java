package ReplitGithub;

public class RG15_StrIstenilenKarakteriYazdirma {

    public static void main(String[] args) {

    /*15----
    Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun


    Beklenen Çıktı
    0. pozisyondaki karakter : J

    5. pozisyondaki karakter : i
    */

        String str = "Java is fun";

        System.out.println(str.substring(0,1)); // J
        System.out.println(str.substring(5,6)); // i

    }
}
