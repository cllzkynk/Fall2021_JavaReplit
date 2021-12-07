package ReplitGithub;

import java.util.Scanner;

public class RG13_StrPalindrome {

    public static void main(String[] args) {

    /*13----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi
    ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("1-Palindrom kontrolu icin bir kelime veya cumle giriniz : ");
        String str=scan.nextLine();

        String arr[]=str.split("");
        String terstenKelime="";

        for (int i =str.length()-1; i >=0 ; i--) {
            terstenKelime+=arr[i];
        }

        if (terstenKelime.equalsIgnoreCase(str)) {
            System.out.println("Girilen kelime veya cumle palindrome'dur");
        }else
            System.out.println("Girilen kelime veya cumle palindrome'degil");

        // 2. yol

        System.out.println("2-Palindrom kontrolu icin bir kelime veya cumle giriniz : ");
        String str1= scan.nextLine();
        StringBuilder sb=new StringBuilder(str1);
        if (sb.reverse().toString().equalsIgnoreCase(str1)) {
            System.out.print("this is palindrome");
        }else System.out.print("this is not palindrome");

        System.out.println("");



    }
}
