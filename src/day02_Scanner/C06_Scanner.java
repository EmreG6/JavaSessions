package day02_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// Scanner isleminde String i�in iki method verir
		//scan.next() dedi�imizde sadece 1 kelime al�r
		//e�er kullan�c�dan daha fazla kelime gelme ihtimali varsa 
		//scan.nextL�ne() kullanmal�y�z
		
		//kullan�c�dan isim ve soyismi ayr� ayr� isteyip 
				//girilen ismi a�a��daki gibi yazd�r�n�z
				
				//girilen isim : Mehmet Bulutluoz
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("L�tfen isminiz giriniz...");
				
				String isim=scan.nextLine();
				
				System.out.println("L�tfen soyisminizi yaz�n�z...");
				
				String soyisim=scan.nextLine();
				
				System.out.println("girilen isim : "+ isim + " " + soyisim);
				
				scan.close();
	}

}
