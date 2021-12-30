package javaKodSorulari01;

public class JavaSorulari01 {

	public static void main(String[] args) {
		
		/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz. 
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		*/ 

		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char ilkharf = pickName.charAt(0);
		
		char ikinciHarf = pickName.charAt(11);
		
		char ucuncuHarf = pickName.toLowerCase().charAt(8);
		
		System.out.println(ilkharf + " " + ikinciHarf + " " + ucuncuHarf);
		
		
	}

}
