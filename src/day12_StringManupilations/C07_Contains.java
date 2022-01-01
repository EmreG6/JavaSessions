package day12_StringManupilations;

import java.util.Scanner;

public class C07_Contains {

	public static void main(String[] args) {
		// Soru 2) kullanýcýdan bir cumle isteyin.
		//		    -cumle buyuk kelimsei iceriyorsa tum cumleyi buyuk harf olarak,
		//		    -"kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdýrýn,
		//			-iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor" yazdirin
		// 			- iki kelimeyi de iceriyorsa"kucuk mu buyuk mu karar ver"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		
		if (cumle.contains("buyuk")&& cumle.contains("kucuk")) {
			System.out.println("kucuk mu buyuk mu karar ver");
		} else if (cumle.contains("kucuk")) {
			System.out.println(cumle.toLowerCase());
		} else if(cumle.contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
		} else {
			System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
		}
			
		
	
		
		
		scan.close();
	}

}
