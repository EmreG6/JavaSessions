package day18_NestedForLoop_WhileLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		/*	Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan 
		 * 			 15, 20 ve 90’na tam bolunebilen sayilari yazdirin.
		 */

		
		for (int i = 100; i < 1000; i++) {
			if (i%15==0 && i%20==0 && i%90==0) {
				System.out.print(i);
			
		}
	}
		System.out.println();
		int sayi=100;	//baslangic degerim
		while (sayi<1000) {
			if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
				System.out.print(sayi);
				
			}
			sayi++;
		}
		
		//eger baslangic ve bitis sarti bir sayiin artisina bagli ise veya 
		//tekrar edilecek islem adedi belli ise for loop tercih edilir.

		//islem tekrar sayisi belli degil ise 
		//veya bitis icin bir sinir degerinden buyuk olma gib bir sart varsa while loop tercih edilir
		
}
}