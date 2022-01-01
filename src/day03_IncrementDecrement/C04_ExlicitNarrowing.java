package day03_IncrementDecrement;

public class C04_ExlicitNarrowing {

	public static void main(String[] args) {
		// eðer büyük data türündeki bir veriyidaha küçük data türündeki
		// varable'a atmaka istersek java bunu otomatik olarak yapmaz
		
		int sayi1=140;
		
		short sayi2= (short) sayi1;
		// eþitliðin saðý ile solundaki veri türleri farklý olduðundan java mismatchuyarýsý veriyor.
		//hatayý gidermek için büyük data türündeki deðerin önüne manual onayýmýzý gösteren
		//(short) yazýlýr
		
		System.out.println("sayi2 : " + sayi2);
		
		byte sayi3= (byte) sayi2;
		
		System.out.println("sayi3 : " + sayi3);
		
		// Narrowing yapýldýðýnda sayý deðiþebilir veya sayýyý kabedebiliriz.
		
		
	}

}
