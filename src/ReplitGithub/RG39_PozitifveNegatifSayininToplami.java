package ReplitGithub;

public class RG39_PozitifveNegatifSayininToplami {

    public static void main(String[] args) {

    /*39-----
    Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.

    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.

    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.
    */
        short arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        // countPositivesSumNegative(arr);
        countPositivesSumNegative2(arr);
    }

    public static void countPositivesSumNegative2(short[] arr) {
        int negativeSum = 0;
        int pozitiveCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pozitiveCount++;
            } else if (arr[i] < 0) {
                negativeSum += arr[i];
            }
        }
        System.out.print("Toplam " + pozitiveCount + " pozitif var. \n" + "Tüm negatif sayıların toplamı " + negativeSum + "\'tir.");
    }
}

    /*public static void countPositivesSumNegative(short[] arr) {
       int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.print("Tüm negatif sayıların toplamı "+sum +" 'tir.");*/