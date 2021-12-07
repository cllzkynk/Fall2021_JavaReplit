package Replit_04;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		/* Soru 5
		 * 
		 * Bir aydaki gun sayisini hesaplayan bir Java programi yaziniz.
		 * 
		 * INPUT:
		 * 
		 * Ay Numarasi: 2
		 * Yil :2016
		 * 
		 * OUTPUT :
		 * Subat 2016 29 Gundur.
		 * 
		 */
		
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Ay Numarasi:");
	    
	  int ayNo=scan.nextInt();
	  
	  System.out.println("Yil:");
	  int yilNo=scan.nextInt();
	  
	switch (ayNo) {
	case 1: System.out.println("Ocak "+yilNo+" 31 Gundur.");
	break;
	case 2: if(yilNo%4!=0) {
		System.out.println("Subat "+yilNo+" 28 Gundur");
		} else {System.out.println("Subat "+yilNo+" 29 Gundur.");}
	break;
	case 3: System.out.println("Mart "+yilNo+" 31 Gundur.");
	break;
	case 4: System.out.println("Nisan "+yilNo+" 30 Gundur.");
	break;
	case 5: System.out.println("Mayis "+yilNo+" 31 Gundur.");
	break;
	case 6: System.out.println("Haziran "+yilNo+" 30 Gundur.");
	break;
	case 7: System.out.println("Temmuz "+yilNo+" 31 Gundur.");
	break;
	case 8: System.out.println("Agustos "+yilNo+" 31 Gundur.");
	break;
	case 9: System.out.println("Eylul "+yilNo+" 30 Gundur.");
	break;
	case 10: System.out.println("Ekim "+yilNo+" 31 Gundur.");
	break;
	case 11: System.out.println("Kasim "+yilNo+" 30 Gundur.");
	break;
	case 12: System.out.println("Aralik "+yilNo+" 31 Gundur.");
	break;
	default:
	}
		scan.close();

		

	}

}
