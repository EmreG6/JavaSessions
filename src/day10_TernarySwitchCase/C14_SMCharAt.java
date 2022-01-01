package day10_TernarySwitchCase;

public class C14_SMCharAt {

	public static void main(String[] args) {
		// charAt(istenenIndex) method'u istedigimiz index'deki karakteri bize verir
		
		String kurs="Techproeducation";
		System.out.println(kurs.charAt(5)); //r
		
		//index 0 ile baslar
		
		System.out.println(kurs.charAt(7)); //e
		System.out.println(kurs.charAt(15)); //n
		System.out.println(kurs.charAt(16)); //hata verir 
		
	}

}
