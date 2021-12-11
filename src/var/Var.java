package var;
/**
 * 
 */

/**
 * @author CELÝL
 */
public class Var {

	/**
	 * Write a return method that accepts more than one integer as parameter and
	 * prints the sum of integers Method name = sum if you call method like that
	 * sum(1,2,3) output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3
	 */
	public static void main(String[] args) {

		System.out.println(topla(1,2,3,4,5,6,7));
		
		
		
	}
	
	public static int topla(int ...i) {
		int toplam=0;
		for (int j : i) {
			toplam+=j;
		}
		
		return toplam;
	}

}
