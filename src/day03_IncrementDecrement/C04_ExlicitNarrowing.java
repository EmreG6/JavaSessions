package day03_IncrementDecrement;

public class C04_ExlicitNarrowing {

	public static void main(String[] args) {
		// e�er b�y�k data t�r�ndeki bir veriyidaha k���k data t�r�ndeki
		// varable'a atmaka istersek java bunu otomatik olarak yapmaz
		
		int sayi1=140;
		
		short sayi2= (short) sayi1;
		// e�itli�in sa�� ile solundaki veri t�rleri farkl� oldu�undan java mismatchuyar�s� veriyor.
		//hatay� gidermek i�in b�y�k data t�r�ndeki de�erin �n�ne manual onay�m�z� g�steren
		//(short) yaz�l�r
		
		System.out.println("sayi2 : " + sayi2);
		
		byte sayi3= (byte) sayi2;
		
		System.out.println("sayi3 : " + sayi3);
		
		// Narrowing yap�ld���nda say� de�i�ebilir veya say�y� kabedebiliriz.
		
		
	}

}
