package ReplitGithub;

public class RG30_BinaryKodlarininToplami {

    public static void main(String[] args) {

    /*30---
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010

    Beklenen Çıktı:
    1010100
    */
        //Scanner scan=new Scanner(System.in);
        //long birinci = scan.nextInt();
        // long ikinci = scan.nextInt();

        long birinci = 100010;
        long ikinci = 110010;

        int onluk1 = ikiligiOnlugaDon(birinci); // 34
        int onluk2=ikiligiOnlugaDon(ikinci); // 50
        int sum=onluk1+onluk2; // 84
        //System.out.println(birinci);
        //System.out.println(ikinci);
        //System.out.println(sum);


        String ikilik = onluguikiligeDon(sum);
        System.out.println(ikilik);
    }

    public static String onluguikiligeDon(int onluk) {
        String str="";
        for (int i =onluk; i >0 ; i/=2) {
            str=i%2+str;

        }
        return str;
    }


    public static int ikiligiOnlugaDon(long a) {
        int onlukSayi = 0, ust = 0;
        long basamak;

        for (long j =a; j >0 ; j/=10) { //1 ve 110010
            basamak =j % 10;         //basamak elde etmek icin
            onlukSayi += basamak * Math.pow(2, ust); //2+32=34
            ust++;
        }
        //System.out.println(onlukSayi);
        return onlukSayi;
    }
}
