package forWhile;

/**
 * @author CELÝL
 */
public class For_While_05_TR {

	/**
	 * 100'den 0'a kadar çift sayýlarý yazdýrýn, ancak decrement(i--) kullanmayýn.
	 * 
	 * OUTPUT : 100 98 96 94 92 … … … … 2 0
	 */
	public static void main(String[] args) {

		for (int i = 100; i >= 0; i -= 2) {
			System.out.print(i+ "-");
		}
	}

}
