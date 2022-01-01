package day10_TernarySwitchCase;

public class C06_Ternary {

	public static void main(String[] args) {
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emeklý olabýlýr
		// calýsan erkekse 65 yasýndan buyukse emekli olabilir
		
		// kodun test edilmesi.....
		// her seferinde scanner data olusturmak yerine
		// test datalarimiz varable olarak da olusturabiliriz
		// ve kod yazimi bittiginde bu test datalarýný degistirerek
		// kodlarimizi test edebiliriz
		
		
		char cinsiyet='E';
		int yas=71;
		
		
		String sonuc = cinsiyet=='K' ? (yas>60 ? "emekli olabilirsin" : "emekli olamazsin")   :
									   (yas >65 ? "emekli olabilirsin" : "emekli olamazsin")  ;
		
		System.out.println(sonuc);

		

	}

}
