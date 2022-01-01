package day18_NestedForLoop_WhileLoop;

public class C03_WhileLoop {

	public static void main(String[] args) {
		// 20'den 30'a kadar olans ayilari while loop ile yazdirin (20--30 dahil)
		
		for (int i = 20; i <=30; i++) {
			System.out.print(i + " ");
			
			
		}
			System.out.println();
		
		int sayi=20;
		while (sayi<=30) {
			System.out.print(sayi + " ");
			sayi++;
		}
		
		// for loop ile cozebildigimiz sourlarda while loop kullanmak kodumuzu biraz uzatir.
	}

}
