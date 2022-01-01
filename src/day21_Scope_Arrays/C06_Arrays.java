package day21_Scope_Arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		int arr[] = { 3, 5, 8, 5, 2, 4 };

		int toplam = 0;
		for (int i = 0; i < arr.length; i++) {
			toplam += arr[i];
		}

		System.out.println("elementlerin toplami : " + toplam);
		
		// array'in tum elemanlari once kucukten buyuge, sonra buyukten kucuge yazdirin
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//	buyukten kucuge yazdirmak icin 
		// ya for loop ile elemanlari yazdiririz
		for (int i = arr.length-1; i >0 ; i--) {
			System.out.print(arr[i]+ " ");	
		}
		
		// array yapmak isterseniz ayni uzunlukta bir array olusturup
		// elemanlari ters sirada yeni arraya tasiyabilirsiniz
		
		System.out.println(" ");
		
		int tersArray[]=new int[arr.length];
		
		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i]=arr[arr.length-1-i];
			
		}
		
		System.out.println(Arrays.toString(tersArray));
		
		
		
		
		
	}

}
