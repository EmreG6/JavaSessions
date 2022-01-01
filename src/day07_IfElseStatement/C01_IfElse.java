package day07_IfElseStatement;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
		//		   olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu giriniz ");
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin diger kenar uzunlugunu giriniz ");
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen olculer karedir");
		} else {
			System.out.println("girilen olculer kare degildir");
		
		scan.close();
		}
	}

}
