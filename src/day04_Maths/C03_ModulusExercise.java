package day04_Maths;

import java.util.Scanner;

public class C03_ModulusExercise {

	public static void main(String[] args) {
		//kullanýcýdan 4 basamaklý bir sayý alýp
		//rakamlar toplamýný yazdýran
		//bir program yazýnýz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 4 basamaklý bir sayý giriniz.");
		int sayi=scan.nextInt();
		
		int rakamlarToplamý=0;
		int rakam=sayi%10;
		rakamlarToplamý+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplamý+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplamý+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplamý+=rakam;
		sayi/=10;
		
		
		System.out.println("Girdiðiniz sayýnýn rakamlar toplamý : " + rakamlarToplamý);
		scan.close();

	}

}
