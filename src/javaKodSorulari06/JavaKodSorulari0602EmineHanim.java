package javaKodSorulari06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaKodSorulari0602EmineHanim {

	public static void main(String[] args) {


		
		Scanner scan = new Scanner ( System.in);
        
        int toplam=0;
        int sayac=0;
        int sayi=scan.nextInt();
        try {
        do {
            System.out.println("tam sayilar giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            System.out.println(toplam);
            sayac++;
            
        } while (!(toplam>=100));
        
        System.out.println(sayac + "tane sayi girdin, bu kadar sayi yeter");}
        catch(InputMismatchException e) {
            System.out.println("lütfen ondalikli değil tamsayilar giriniz");

	}

	}
}