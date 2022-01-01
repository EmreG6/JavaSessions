package day13_StringManupilations;

public class C07_ReplaceAll {

	public static void main(String[] args) {
		/* replaceAl() : replace() methodu ile benzer olarak verilen String'deki istenen karakterleri istenen yeni karakterler ile degistirir.
		 *				 replace() methodunda char kullanılabilir, replaceAll()'da charkullanılamaz
		 *				 replaceAll() methodunda Rergular Expressions kullanılabilir
		 *					\\s : bosluk(space)
		 *					\\S : bosluk dısındaki tum karakterler
		 *					\\w : harfler ve rakamlar (a-z, A-Z, 0-9)
		 *					\\W : harfler ve rakamlar dısındaki tum karakterler
		 *					\\d : rakamlar (0-9)
		 *					\\D : rakamlar disindaki hersey
		*/					
		
		
		
		String str="Java 98ogrenmek c..ok k87olay";
		// replaceAll methodları kullanarak Java ogrenmek cok kolay
		
		str=str.replaceAll("\\d", ""); // kalici olması için atama yaptık
	
		
		str=str.replaceAll("\\s", "x");
		
		str=str.replaceAll("\\W", "");
	
		str=str.replaceAll("x", " ");
		System.out.println(str);
		
		
		
		
	}

}
