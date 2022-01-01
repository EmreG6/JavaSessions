package day13_StringManupilations;

public class C09_substring {

	public static void main(String[] args) {
		/* substring() 		: index olarak verilen String'in istenen parcasini almamizi saglar
		 * 					 -parametre olarak 2 sayý girilirse, girilen index'den String'in sonuna kadar bolumu
		 * 					 -parametre olarak 2 sayi girilirse, girilen 1.sayidaki indexten (inclusive) baslayip,
		 * 					  2. sayiya kadar (exclusive) karakteri dondurur.
		 
		 */
		
		String str="Java OOP konsepti kullanir";
		
		System.out.println(str.substring(0));  //Java OOP konsepti kullanir
		System.out.println(str.substring(10)); //onsepti kullanir
		System.out.println(str.substring(26)); //týrnaktan sonra hiclik oldugu icin bos
		System.out.println(str.substring(29)); //hata verir index sýnýrlarýn disinda
		
		

	}

}
