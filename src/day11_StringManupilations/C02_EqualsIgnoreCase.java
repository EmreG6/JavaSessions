package day11_StringManupilations;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		//equalsIgnoreCase iki Stringi karsilastirirken case sensitive olmadan kiyaslama yapar
		
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4=str1 + " " + str2;
		
		System.out.println(str4);      //Ali Can
		System.out.println(str3==str4); //false
		System.out.println(str3.equals(str4)); //true
		
		System.out.println(str3.equalsIgnoreCase(str4));

	}

}
