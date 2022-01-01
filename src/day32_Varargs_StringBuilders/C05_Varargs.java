package day32_Varargs_StringBuilders;

public class C05_Varargs {

	public static void main(String[] args) {
		topla(5, 8, 10, 0);

		// varargs'tan once farkli paramtereler kullanýlabilir 
		// ama varargs'tan sonra parametre yazilmaz
		// yazarsaniz java varargs son parametre olmalidir diye sizi uyarir 
		// CTE verir
	}

	private static void topla(int... sayilar) {
		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;

		}
		System.out.println("girilen sayilarin toplami :" + toplam);
	}

}
