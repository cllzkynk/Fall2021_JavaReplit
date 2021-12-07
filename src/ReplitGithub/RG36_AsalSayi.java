package ReplitGithub;

public class RG36_AsalSayi {

    public static void main(String[] args) {

    /*36-----
    Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

    Test Data:

    isPrime(31)
    true

    isPrime(18)
    false
    */
        int sayi=9;
        boolean kontrol=true;
        for (int i = 2; i <=sayi/2+1 ; i++) {
            if (sayi%i==0) {
                kontrol=false;
                System.out.print("isPrime("+sayi+") \n"+kontrol);
                break;
            }

        }
        if (kontrol==true) {
            System.out.print("isPrime("+sayi+") \n"+kontrol);

        }
        }
    }