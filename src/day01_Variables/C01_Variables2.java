package day01_Variables;

public class C01_Variables2 {
	public static void main(String[] args) {	
		int sayi1=10;
		int sayi2=20;
		
		String sayi3="10";
		String sayi4="20";
		
		System.out.println(sayi1+sayi2);
		System.out.println(sayi3+sayi4);
		
		String harf1="A";
		char harf2='A';
		
		System.out.println(sayi1+sayi2+harf1);
		System.out.println(sayi1+sayi2+harf2); 
		// farkl� data t�rleri ayn� de�eri alabilir.
		// burada �nemli olan bu de�i�keneri de�i�ken t�r�ne g�re i�lem yapabilece�imdir.
		// char extra �zelli�i sebebiyle matematiksel i�lemlerde numerik de�er al�r
		
		System.out.println(harf1+sayi1+sayi2); //A1020
		// Stringle ba�lad��� i�in di�er i�lemleri de harf olarak alg�lad�.
		
		System.out.println(sayi1+harf1+sayi2); //10A20
		System.out.println(harf1+(sayi1+sayi2)); //parantez oldu�unda i�lem �nceli�i olu�ur.
		
		
	}

}
