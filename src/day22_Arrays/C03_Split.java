package day22_Arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// "Java ogrenmek cok guzel"
		// cumlesinin kelimelerini ters yazdirin
		
		String cumle ="Java ogrenmek cok guzel";
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler)); // [Java,ogrenmek, cok, guzel]
		
		for (int i = kelimeler.length-1; i >=0 ; i--) {
			System.out.print(kelimeler[i] + " ");
			
		}

	}

}