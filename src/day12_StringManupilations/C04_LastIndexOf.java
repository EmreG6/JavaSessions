package day12_StringManupilations;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, 
		//				kelimenin cumledeki
		//				kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		//				-Girilen kelime cumlede kullanilmamis.
		//				-Girilen kelime cumlede 1 kere kullanilmis.
		//				-Girilen kelime cumlede 1’den fazla kullanilmis.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("lutfen varligini kontrol etmek icin bir kelime giriniz");
		
		String kelime=scan.next();
		
		int ilkIndex=cumle.indexOf(kelime);
		int sonIndex=cumle.indexOf(kelime);
		
		if (ilkIndex==(-1)) {
			System.out.println("Girilen kelime cumlede kullanýlmamýs");
		} else if (ilkIndex==sonIndex) {
			System.out.println("Girilen kelime cumlede 1 kere kullanýlmýs");
		} else{
			System.out.println("Girilen kelime cumlede 1'den fazla kullanýlmýs");
		}
		
		scan.close();
			
		

	}

}
