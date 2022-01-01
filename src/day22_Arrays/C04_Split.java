package day22_Arrays;

import java.util.Arrays;

public class C04_Split {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para ?kazandim.,"
		// cumlesinin kelimelerini, ozel karakterler ve noktalama isareti olmadan 
		// harf sirasina gore yazdiralim
		
		String cumle="Java ogrendim,  #cok para ?kazandim.,";
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler)); // [Java, ogrendim,, , #cok, para, ?kazandim.,]
		
		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i] = kelimeler[i].replaceAll("\\W", "");
			
		}
		System.out.println(Arrays.toString(kelimeler));
		
		Arrays.sort(kelimeler);
		@SuppressWarnings("unused")
		String yeniCumle="";
		System.out.println(Arrays.toString(kelimeler));
		
		for (int i = 0; i < kelimeler.length; i++) {
			System.out.print(kelimeler[i]+ " ");
			
	
			
		}
	}

}
