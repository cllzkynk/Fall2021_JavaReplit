package forWhile;

import java.util.Scanner;

/*
 * @author CELÝL 
 */
public class For_While_03_TR {
	/*
	 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
	 * yazýniz.(mülakat Sorusu)
	 * 
	 * Input :
	 * 
	 * String str=“Javaisalsoeasy”
	 * 
	 * Output: a s
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen cumle giriniz");
		String str = scan.nextLine();

		String dp = " ";

		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i + 1).contains(str.substring(i, i + 1))) {
				if (!dp.contains(str.substring(i, i + 1))) {
					dp = dp + str.charAt(i) + "";
				}
			}

		}
		System.out.println(dp);

		scan.close();
	}

}
