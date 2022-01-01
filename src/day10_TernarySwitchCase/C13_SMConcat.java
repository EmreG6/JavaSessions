package day10_TernarySwitchCase;

class C13_SMConcat {

	public static void main(String[] args) {
		// String olarak verilen bir degisken + ile baska bir degiskenle isleme sokulursa
		// Java bunlar� yan yana ekler. Buna Concatenation denir
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim + " " + soyisim);
		// ayni islemi + sembolu yerine concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyisim));
		
		// bo�luk vermek i�in icice concat yap�labilir
		System.out.println(isim.concat(" ").concat(soyisim));

	}

}
