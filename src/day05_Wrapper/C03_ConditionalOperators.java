package day05_Wrapper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {
		
		// System.out.println(5+3==8 || 6+5==10 || 7-2==3); // true
		
		// System.out.println(5+3==8 && 6+5==10 && 7-2==3); // false
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc = a>b || b>c || a+b>c;
		System.out.println(sonuc);
		
		// && yerine, & de kullan�labilir fakat arada nuans var
		// && i�areti ilk false u buldu�unda bu i�lemin sonucunun false olaca��n� bilir
		//    ve geriye kalan i�lemleri kontrol etmeden sonucu false yazd�r�r
		// & i�areti ise �nce t�m i�lemleri bitirir sonra sonucu false olarak yazd�r�r
		
		
		
		
	}

}
