package day12_StringManupilations;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan email adresini girmesini isteyin
		//			-mail @gmail.com icermiyorsa "lutfen gmail adresinizi giriniz",
		//			-@gmail.com ile bitiyorsa "email adresiniz kaydedildi.",
		//			-@gmail.com ile bitmiyorsa "lutfen yazimi kontrol edin." yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gmail adresinizi giriniz");
		
		String email=scan.nextLine();
		
		int uzunluk=email.length();
		int index=email.lastIndexOf("@gmail.com");
		
		if (!email.contains("@gmail.com")) {  // ! isareti varsa icermiyorsa anlamý olusur (not contains)
			System.out.println("lutfen gmail adresinizi giriniz");
			
		} else if (index==uzunluk-10) {
			System.out.println("email adresiniz kaydedildi");
		} else{
			System.out.println("lutfen yazýmý kontrol ediniz");

			
		scan.close();
		}
		
		
		
	}

}
