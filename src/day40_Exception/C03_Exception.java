package day40_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// verilen bir int array icin
		// kullanicidan sayi isteyin ve girilen sayiyi index olarak kabul edip
		// o index'deki elementi yazdirin

		int arr[] = { 2, 3, 5, 6, 2, 7, 9, 1 };
		// ArrayIndexOutOfBoundsException
		// InputMismatchException

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("lutfen elementi yazdirmak icin index giriniz");
			int index = scan.nextInt();

			System.out.println("girdiginiz indexdeki element : " + arr[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("girdiginiz index array'de yok");
			
		} catch (InputMismatchException e) {
			System.out.println("girdiginiz index pozitif tam sayi olmali");
		}

	}

}
