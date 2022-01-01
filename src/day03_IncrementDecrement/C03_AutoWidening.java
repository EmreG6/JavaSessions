package day03_IncrementDecrement;

public class C03_AutoWidening {

	public static void main(String[] args) {
		
		byte sayi1=44;
		
		short sayi2= sayi1;
		// eþitliðin sol tarafý short, sað tarafý byte
		// iki data türü farklý olduðu halde java itiraz etmiyor
		// çünkü atama yapýlan variable'ýn data türü (short)
		// atanan deðerin veri türünden daha büyük olduðundan sorun olmaz
		
		System.out.println("sayi2 : " + sayi2);

		int sayi3=55;
		double sayi4=sayi3;
		
		System.out.println("sayi4 : " + sayi4);
		
		//auto widening - küçük büyüðe her zaman sýðar.
		//Java csating'i otomatik yapar.
		
	}

}
