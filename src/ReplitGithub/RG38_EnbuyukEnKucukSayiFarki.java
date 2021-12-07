package ReplitGithub;

import java.util.Arrays;

public class RG38_EnbuyukEnKucukSayiFarki {

    public static void main(String[] args) {

    /*38----
    Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.

    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
    */
        short arr[]={10, 15, 20, 2, 10, 6};
        farkBul(arr);
    }

    public static void farkBul(short[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]-arr[0]);
    }
}
