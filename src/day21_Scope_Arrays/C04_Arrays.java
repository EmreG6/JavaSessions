package day21_Scope_Arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		//Array'Ýn tum elemanlarini yazdirmak istersek loop ile yazdirabiliriz
		
		int arr[]= {2,4,6,78,89};
		//tum elementleri yazdirabiliriz
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		
		//Ya da Arrays class'indan yardim alip direk array olarak yazdirabiliriz
		System.out.println(Arrays.toString(arr));
		
	}

}
