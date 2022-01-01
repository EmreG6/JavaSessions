package day33_stringBuilder;

public class C03_Equals {

	@SuppressWarnings("unused")
	public static void main(String[] args) {


		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); // false
		// sb'da equals method'u String'deki mantýkla calismaz, == mantigi ile calisir
		
		System.out.println(sb1.compareTo(sb2)); // 0
		// ilk harflerden baslayarak bire bire sb'lari karsilastirir
		// eger tum karakterler ayni ise sonuc olarak 0 doner
		// farkli karakter bulursa ilk yazilan sb, ikinci yazilan kac char onde onu doner
		
		// eger iki sb'nin esit olup olmadigini anlamak istesek 
		// if (sb1.compareTo(sb2)==0) ile bakabiliriz
		
		String str="Java";
		// System.out.println(sb1==str); // sb ile String'ikarsilastiramaz
		// System.out.println(sb1.equals(str)); //false
		
		// System.out.println(sb1.equals(str));	//false
		// System.out.println(sb1.compareTo(str)); // comapre string icin kullanilamaz
		
		// System.out.println(sb1=="Java");
		// System.out.println(sb1.compareTo("Java"));
		
		
		
		

	}

}
