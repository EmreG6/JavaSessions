package day03_IncrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		// soru7 : Kullanýcýdan ismini alýp baþ harflerini çalýþtýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isminizi yazýnýz");
		
		char ilkHarf=scan.next().charAt(0); //!!! 
		System.out.println("isminizin ilk harfi : " + ilkHarf);
		
		scan.close();

	}

}
