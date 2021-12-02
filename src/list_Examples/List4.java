/**
 * 
 */
package list_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author CELÝL
 */
public class List4 {

	public static void main(String[] args) {
		/*
		 * Write a program that deletes the letters 'a' from the names in the list given
		 * as input.
		 * 
		 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
		 * 
		 * OUTPUT :
		 * 
		 * [Veli,Omer]
		 * 
		 */
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
		System.out.println(list);
		for (int i = list.size()-1; i >=0; i--) {
			if ( list.get(i).toLowerCase().contains("a") ) {
				list.remove(i);
				
			}
		}
		System.out.println(list);
		}
	
	}


