package day09_NestedIfElse;

import java.util.Scanner;

public class C02_NestedIfELse {

	public static void main(String[] args) {
		// Soru 12) Kullanýcýdan 4 basamaklý bþr sayý girmesini isteyin.
		//			Girdigi sayi 5'e bolunuyorsa son rakamý kontrol edin.
		//			Son rakamý 0 ise "5'e bolunen cift sayý" yazdýrýn
		//			Son rakamý 0 degil ise "5'e bolunen tek sayý" ayzdýrýn
		// 			Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 basamaklý bir sayý giriniz");
		int sayi=scan.nextInt();
		
		if (sayi<1000 || sayi>9999) {
			System.out.println("4 basamaklý pozitif sayý girmelisiniz");
			
		} else  { 
			
			if (sayi%5==0) {
				
				if (sayi%10==0) {
				System.out.println("5'e tam bolunen cift sayi");
				} else {
					System.out.println("5'e tam bolunen tek sayi");
				}
				
				
				
				
				
			} else {
				System.out.println("Lutfen tekrar deneyiniz");
			}
			
			
		}
		scan.close();
	}

}
