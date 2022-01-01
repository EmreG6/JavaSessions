package day10_TernarySwitchCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		// Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayý giriniz");
		double sayi=scan.nextDouble();
		
		double mutlakDeger=sayi>0 ? sayi : (-1)*sayi;
		System.out.println(mutlakDeger);

		
		scan.close();
	}

}
