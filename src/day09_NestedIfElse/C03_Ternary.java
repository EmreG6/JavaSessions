package day09_NestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {
		
		int x=10;
		
		String tekMiCiftMi= x%2==0 ? "cift sayi" : "tek sayi";
		
		System.out.println(tekMiCiftMi);
		
		System.out.println(x%2==0 ? "cift sayi" : "tek sayi");
		
		//ternary iki türlü kullanýlabilir
		//ya dönen sonuca göre bir varable oluþturup assign ederiz
		//veya direk syso içine direk yazarýz
		
		System.out.println(x>5 ? "Aferin" : 4); // Aferin
		
		// String sonuc = x>5 ? "Aferin" :4;
		
	

	}

}
