package day02_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		// 2-verilen sayi1 ve sayi2 variable'larýnýn deðerleini 
		//	 3. bir variable olmadan deðiþtiren (SWAP) bir program yapýnýz,
		
		int sayi1=15;
		int sayi2=20;
		 // baþlangýçta sayi1=10 vesayi2=20 
		
		System.out.println("baþlangýçta sayi1=" + sayi1 + " ve sayi2=" +sayi2);
		
		//üçüncü bir variable kullanmayacaksak,  verilen iki sayýnýn farkýndan istifade ediyoruz
		
		// ilk adým olarak sayýlarýn farkýný ilk sayýya assigne diyorum
		
		sayi1= sayi1-sayi2;
		
		// ikinci adým fark ile sayi2 yi toplayýp; sayi2 ye assign ediyorum
		sayi2=sayi1+sayi2;
		
		//üçüncü adým olarak sayi1 e sayi2 - fark atýyorum
		
		sayi1= sayi2-sayi1;
		System.out.println("sonuçta sayi1=" + sayi1 + " ve sayi2=" +sayi2);
		
		
		
		
		
		
		
		
	}

}
