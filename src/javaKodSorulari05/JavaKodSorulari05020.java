package javaKodSorulari05;

public class JavaKodSorulari05020 {

	public static void main(String[] args) {


		// a)1-20 arasindaki -20 dahil olmak uzere  cift sayilari yazdirin e.g 2 4 6
		
		// b)1-20 arasindaki -20 dahil olmak uzere  tek sayilari yazdirin e.g 1,3,5,7.... Virgul dahil
		
		// c)20-1 arasindaki 5 e bölunebilen sayilari 20 den geriye gelerek yazdirin e.g 20,15,10...
		
		// d)1-20 arasindaki tum cift sayilarin toplamini yazdirin.
		
		// e)11 veya 15 haric 1-20 arasindaki tum sayilari yazdirin break or continue kullanin.
		
		
		
		for (int i = -20; i < 20; i++) {
		
			if (i%2==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		
		for (int i = -20; i < 20; i++) {
			
			if (i%2==1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();

		for (int i = 20; i > 1; i--) {
			if (i%5==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();

		
		int sum=0;
		for (int i = 0; i < 20; i++) {
			if (i%2==0) {
				System.out.print((sum=sum+i) + " "); // sum+=i;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 20; i++) {
			if (i==11 || i==15) {
				continue;
			}
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		
		
	}

}
