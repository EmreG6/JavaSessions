package day32_Varargs_StringBuilders;

public class C03_Varargs {

	public static void main(String[] args) {
		KafanaGoretopla(5, 10, 13, 0);

	}

	private static void KafanaGoretopla(int sayi1, int... sayilar) {
		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;

		}
		System.out.println("ilk sayi ile diðerlerinin toplaminin carpimi :" + sayi1 * toplam);
	}

}
