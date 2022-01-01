package day32_Varargs_StringBuilders;

public class C04_Varargs {

	public static void main(String[] args) {
		KafanaGoreIslem(5, 10, 13, 0);

		// Varargs'da hic eleman olmasa da Java itiraz etmez
		// Once int olarak tan�mlanan sayilari eslestirir
		// kalan tum sayilari varargs'a doldurur
	}

	private static void KafanaGoreIslem(int sayi1,int sayi2,int sayi3, int sayi4,  int... sayilar) {
		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;

		}
		System.out.println("ilk sayi ile di�erlerinin toplaminin carpimi :" + sayi1 * toplam);
	}

}
