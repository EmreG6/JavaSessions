package day02_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		//kullan�c�dan isim ve soyismi ayr� ayr� isteyip 
		//girilen ismi a�a��daki gibi yazd�r�n�z
		
		//girilen isim : Mehmet Bulutluoz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen isminiz giriniz...");
		
		String isim=scan.next();
		
		System.out.println("L�tfen soyisminizi yaz�n�z...");
		
		String soyisim=scan.next();
		
		System.out.println("girilen isim : "+ isim + " " + soyisim);
		
		scan.close();

	}

}
