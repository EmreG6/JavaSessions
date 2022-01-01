package day07_IfElseStatement;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
		//		   birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
		//		   “Eskenar degil”
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen ucgenin bir kenar uzunlugunu giriniz ");
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen ucgenin diger kenar uzunlugunu giriniz ");
		double kenar2=scan.nextDouble();
		
		System.out.println("Lutfen ucgenin diger kenar uzunlugunu giriniz ");
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 &&  kenar2==kenar3) {
			System.out.println("Eskenar ucgen");
			
		} else {
			System.out.println("Eskenar degil");

		}
		
		scan.close();
		
		
		
		
		
		
		

	}

}
