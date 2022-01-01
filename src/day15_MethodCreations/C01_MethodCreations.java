package day15_MethodCreations;

import java.util.Scanner;

public class C01_MethodCreations {

	public static void main(String[] args) {
		// kullanicidan iki kelime isteyin
		// iki farkli method olusturun. methodlardan biri girilen kelimeleri 
		// 		ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		// ikinci method isim ve soyismin ilk harfleri buyuk harf,
		//		kalan harler * olacak sekilde birlestirsin
		// kullanciya isminin acik olarak yazilmasý veya gizlenmesi tercihini sorun 
		// ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isim ve soyisminizi girin \nisimden sonra enter'a basin");
		
		String isim=scan.next();
		String soyisim=scan.next();
		
		// acikIsim (isim,soyisim);     method olusturmada kullanýldý-silinebilir
		// IsimGizle (isim,soyisim);	method olusturmada kullanýldý-silinebilir
		
		System.out.println("Isminizin acik bir sekilde yazýlmasýný istiyorsaniz 1'e "
				+ "\nilk harf haric gizli kalmasiniz istiyorsaniz 2'ye basiniz");
		
		int tercih=scan.nextInt();
		
		String birlesmisIsim=null; //Emre Gul - E*** G**
		
		if (tercih==1) {
			birlesmisIsim=acikIsim(isim, soyisim);
			
		} else if (tercih==2) {
			birlesmisIsim=IsimGizle(isim, soyisim);
			
		} else {
			System.out.println("Lutfen 1 veya 2 arasinda bir tercih yapin");

		}
		
		// bu satirdan sonra kullanicinin isim ve soyismi kullanicinin tercihine baglý olarak kaydedildi
		
		System.out.println("kullanicinin adi : " + birlesmisIsim);
		
		scan.close();

	}

	public static String IsimGizle(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		
		return isim+" "+soyisim;
		
	}

	public static String acikIsim(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim+" "+soyisim;
		
		
	}

}
