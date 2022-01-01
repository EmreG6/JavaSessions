package day40_Exception;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Soru: Kullanicidan yasini girmesini isteyin
		//		 Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen konsolda gormek icin yasiniiz giriniz");
		
		int yas=scan.nextInt();
		
		try {
			if (yas<0) {
				throw new IllegalArgumentException();

			} else {
				System.out.println(yas);
			}
			
			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yas sifirdan kucuk olamaz");
		}
		
		scan.close();

	}

}
