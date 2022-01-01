package day10_TernarySwitchCase;

import java.util.Scanner;

public class C05_Ternary {

	public static void main(String[] args) {
		// Soru 4 Kullanicidan bir sayi alin Sayi pozitifse “Sayi pozitif” yazdirin, negatifse
		//		  sayinin karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi yazýnýz");
		Double sayi=scan.nextDouble();
		
		// sayi>0 ? System.out.println("sayi pozitif") : System.out.println("sayi*sayi");
		// ternary de direk sonuc veya sonuc dondurecek bir islem yapabiliriz
		
		System.out.println(sayi>0 ? "sayi pozitif" : sayi*sayi);
		
		scan.close();
	}

}
