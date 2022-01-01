package day10_TernarySwitchCase;

import java.util.Scanner;

public class C03_Ternary {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		System.out.println((sayi%2==0) ? "cift sayi" : "tek sayý");
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
