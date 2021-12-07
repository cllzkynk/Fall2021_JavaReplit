package ReplitGithub;

public class RG31_SaatiSaniyeyeCevirme {

    public static void main(String[] args) {

    /*31----
    Saati saniyeye çeviren java methodunu yazınız.

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */

        System.out.println(howManySeconds(2));
    }

    private static int howManySeconds(int i) {
        int dk=i*60;
        int sn=dk*60;
        return  sn;
    }
}
