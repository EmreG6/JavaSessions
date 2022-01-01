package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// verilen array'i ARrays class'indan yardim alarak
		// list'e cevirebiliriz
		
		String arr[]= {"A","b","C","d"};
		List <String> arraydenList= Arrays.asList(arr);
		
		System.out.println("List : " + arraydenList);
		
		//arraydanList.add("F");		//RTE : Unresolved compilation problem
										//CTE olmasi icin syntax'te problem olmasi lazim, ancak bu yazimda syntax hatasi yok
		
		// bu sekilde Arrays class'indan yardim alarak array'i list'e cevirirsek olusturdugumuz list'in boyutu sabit olur
		// dolaysisyla add() veya clear() gibi methodlari calistimak istersek 
		// UnsupportedOperationException : Desteklenmeyen islem hatasi verir
		
		arr[1]="Z";
		System.out.println("Array'i degistirdikten sonra, array : " + Arrays.toString(arr));
		System.out.println("Array'i degistirdikten sonra, list : " + arraydenList);
		
		arraydenList.set(3, "D");
		System.out.println("List'i degistirdikten sonra, list :" + arraydenList);
		System.out.println("List'i degistirdikten sonra, array : " + Arrays.toString(arr));
		
		System.out.println(arr);

	}

}
