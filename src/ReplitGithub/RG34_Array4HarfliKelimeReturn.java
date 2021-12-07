package ReplitGithub;

import java.util.ArrayList;
import java.util.List;

public class RG34_Array4HarfliKelimeReturn {

    public static void main(String[] args) {

    /*34-----
    String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.


    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])

     ["Pair"]
    */
        String arr[]={"Tomato", "Potato", "Pair","Elma","Kivi"};
        isFourLetters(arr);
    }

    public static void isFourLetters(String[] arr) {
        List<String> list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            //String str=arr[i];

            if (arr[i].length()==4) {
                list.add("\""+arr[i]+"\"");
            }
        }
        System.out.println(list);
    }
}
