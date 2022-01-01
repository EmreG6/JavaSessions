package day16_ForLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		//			1’den baslayarak girilen sayiya kadar, 3’un kati olan sayilari yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz...");
		double num=scan.nextDouble();
		int sayi=(int) num;
		
		//sayi negatifse veya tamsayi degilse uyari verelim
		
		if (num<=0) {
			System.out.println("Negatif sayi giremezsiniz!");
			
		} else if (sayi!=num) {
			System.out.println("lutfen tam sayi giriniz heheloy");
		} else if (sayi>100) {
			System.out.println("Lutfen 100'den buyuk sayi girmeyiniz heheloy");
			
		} else{
			
			for (int i = 1; i <= num; i++) {
				
				if (i%3==0) {
					System.out.print(i +" ");
					
				}
		}
		
		
		
		
		
		
		

			
		}
		scan.close();

	}

}
