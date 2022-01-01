package day22_Arrays;

import java.util.Arrays;

public class C02_Arrays {

	public static void main(String[] args) {
		
		String isimler[]= {"Hacer", "ainagul", "Emine", "Murat", "Kutlu" };
		
		// isimler array'inde Murta ismi var mi?
		// array'da arama yapmadan once siralama yapmaliyiz
		
		Arrays.sort(isimler);
		// arrays class'i ile sort yaptigimizda arrayimiz kalici olarak degisir
		
		System.out.println(Arrays.toString(isimler)); //[Ainagul, Emine, Hacer, Kutlu, Murat]
		// sort method'u elementleri natural order'a gore siralar.
		
		isimler[4]="Ainagul";
		System.out.println(Arrays.toString(isimler));
		// sort yapilmadan siralama degismez
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); //4
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); //mehmet olsaydi hangi siralamada olurdu: -5
		
		System.out.println(Arrays.binarySearch(isimler, "Tuba")); //-6
		
		System.out.println(Arrays.binarySearch(isimler, "Kursad")); //-4
		
		
		

	}

}
