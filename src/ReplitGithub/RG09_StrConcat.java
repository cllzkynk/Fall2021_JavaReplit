package ReplitGithub;

import java.util.Scanner;

public class RG09_StrConcat {

    public static void main(String[] args) {

    /*9----
    2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun

    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String str1=scan.nextLine();
        String str2=scan.nextLine();

        System.out.println(str1+" ".concat(str2));













    }
}

