package day07_IfElseStatement;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
		// Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
		//			sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
		//			isaretlere sahipse �farkli isaretlerde sayilarla islem yapamazsin� yazdirin,
		//			sayilardan sifira esit olan varsa �sifir carpmaya gore yutan elemandir� yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki say� yaz�n�z \nilk say�dan sonra di�er say� i�in enter'e bas�n");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1>0 && sayi2>0) {
			System.out.println("sayilar�n toplam� :" +(sayi1 +sayi2));
			
		} else if (sayi1<0 && sayi2<0) {
			System.out.println("sayilar�n carpimi :" +(sayi1 *sayi2));
		
		} else if (sayi1*sayi2<0) {
			System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
		} else {
			System.out.println("sifir carpmaya gore yutan elemandir");
			
		scan.close();
	}
	}
}