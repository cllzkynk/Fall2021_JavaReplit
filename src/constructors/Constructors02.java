package constructors;

import java.util.Scanner;

public class Constructors02 {
	static String name;
	static String surName;
	static String MorF;
	static int age;
	static Scanner scan=new Scanner(System.in);
	static Constructors02 ogr=new Constructors02();

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		 
		 
		ogr.name="Celil";
		ogr.surName="Ozkaynak";
		ogr.MorF="M";
		ogr.age=32;
		
		
		System.out.println("Before method");
		System.out.println(ogr.name);
		System.out.println(ogr.surName);
		System.out.println(ogr.MorF);
		System.out.println(ogr.age);
		
		
		
		Change(name,surName,MorF);
		
		System.out.println("After method");
		System.out.println(ogr.name);
		System.out.println(ogr.surName);
		System.out.println(ogr.MorF);
		System.out.println(ogr.age);
		
		
	}


	@SuppressWarnings("static-access")
	public static void Change(String name2, String surName2, String morF2  ) {
		System.out.println("Yeni ismi girniz");
		ogr.name=scan.next();
		System.out.println("Yeni soyismi girniz");
		ogr.surName=scan.next();
		System.out.println("Yeni  cinsiyeti girniz");
		ogr.MorF=scan.next();
	;
	scan.close();}

	
}   
