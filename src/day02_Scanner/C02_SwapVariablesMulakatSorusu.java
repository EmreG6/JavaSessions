package day02_Scanner;

public class C02_SwapVariablesMulakatSorusu {
	public static void main(String[] args) {	
	
	/*
	// verilen sayi1 ve sayi2 variable'larýnýn deðerlerini deðiþtirin (SWAP) bir program yazýnýz.
	// Örn: sayi1=1 ve sayi2=20;
	// kod çalýþtýksan sonra sayi1=20 ve sayi2=10 olmalý
	*/
	
	int sayi1=10;
	int sayi2=20;
	 // baþlangýçta sayi1=10 vesayi2=20 
	
	System.out.println("baþlangýçta sayi1=" + sayi1 + " ve sayi2=" +sayi2);
	
	// ilk önce boþ bir variable oluþturulaým;
	
	int bos;
	// sayý2'yi bos variable a atayalým;
	
	bos=sayi2;
	
	//sayi2 kovasýna sayý 1 deðerini atayalým;
	sayi2=sayi1;
	
	//bos variabledaki deðeri sayi1e atayalým;
	
	sayi1=bos;
	System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
}
}	
