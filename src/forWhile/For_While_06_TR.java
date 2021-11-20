package forWhile;

/**
 * @author CELÝL
 */
public class For_While_06_TR {
	/*
	 * Konsolda Alfabeyi Yazdýran programi yaziniz.
	 * 
	 * OUTPUT :
	 * 
	 * a b c .. .. .. .. y z
	 */
	public static void main(String[] args) {

		System.out.println("Buyuk harflerle");
		for (int i = 'A'; i <= 'Z'; i++) {
			char c = (char) i;
			System.out.print(" " + c + "");
		}
		System.out.println("\nKucuk harflerle");
		for (int i = 'a'; i <= 'z'; i++) {
			char c = (char) i;
			System.out.print(" " + c + "");
		}
	}
}
