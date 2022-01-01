package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_MDArrays {

	public static void main(String[] args) {
		//	Soru 5 : Kullanicidan bir cumle isteyin ve 
		//		     cumledeki kelime sayisini yazdirin
		
		
		String cumle="her sey Javayla kolay, degil mi?";
		
		String kelimeler[]=cumle.split(" ");	
		
		System.out.println(Arrays.toString(kelimeler));
		System.out.println("Girilen cumlede " + kelimeler.length + " adet kelime var");
	}

}
