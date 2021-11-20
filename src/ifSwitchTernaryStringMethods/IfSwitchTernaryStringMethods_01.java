package ifSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_01 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�ya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir
		 * program yaz�n (BMI)
		 * 
		 * IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
		 * 
		 * BMI 18,5'in alt�ndaysa zay�fs�n�z
		 * 
		 * BMI 18,5 ile 25 aras�nda ise kilonuz idealdir
		 * 
		 * BMI 25-30 aras�ndaysa �i�mans�n�z
		 * 
		 * BMI 30'dan b�y�k veya e�itse, obez
		 * 
		 * Input:
		 * 
		 * Output:
		 * 
		 * Agirlik : 71
		 * 
		 * Boy : 1,72
		 * 
		 * BMI : 23.99945916711736
		 * 
		 * Zayifsiniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kilonuzu kg olarak giriniz");
		double kg = scan.nextDouble();
		System.out.println("Lutfen boyunuzu cm olarak giriniz");
		double cm = scan.nextDouble();
		double boy = cm / 100;
		bmk(kg, boy);
scan.close();
	}

	public static void bmk(double kg, double boy) {
		double vki = kg / (boy * boy);
		System.out.println("Vucut kutle Endeksiniz :" + vki);

		if (vki >= 30) {
			System.out.println("Acil spora-diyete basla OBEZsin");
		} else if (vki >= 25) {
			System.out.println("Dikkat et sismansin ");
		} else if (vki >= 18.5) {
			System.out.println("kilonuz idealdir");
		} else {
			System.out.println("accik bisiler ya sende cok zayifsin");
		}

	}

}
