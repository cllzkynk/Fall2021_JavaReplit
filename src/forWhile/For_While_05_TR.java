package forWhile;

/**
 * @author CEL�L
 */
public class For_While_05_TR {

	/**
	 * 100'den 0'a kadar �ift say�lar� yazd�r�n, ancak decrement(i--) kullanmay�n.
	 * 
	 * OUTPUT : 100 98 96 94 92 � � � � 2 0
	 */
	public static void main(String[] args) {

		for (int i = 100; i >= 0; i -= 2) {
			System.out.print(i+ "-");
		}
	}

}
