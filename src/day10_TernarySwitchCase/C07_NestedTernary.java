package day10_TernarySwitchCase;

public class C07_NestedTernary {

	public static void main(String[] args) {
		//Soru2 Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” buyuk harfse
		//		consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin
		
		char krk='A';
		
		String sonuc= (krk>='a' && krk<='z') ? "Kucuk Harf" : (
				
					  (krk>='A' && krk<='Z') ? "Buyuk Harf" : "girilen karakter harf degil"
						  
				);
		
		System.out.println(sonuc);
		
		

	}

}
