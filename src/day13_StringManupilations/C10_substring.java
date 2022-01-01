package day13_StringManupilations;

public class C10_substring {

	public static void main(String[] args) {
		/* substring() 		: index olarak verilen String'in istenen parcasini almamizi saglar
		 * 					 -parametre olarak 2 sayý girilirse, girilen index'den String'in sonuna kadar bolumu
		 * 					 -parametre olarak 2 sayi girilirse, girilen 1.sayidaki indexten (inclusive) baslayip,
		 * 					  2. sayiya kadar (exclusive) karakteri dondurur.
		 */
		
		String str="Java OOP konsepti kullanir";
		
		System.out.println(str.substring(5,11));  	//OOP ko
		System.out.println(str.substring(3,4)); 	//a
		System.out.println(str.substring(8,8)); 	//hiclik
		System.out.println(str.substring(8,2)); 	//Hata verir
		
		/* NOT 			: Java'da iki tur hata aliriz.
		 * 				1- Compile Time Error (CTE) : Kodumuzu yazarken kod altinin kirmizi cizgi olmasi
		 * 				2- Run Time Error (RTE) : Kod calistirildiginda (execute) karsilastigimiz hatalar
		 * 
		 */
		

	}

}
