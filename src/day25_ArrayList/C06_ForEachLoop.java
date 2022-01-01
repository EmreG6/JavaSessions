package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile hic ugrasmadan bir array veya listedeki tum elemanlari
		// gozden gecirmek isteriz
		
		int arr[]= {1,2,3,5,3,2,7};
		
		// bu array'i esnek bir list yapmak istiyorum
		
		List<Integer> yeniList= new ArrayList<>();
		
		for (int each : arr) { // arr'den her bir (each) int'i bana getir
			
			yeniList.add(each);
			// burada yazdirmayi denesene! :)
		}
		
		System.out.println(yeniList);
		// eger bir list veya array'in tum elemanlarini elden gecirmek istiyorsak
		// ve siralama onemli degile
		// for-each loop kullaniriz
		

	}

}
