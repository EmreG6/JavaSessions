package day13_StringManupilations;

import java.util.Scanner;

public class C02_StartsWith_EndsWith {

	public static void main(String[] args) {
		// Kullanicidan bir c�mle ve bir kelime al�n
		//	verilen c�mlenin verilen kelime(char squence) ile baslay�p , baslamadigini
		//  ve bitip bitmedigini yazidirn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir c�mle yaziniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen kelime yaz�n�z");
		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile basliyor");
		} else {
			System.out.println("girilen cumle " + kelime + " ile baslamiyor");
		}
		
		if (cumle.endsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile bitiyor");
		} else {
			System.out.println("girilen cumle " + kelime + " ile bitmiyor");
		}
		
		
	scan.close();

	}

}
