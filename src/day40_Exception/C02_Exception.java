package day40_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Kullanicidan istedigi kadar sayi alip
		// bu sayilari toplayan bir program yapiniz
		// sayi girisini bitirmekicin q'ya basiniz

		int sayi = 0;
		int toplam = 0;
		int count = 0;

		Scanner scan = new Scanner(System.in);
		// InputMismatchException
		
		try {
			while (count < 10000) {

				System.out.println("Lutfen toplamak icin bir sayi yazýnýz \nBitirmek icin sayi disinda bir tusa basiniz");
				sayi = scan.nextInt();
				toplam += sayi;
				count++;
			}

		} catch (InputMismatchException e) {
			System.out.println("girdiginiz" + count + "adet sayilarin toplami : " + toplam);
		}

	
	

	}

}
