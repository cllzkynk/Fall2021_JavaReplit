package List;


import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        /* Create a 10-element list. Swap the 8th element with the 3rd element.
INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
Output:                 [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]  */

        List<String> list = new ArrayList<>();
        list.add("Umit");
        list.add("Emin");
        list.add("Kemal");
        list.add("Kerem");
        list.add("Taylan");
        list.add("Orhan");
        list.add("Sinan");
        list.add("Furkan");
        list.add("Ahmet");
        list.add("Ali");
        System.out.println("Before " + list);
        String temp = list.get(2);
        list.set(2, list.get(7));
        list.set(7, temp);


        System.out.println("After " + list);
        //  System.out.println(list);


    }
}
