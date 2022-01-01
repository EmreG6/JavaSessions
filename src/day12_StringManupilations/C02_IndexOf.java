package day12_StringManupilations;

import java.util.Scanner;

public class C02_IndexOf {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, 
		//			kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		//			-Girilen kelime cumlede kullanilmamis.
		//			-Girilen kelime cumlede 1 kere kullanilmis.
		//			-Girilen kelime cumlede 1’den fazla kullanilmis.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("lutfen varligini kontrol etmek icin bir kelime giriniz");
		
		String kelime=scan.next();
		
		int index=cumle.indexOf(kelime);
		
		if (index<0) {
			System.out.println("girilen kelime cumlede kullanýlmamýs");
			
		} else if (cumle.indexOf(kelime, index+1)==(-1)) {
			
			System.out.println("girilen kelime bir kere kullanýlmýs");
			
		}else {
			System.out.println("girilen kelime cumlede birden fazla kullanýlmýs");

		}
		
		scan.close();
	}

}
