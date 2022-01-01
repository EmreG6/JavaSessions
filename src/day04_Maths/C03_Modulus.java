package day04_Maths;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		//kullanýcýdan 3 basamaklý bir sayý alýp
		//rakamlar toplamýný yazdýran
		//bir program yazýnýz
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen 3 basamaklý bir sayý giriniz.");
		int sayi=scan.nextInt();
		
		int rakamlarToplamý=0; //sayi 573 olsun
		int rakam=sayi%10;
		rakamlarToplamý+=rakam; // rakamlar toplamý 3 oldu
		sayi/=10;// sayýmýz hala 573 - 3ten kurtulmak istiyorum
		
		//sayýmýz artýk 57;
		//7yi nasýl alýrým?
		rakam=sayi%10;
		rakamlarToplamý+=rakam;
		
		//sayi hala 57
		//7den de kurtulalým
		
		sayi/=10;
		
		rakamlarToplamý+=sayi;
		System.out.println("Girdiðiniz sayýnýn rakamlar toplamý : " + rakamlarToplamý);
		
		scan.close();
	}

}
