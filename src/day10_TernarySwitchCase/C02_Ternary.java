package day10_TernarySwitchCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		// Soru 1: Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriiniz");
		double sayi1=scan.nextDouble();
		System.out.println("lutfen bir sayi daha giriniz");
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1>sayi2 ? sayi2 :sayi1);
		
		
		
		
		scan.close();
		
		

	}

}
