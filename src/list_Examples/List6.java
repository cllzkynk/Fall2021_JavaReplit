/**
 * 
 */
package list_Examples;

import java.util.ArrayList;
import java.util.List;
/**
 * @author CELÝL
 */
public class List6 {

	public static void main(String[] args) {
		/*
		 * Write a program to find the common elements between two String Arrays
		 * (without case sensitivity)
		 * 
		 * Input1 : {John,Brad,Ange,Sofia,Emily}
		 * 
		 * Input2 : {sofia,brad,grace,emily,hazel}
		 * 
		 * Output : [sofia,brad,emily]
		 */
		
		String []arr1= {"John","Brad","Ange","Sofia","Emily"};
		
		String []arr2= {"sofia","brad","grace","emily","hazel"};
		
		List<String> ortaklar=new ArrayList<>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equalsIgnoreCase(arr2[j])) {
					ortaklar.add(arr2[j]);
				}
			}
		}
		 
		
		System.out.println(ortaklar);
		
		
		
		
		

	}

}
