/**
 * 
 */
package list_Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author CELÝL
 */
public class List5 {

	public static void main(String[] args) {
		/*
		 * Write a program that accepts an integer as input and prints first 10 prime
		 * numbers greater than input Check numbers if they are even or not in a return
		 * method.
		 * 
		 * Input : 5
		 * 
		 * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 */
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Alt siniri gir");
		int alt_sinir = scan.nextInt() + 1;
		

		int sayac = 1;
		do {
			int kontrol=0;
			for (int i = 2; i <= alt_sinir / 2; i++) {
				if (alt_sinir % i == 0) {
					kontrol++;
				break;
				}
			}
			if (kontrol==0) {

				list.add(alt_sinir);
				sayac++;
          
			}

			alt_sinir++;
			
		} while (sayac <= 10);

		System.out.println(list);
		scan.close();
	}

}
