package day10_TernarySwitchCase;

class C13_SMConcat {

	public static void main(String[] args) {
		// String olarak verilen bir degisken + ile baska bir degiskenle isleme sokulursa
		// Java bunlarý yan yana ekler. Buna Concatenation denir
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim + " " + soyisim);
		// ayni islemi + sembolu yerine concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyisim));
		
		// boþluk vermek için icice concat yapýlabilir
		System.out.println(isim.concat(" ").concat(soyisim));

	}

}
