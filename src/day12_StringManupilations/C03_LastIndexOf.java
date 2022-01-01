package day12_StringManupilations;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin,
		// harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("lutfen varligini kontrol etmek icin bir harf giriniz");
		
		char krk=scan.next().charAt(0);
		
		int index=cumle.lastIndexOf(krk);
		
		if (index==(-1)) {
			System.out.println("harf cumlede kullanýlmamis");
			
		} else {
			System.out.println("harf cumlede kullanýlmis");
		}
		scan.close();
	}

}
