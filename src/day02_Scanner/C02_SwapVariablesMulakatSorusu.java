package day02_Scanner;

public class C02_SwapVariablesMulakatSorusu {
	public static void main(String[] args) {	
	
	/*
	// verilen sayi1 ve sayi2 variable'lar�n�n de�erlerini de�i�tirin (SWAP) bir program yaz�n�z.
	// �rn: sayi1=1 ve sayi2=20;
	// kod �al��t�ksan sonra sayi1=20 ve sayi2=10 olmal�
	*/
	
	int sayi1=10;
	int sayi2=20;
	 // ba�lang��ta sayi1=10 vesayi2=20 
	
	System.out.println("ba�lang��ta sayi1=" + sayi1 + " ve sayi2=" +sayi2);
	
	// ilk �nce bo� bir variable olu�turula�m;
	
	int bos;
	// say�2'yi bos variable a atayal�m;
	
	bos=sayi2;
	
	//sayi2 kovas�na say� 1 de�erini atayal�m;
	sayi2=sayi1;
	
	//bos variabledaki de�eri sayi1e atayal�m;
	
	sayi1=bos;
	System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
}
}	
