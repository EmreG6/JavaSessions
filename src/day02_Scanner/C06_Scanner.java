package day02_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// Scanner isleminde String için iki method verir
		//scan.next() dediðimizde sadece 1 kelime alýr
		//eðer kullanýcýdan daha fazla kelime gelme ihtimali varsa 
		//scan.nextLÝne() kullanmalýyýz
		
		//kullanýcýdan isim ve soyismi ayrý ayrý isteyip 
				//girilen ismi aþaðýdaki gibi yazdýrýnýz
				
				//girilen isim : Mehmet Bulutluoz
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Lütfen isminiz giriniz...");
				
				String isim=scan.nextLine();
				
				System.out.println("Lütfen soyisminizi yazýnýz...");
				
				String soyisim=scan.nextLine();
				
				System.out.println("girilen isim : "+ isim + " " + soyisim);
				
				scan.close();
	}

}
