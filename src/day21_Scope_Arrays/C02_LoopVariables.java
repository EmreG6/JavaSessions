package day21_Scope_Arrays;

import java.util.Iterator;

@SuppressWarnings("unused")
public class C02_LoopVariables {

	public static void main(String[] args) {
		
		int sayi=10;
		
		for (int i = 0; i < 6; i++) {
			String isim="Ali";
			System.out.println(sayi+ " "+ isim);
			
		}
		// System.out.println(isim);
		// System.out.println(i);
		
		// Loop icerisinde olusturulan variable'lar loop disinda kullanilamazlar
		// Bunun icin loop disinda da ihtiyacimiz olan bir degisken varsa
		// loop'tan once olusturur ve emniyette kalmak icin initialize yapariz
		
		for (int i = 0; i < 10; i++) {
			// int sayi; // sayi variable'i main metmhod'un icinde olusturuldugundan tum main method'da 
						 // gecerlidir, dolay�s�yla yeniden ayni isimde bir variable olusturamazsiniz.

			String isim="Veli";
			
		}
		
	}

}
