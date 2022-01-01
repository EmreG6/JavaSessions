package day13_StringManupilations;

public class C08_ReplaceAll {

	public static void main(String[] args) {
		String cumle= "Java   cok      zevkli";
		
		cumle=cumle.replaceAll("\\s+", " "); // fazla bosluklarý yok etti
		
		System.out.println(cumle); //Java cok zevkli
		
		System.out.println(cumle.replaceAll("[a-z]", ""));
		
		System.out.println(cumle.replaceAll("\\S", "*"));
		
		System.out.println(cumle.replaceAll("\\s", "*"));
		
		
		
	}

}
