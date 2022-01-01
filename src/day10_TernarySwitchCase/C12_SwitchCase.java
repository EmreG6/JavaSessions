package day10_TernarySwitchCase;

public class C12_SwitchCase {

	public static void main(String[] args) {
		// Kullanicidan bir sayi girmesini isteyin
		// Girilen sayi 10 ise “Iki basamakli en kucuk sayi"
		//              100 ise “uc basamakli en kucuk sayi”
		//				1000 ise “dort basamakli en kucuk sayi”
		//              diger durumlarda “Girdigin sayiyi degistir” yazdirin
		
		int sayi=15;
				
		switch (sayi) {
		case 10:
			System.out.println("Iki basamakli en kucuk sayi");
			break;
		case 100:
			System.out.println("uc basamakli en kucuk sayi");
			break;
		case 1000:
			System.out.println("dort basamakli en kucuk sayi");
			break;

		default: 
			System.out.println("Girdiginiz sayiyi degistiriniz");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
