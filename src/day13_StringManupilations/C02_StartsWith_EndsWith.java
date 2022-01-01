package day13_StringManupilations;

import java.util.Scanner;

public class C02_StartsWith_EndsWith {

	public static void main(String[] args) {
		// Kullanicidan bir cümle ve bir kelime alýn
		//	verilen cümlenin verilen kelime(char squence) ile baslayýp , baslamadigini
		//  ve bitip bitmedigini yazidirn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cümle yaziniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen kelime yazýnýz");
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
