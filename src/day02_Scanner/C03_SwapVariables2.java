package day02_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		// 2-verilen sayi1 ve sayi2 variable'lar�n�n de�erleini 
		//	 3. bir variable olmadan de�i�tiren (SWAP) bir program yap�n�z,
		
		int sayi1=15;
		int sayi2=20;
		 // ba�lang��ta sayi1=10 vesayi2=20 
		
		System.out.println("ba�lang��ta sayi1=" + sayi1 + " ve sayi2=" +sayi2);
		
		//���nc� bir variable kullanmayacaksak,  verilen iki say�n�n fark�ndan istifade ediyoruz
		
		// ilk ad�m olarak say�lar�n fark�n� ilk say�ya assigne diyorum
		
		sayi1= sayi1-sayi2;
		
		// ikinci ad�m fark ile sayi2 yi toplay�p; sayi2 ye assign ediyorum
		sayi2=sayi1+sayi2;
		
		//���nc� ad�m olarak sayi1 e sayi2 - fark at�yorum
		
		sayi1= sayi2-sayi1;
		System.out.println("sonu�ta sayi1=" + sayi1 + " ve sayi2=" +sayi2);
		
		
		
		
		
		
		
		
	}

}
