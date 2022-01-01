package day33_stringBuilder;

public class C04_Insert {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java ogrendik");
		// araya cok iyi ekleyelim
		
		sb.insert(4, "'yi cok iyi");
		System.out.println(sb); //Java'yi cok iyi ogrendik
		
		//
		
		sb.insert(7, " cok iyiyim", 0,4 );
		System.out.println(sb);
		
		

	}

}
