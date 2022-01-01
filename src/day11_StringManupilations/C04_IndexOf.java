package day11_StringManupilations;

public class C04_IndexOf {

	public static void main(String[] args) {
		// parametre olarak girilen bir char veya String'in
		// ilk index'ini verir
		
		String str= "Calisirsaniz, Java ogrenmej cok kolay";
		
		System.out.println(str.indexOf('s')); //4
		System.out.println(str.indexOf('J')); //14
		
		int index=str.indexOf("r"); // indexof() method'ubize her zaman int bir deger doner
		
		System.out.println(index); //6
		
		System.out.println(str.indexOf('q')); //-1
		// Bir String icinde olmayan bir karakter veya kelime ararsak java -1 sonucunu dondurur
		
		System.out.println(str.indexOf('A')); //-1
		
		
		
		

	}

}
