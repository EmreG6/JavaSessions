package day11_StringManupilations;

public class C03_Length {

	public static void main(String[] args) {
		
		String str1= "Ali Kahyaoglu";
		System.out.println(str1.length());
		
		// verilen str1'in son harfini yazdirin
		System.out.println(str1.charAt(str1.length()-1)); //!!!! onemli
		
		String str2="";
		System.out.println(str2.length()); //0
		
		String str3=null;
		// System.out.println(str3.length()); //java.lang.NullPointerException
		
		//String str4;
		System.out.println(str3); // null
		
		// System.out.println(str4); // 	// Eger String'i olusturur deger atamazsak hata alýrýz
		// null pointer olusturdugumuz fakat sonra kullanacagýmýz bir String'i isaretlemek icin kullanýlýr
		// Bir String'i yazdirdigimizda null cikiyorsa turkce olarak 
		// "Ben bu degiskeni olusturdum ama henuz deger atamadým" demek istiyor
		
		
		

	}

}
