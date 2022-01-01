package day14_MethodCreations;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// verilen iki sayinin toplamini ve carpimini yapip yazdiran iki ayri method olusturun
		
		// method olusturmak icin 3 ad�m takip edin
		// 1.adim method call
		// 2.adim method'a arguman yazacak miyiz karar vermeliyiz
		
		int sayi1=4;
		int sayi2=5;
		
		carpma(sayi1,sayi2);
		toplama(sayi1,sayi2); //method call
		// 3.ad�m 1. ve 2. adimi yaptiktan sonra java'dan yardim al�p method'u olustururuz
	
		
		carpma(sayi1,sayi2); // main method'daki s�ralamaya g�re yazdirir
		
	
	}
	
	
	

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi : " + (sayi1*sayi2));
		
	}




	public static void toplama(int sayi1, int sayi2) {
		// 4.adim erisim d�zenleyici ve return type'a karar vermeliyiz
		// erisim duzenleyici access modifier : public yapt�k
		// return type :bizdens adeceyazdirma istedigi icin void kalabilir
		
		System.out.println("sayilarin toplami : " + (sayi1 +sayi2));
		
	}

}
