package day09_NestedIfElse;

import java.util.Scanner;

public class C02_NestedIfELse {

	public static void main(String[] args) {
		// Soru 12) Kullan�c�dan 4 basamakl� b�r say� girmesini isteyin.
		//			Girdigi sayi 5'e bolunuyorsa son rakam� kontrol edin.
		//			Son rakam� 0 ise "5'e bolunen cift say�" yazd�r�n
		//			Son rakam� 0 degil ise "5'e bolunen tek say�" ayzd�r�n
		// 			Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 basamakl� bir say� giriniz");
		int sayi=scan.nextInt();
		
		if (sayi<1000 || sayi>9999) {
			System.out.println("4 basamakl� pozitif say� girmelisiniz");
			
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
