package Code_Hunter;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		  /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir String giriniz");
		String str=scan.nextLine().toLowerCase();
		
		xyzvarmi(str);
		System.out.println(xyzvarmi(str));
		scan.close();
	}

	public static boolean xyzvarmi(String str) {
		if (str.contains("xyz")) {
			return true;
		}else {
			return false;
		}
		
	}

}
