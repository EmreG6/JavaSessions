package day03_IncrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		// soru7 : Kullan�c�dan ismini al�p ba� harflerini �al��t�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen isminizi yaz�n�z");
		
		char ilkHarf=scan.next().charAt(0); //!!! 
		System.out.println("isminizin ilk harfi : " + ilkHarf);
		
		scan.close();

	}

}
