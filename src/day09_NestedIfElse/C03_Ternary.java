package day09_NestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {
		
		int x=10;
		
		String tekMiCiftMi= x%2==0 ? "cift sayi" : "tek sayi";
		
		System.out.println(tekMiCiftMi);
		
		System.out.println(x%2==0 ? "cift sayi" : "tek sayi");
		
		//ternary iki t�rl� kullan�labilir
		//ya d�nen sonuca g�re bir varable olu�turup assign ederiz
		//veya direk syso i�ine direk yazar�z
		
		System.out.println(x>5 ? "Aferin" : 4); // Aferin
		
		// String sonuc = x>5 ? "Aferin" :4;
		
	

	}

}
