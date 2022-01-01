package day13_StringManupilations;

public class C07_ReplaceAll {

	public static void main(String[] args) {
		/* replaceAl() : replace() methodu ile benzer olarak verilen String'deki istenen karakterleri istenen yeni karakterler ile degistirir.
		 *				 replace() methodunda char kullanýlabilir, replaceAll()'da charkullanýlamaz
		 *				 replaceAll() methodunda Rergular Expressions kullanýlabilir
		 *					\\s : bosluk(space)
		 *					\\S : bosluk dýsýndaki tum karakterler
		 *					\\w : harfler ve rakamlar (a-z, A-Z, 0-9)
		 *					\\W : harfler ve rakamlar dýsýndaki tum karakterler
		 *					\\d : rakamlar (0-9)
		 *					\\D : rakamlar disindaki hersey
		*/					
		
		
		
		String str="Java 98ogrenmek c..ok k87olay";
		// replaceAll methodlarý kullanarak Java ogrenmek cok kolay
		
		str=str.replaceAll("\\d", ""); // kalici olmasý için atama yaptýk
	
		
		str=str.replaceAll("\\s", "x");
		
		str=str.replaceAll("\\W", "");
	
		str=str.replaceAll("x", " ");
		System.out.println(str);
		
		
		
		
	}

}
