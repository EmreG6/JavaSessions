package day03_IncrementDecrement;

public class C03_AutoWidening {

	public static void main(String[] args) {
		
		byte sayi1=44;
		
		short sayi2= sayi1;
		// e�itli�in sol taraf� short, sa� taraf� byte
		// iki data t�r� farkl� oldu�u halde java itiraz etmiyor
		// ��nk� atama yap�lan variable'�n data t�r� (short)
		// atanan de�erin veri t�r�nden daha b�y�k oldu�undan sorun olmaz
		
		System.out.println("sayi2 : " + sayi2);

		int sayi3=55;
		double sayi4=sayi3;
		
		System.out.println("sayi4 : " + sayi4);
		
		//auto widening - k���k b�y��e her zaman s��ar.
		//Java csating'i otomatik yapar.
		
	}

}
