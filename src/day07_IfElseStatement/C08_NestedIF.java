package day07_IfElseStatement;

import java.util.Scanner;

public class C08_NestedIF {

	public static void main(String[] args) {
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekl� olab�l�r
		// cal�san erkekse 65 yas�ndan buyukse emekli olabilir
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin E, Kadin icin K");
		char cinsiyet=scan.next().toUpperCase().charAt(0); //toUpper b�y�k harf icin yaz�l�yor
		
		System.out.println("Lutfen yasinizi giriniz");
		double yas=scan.nextDouble();
				
		if (cinsiyet=='E') {
			if (yas>=65) {
				System.out.println("Emekli olabilirsiniz");
				
			} else {
				System.out.println("Emekli olamaz�sn�z");

			}
			
			
			
			
		} else if(cinsiyet=='K') {
			if (yas>=60) {
				System.out.println("Emekli olabilirsin");
				
			} else {
				System.out.println("Emekli olabmazs�n�z");
			}
			
			
			
			
			

		}else {
			System.out.println("Lutfen cinsiyet icin gecerli bir harf seciniz");
		}
		
		
		
		
		scan.close();
		
	}

}
