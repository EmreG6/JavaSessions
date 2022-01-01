package day21_Scope_Arrays;

public class C01_LocalVariables {

	String okulIsmi;

	public static void main(String[] args) {
		// Java local variable'lara default deger atamasi yapmaz
		// Kodlarimizda sorun yasamamak icin
		// olusturdugumuz local variable'lara uygun bir deger atamamizda fayda var

		int sayi = 0; // int sayi; dersekjava CTE veriyor
		System.out.println(sayi);

		// int sayi; // bir local'de ayni isimde birden fazla variable OLUSTURULAMAZ
		// String sayi; // data turu farkli olsa da Java buna izin vermez
		@SuppressWarnings("unused") // kullanilmayan degiskenin farkindayým!
		String isim = "Ali";

	}

	public static void staticMethod() {
		// sayi; //farkli localde olusturulan variable (methodlarin static olup olmasina
		// bagli olmaksizin) farkli local'de olusturulamaz
		@SuppressWarnings("unused") // kullanilmayan degiskenin farkindayým!
		String isim = "Veli";

	}
}
