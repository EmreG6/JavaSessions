package day14_MethodCreations;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// verilen iki sayinin toplamini ve carpimini yapip yazdiran iki ayri method olusturun
		
		// method olusturmak icin 3 adým takip edin
		// 1.adim method call
		// 2.adim method'a arguman yazacak miyiz karar vermeliyiz
		
		int sayi1=4;
		int sayi2=5;
		
		carpma(sayi1,sayi2);
		toplama(sayi1,sayi2); //method call
		// 3.adým 1. ve 2. adimi yaptiktan sonra java'dan yardim alýp method'u olustururuz
	
		
		carpma(sayi1,sayi2); // main method'daki sýralamaya göre yazdirir
		
	
	}
	
	
	

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi : " + (sayi1*sayi2));
		
	}




	public static void toplama(int sayi1, int sayi2) {
		// 4.adim erisim düzenleyici ve return type'a karar vermeliyiz
		// erisim duzenleyici access modifier : public yaptýk
		// return type :bizdens adeceyazdirma istedigi icin void kalabilir
		
		System.out.println("sayilarin toplami : " + (sayi1 +sayi2));
		
	}

}
