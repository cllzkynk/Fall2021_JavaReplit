package list_Examples;



import java.util.Arrays;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        /*
        Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
input :
Learning java is easy
output:
maximum occurring character is : a
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gir bisiler");
        String str = scanner.nextLine();
        String arr[] = str.split("");
        Arrays.sort(arr);//harfleri siraladik


        String teklisira[] = tekle(arr).split(""); // arr yi metoda gonderdik tekrarli harfleri atip unig array olusturduk

        String adet[] = adetSay(teklisira, arr).split(""); // uniq olan harfleri ilk arayde kac defa oldugu nu motodla bulduk

        System.out.println(Arrays.toString(teklisira));//sonucu kontrol ivcin gereksiz syso [ , L, a, e, g, i, j, n, r, s, v, y]
        System.out.println(Arrays.toString(adet));     //sonucu kontrol ivcin gereksiz syso [3, 1, 4, 2, 1, 2, 1, 2, 1, 2, 1, 1]
        // simdi adet arrayinde  en buyuk int in indeksi neyse  teklisira arrayinde en cok tekrar eden harf o inndexte olacak

        int max = 0;
        int index=0;
        for (  int i = 0; i < adet.length; i++) {

            if (Integer.parseInt(adet[i]) > max) {
                max = Integer.parseInt(adet[i]);
                index =i;
            }
        }
       // System.out.println(max); // en buyuk sayinin oldugu indexi bulduk 2.
        //  demekki teklisira  arrayinde ikinci indexteki harf en cok tekrar eden harf

        System.out.println("Girilen ifadede en cok tekrar eden harf " + max + " tekrar ile : " + teklisira[index]);

scanner.close();
    }

    public static String tekle(String[] arr) {
        String tekharfler = "";
        for (int i = 0; i < arr.length; i++) {
            if (!tekharfler.contains(arr[i]))
                tekharfler += arr[i];
        }

        return tekharfler;
    }

    public static String adetSay(String teklisira[], String[] arr) {
        String sayici = "";
        int sayac = 0;
        for (int i = 0; i < teklisira.length; i++) {
            sayac = 0;
            for (int j = 0; j < arr.length; j++) {
                if (teklisira[i].equals(arr[j])) {
                    sayac++;
                }
            }
            sayici += sayac + "";
            // System.out.println(tekliarr[i]+"====>"+sayici); hangi harfi sirayna nasil saydigini gorebilirsiniz
        }
        return sayici;
    }
}
