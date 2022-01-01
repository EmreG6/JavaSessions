package day06_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		/* Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
					isimlerini yazdirin
					Ornek:
					ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
					ilkHarf=S output = “Sali”
		 			*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun isimlerinden birinin ilk harfini yaznýz");
		// kullanýcýnýn girdiði verinin tamamýnýküçük yada buyuk harf yapabiliriz
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("Pazar, Pazartesi veya Persembe");
		}
		
		if (ilkHarf=='S') {
			System.out.println("Salý");
		}
		
		if (ilkHarf=='C' || ilkHarf=='c') {
			System.out.println("Carsamba, Cuma veya Cumartesi");
		}
		
		if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {
			System.out.println("Gecersiz harf girdiniz.Lutfen gün isimlerinden birinin bas harfini giriniz");
		}
		
		
		scan.close();
		
		
		
		
		
	}

}
