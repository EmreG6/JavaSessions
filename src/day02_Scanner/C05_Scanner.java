package day02_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		//kullanýcýdan isim ve soyismi ayrý ayrý isteyip 
		//girilen ismi aþaðýdaki gibi yazdýrýnýz
		
		//girilen isim : Mehmet Bulutluoz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen isminiz giriniz...");
		
		String isim=scan.next();
		
		System.out.println("Lütfen soyisminizi yazýnýz...");
		
		String soyisim=scan.next();
		
		System.out.println("girilen isim : "+ isim + " " + soyisim);
		
		scan.close();

	}

}
