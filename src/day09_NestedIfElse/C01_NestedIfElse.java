package day09_NestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
		// Soru 11) NestedIfkullanarak asagıdaki soruyuceozen kodu yazınız
		//			Kullanıcıdan bir sifre girmesini isteyin
		//			Eger ilk harf buyuk harf ise 
		//			"A" olup olmadıgını kontrol edin. Ilk harf A ise "Gecerli Sifre"
		//			Eger ilk harf kucuk harf ise 
		//			"z" olup olmadıgını kontrol edin. Ilk harf z ise "Gecerli Sifre"
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		char ilkKarakter=scan.next().charAt(0);
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') { // buyuk harfleri secmis olacak
			if (ilkKarakter=='A') {
				System.out.println("Gecerli Sifre");
			} else {
				System.out.println("Gecersiz Sifre");
			}
			
			
		} else if(ilkKarakter>='a' && ilkKarakter<='z') {
				if (ilkKarakter=='z') {
					System.out.println("Gecerli Sifre");	
				} else {
					System.out.println("Gecersiz Sifre");
				}

			
		}else {
			System.out.println("Gecerli sifre olması icin harf ile baslayiniz");
		}

		
		scan.close();
	}

}
