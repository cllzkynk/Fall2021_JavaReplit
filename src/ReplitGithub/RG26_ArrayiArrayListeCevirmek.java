package ReplitGithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RG26_ArrayiArrayListeCevirmek {

    public static void main(String[] args) {

    /*26-----
    Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

    Beklenen Çıktı:
    [Python, JAVA, PHP, Perl, C#, C++]
    */

        String arr[]={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> list=new ArrayList<>(Arrays.asList(arr));

        System.out.println("Beklenen Cikti: \n"+list);
    }
}
