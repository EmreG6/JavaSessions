package day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// 	Kullanicidan toplanmak uzere sayi isteyin
		//	kullanici sifira basincaya kadar sayilari alip
		//	toplamaya devam edin
		//	kullanici sifira bastiginda
		//	o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		//	Kullanicidan 5 sayi alin dese
		
		for (int i = 1; i <=5; i++) {
					// kullanicidan bir deger alip, toplama eklerim		
		}
		
		Scanner scan=new Scanner(System.in);
		/*
		 * 	loop'tan once kullanacagim object ve variable'lari
		 * 	loop'tan once olusturmak daha guzeldir
		 * 	cunku loop'un icinde olusturursak 
		 * 	loop her dondugunde yeni bir object ve variable olsuturur ve bu da hazfizayi doldurur
		 */
		
		int sayi=100; //0 disinda ne yazarsak olur
		int toplam=0;
		int sayac=0;
		
		
		while (sayi!=0) {
			
			System.out.println("Lutfen toplama eklemek icin bir tamsayi yazin \nBitirmek icin 0'a basin");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
		}
			// kullanici 0'a bastiginda loop islemini son kez yapip
			// sonra basa donecek ve loop bitecek
			// 0 toplanmak uzere verilmeyip sadece bitirmek icin verildiginden 
			//	sifiri'i sayaca eklemek icin 46.satirda sayaci -1 yaptik
		
		System.out.println("girilen sayi adedi : " + (sayac-1));
		System.out.println("girilen sayilarin toplami : " + toplam);
		scan.close();
	}

}
