package javaKodSorulari04;

public class JavaKodSorulari0404 {

	public static void main(String[] args) {
		
		
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise “name1 cift sayili olmadigi icin ortasina yerlestiremedik” yazdirin.
		          e.g:
		          name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/


		String name1 = "Mehmet";
		String name2 = "Ahmet";
		
		System.out.println(name1.substring(0,(name1.length()/2)));
		
		System.out.println(name1.substring((name1.length()/2),name1.length()));
		
		 if (name1.length() % 2==0) {
			
			System.out.println(name1.substring(0,(name1.length()/2)) + name2 + name1.substring((name1.length()/2),name1.length())); 	
		
		 } else {
			 System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
		}
		
		
	}

}
