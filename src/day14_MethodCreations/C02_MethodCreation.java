package day14_MethodCreations;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// kullanicidan iki sayi isteyin
		// sayilarin karelerini ve kuplerini toplayan iki ayri method yazin
		// kullaniciya us sorun
		// 2 yazarsa karelerin toplamini yapan method, 3 yazarsa kupleri toplamini yapan method calissin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi girin \nilk sayidan sonra enter'a basin");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		//kareTopla(sayi1,sayi2);
		//kupTopla(sayi1,sayi2);
		System.out.println("Girilen sayilarin karelerinin toplamini isterseniz 2 "
				+ "\nkuplerler toplamini isterseniz 3'e basin");
		
		int secim=scan.nextInt();
		
		switch (secim) {
		case 2:
			kareTopla(sayi1, sayi2);
			break;
		case 3:
			kupTopla(sayi1, sayi2);
			break;

		default:
			System.out.println("Lutfen istenen tercihlerden birini yapin");
			break;
		}
				
		
	
		
		/*
		 * Bir method'u 4 adýmda olusturuyoruz
		 * 1-medhod'u javaya olusturabilmek icin method call yapýyoruz
		 * 2-arguman ihtiyacý var mý belirliyelim
		 * 3-java'dan yardým alarak method'u olusturalým
		 * 4-access modifier ve return type'a karar ver
		 * bundan sonra method'a isini tanýmlamamaýz lazým
		 * 
		 */
		
		
		
		
		scan.close();

	}

	public static void kupTopla(double sayi1, double sayi2) {
		double kuplerToplami=(sayi1*sayi1*sayi1)+(sayi2*sayi2*sayi2);
		System.out.println("Girilen sayilarýn kupler toplami : "+ kuplerToplami);
		
	}

	public static void kareTopla(double sayi1, double sayi2) {
		// bizim arguman isimlerimizle paramtere isimlerimiz ayný olmak zorunda degil
		// java isimlere degil degerlere bakar
		// bu bir zorunluluk degil imkandýr. istedigimizi tercih edebiliriz.
		
		double karelerToplami= (sayi1*sayi1 + sayi2*sayi2);
		System.out.println("Girilen sayýlarýn karelerinin toplami : " +karelerToplami);
		
				
		
		
		
		
		
	}

}
