package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");
		int sayi = scan.nextInt();

		int rakamlarToplami = 0;
		int rakam = 0;

		// for loop ile yapalim

		rakamlarToplami = 0;
		String sayiStr = "" + sayi; // !!!!
		// int olarak verilen bir sayinin basamak sayisinin bulmak istersek
		// kisa yoldan o sayiyi String'e cevirip, str.length()method'unu kullanabiliriz.

		for (int i = 0; i < sayiStr.length(); i++) {
			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;

		}

		System.out.println("girdigininiz sayinin rakamlar toplami :" + rakamlarToplami);

		scan.close();
	}
}
