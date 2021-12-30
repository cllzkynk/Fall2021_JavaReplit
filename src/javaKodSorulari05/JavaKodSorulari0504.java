package javaKodSorulari05;

import java.util.Scanner;

public class JavaKodSorulari0504 {

	/*
    Get numbers from the user and output that number consecutive fibonacci number sequence
            e.g : User enters 10
    output : 0 1 1  2  3  5 8 13 21 34
            */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 1;
        
        System.out.println("Kac tane sayi istedginizi giriniz: ");
        int count = scan.nextInt();
        
        int i =1;
        while(i <= count) {
            System.out.print(num1 + " ");
            int toplam = num1 + num2;
            num1 = num2;
            num2 = toplam;
            i++;
        }
        scan.close();
    }


}
