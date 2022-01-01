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
		
		// && yerine, & de kullanýlabilir fakat arada nuans var
		// && iþareti ilk false u bulduðunda bu iþlemin sonucunun false olacaðýný bilir
		//    ve geriye kalan iþlemleri kontrol etmeden sonucu false yazdýrýr
		// & iþareti ise önce tüm iþlemleri bitirir sonra sonucu false olarak yazdýrýr
		
		
		
		
	}

}
