package day10_TernarySwitchCase;

import java.util.Locale;

public class C15_UpperCaseLowerCase {

	public static void main(String[] args) {
		// verilen String'in tamamýný buyuk veya kucuk harfe cevirir
		
		String isim="aLI"; // bunu A buyuk Ali olarak yazdýralým
		System.out.println(""+isim.toUpperCase().charAt(0)+
							  isim.toLowerCase().charAt(1)+ isim.toLowerCase().charAt(2));
		
		//turkce lokal harfler kullanarak tamamini kucuk harfe cevirelim
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		
		

	}

}
