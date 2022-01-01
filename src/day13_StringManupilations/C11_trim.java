package day13_StringManupilations;

public class C11_trim {

	public static void main(String[] args) {
		/* trim()			: istedigimiz String'in basinda veya sonunda var olan bosluk/"space"leri temizler
		 *
		 * 
		 */
		
		String str="  Java ogrenmek cok guzel.  ";
		
		System.out.println(str);					//   Java ogrenmek cok guzel.  
		System.out.println(str.length()); 			//28
		System.out.println(str.trim());				//Java ogrenmek cok guzel. - bosluklar kaldýrýldý
		System.out.println(str.trim().length());	//24
		
		

	}

}
