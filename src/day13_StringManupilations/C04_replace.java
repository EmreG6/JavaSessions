package day13_StringManupilations;

public class C04_replace {

	public static void main(String[] args) {
		// verilen String'deki istenen karakterleri istenen yerni karakterlerile degistirir
		
		String str="Java ogrenmek cok kolay";
		
		System.out.println(str.replace("a", "x"));
		System.out.println(str.replace("Java", "x"));
		System.out.println(str.replace("a", "xxx"));
		System.out.println(str.replace("a", ""));
		System.out.println(str.replace("a", "x"));
		
		

	}

}
