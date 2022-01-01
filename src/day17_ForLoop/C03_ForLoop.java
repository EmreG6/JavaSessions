package day17_ForLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question
		//			Kullanicidan bir String isteyin ve Stringi tersine ceviren bir program (method) yazin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir yazi giriniz...");
		String str = scan.next();
		
		tersineCevir(str);
		System.out.println(tersineCevir(str));
		
		scan.close();
	}

	public static String tersineCevir(String str) {
		String tersStr="";
		
		for (int i = str.length()-1; i >=0; i--) {
			tersStr+=str.substring(i, i+1);
			
		}
		
		
		return tersStr;
		
		
	}

}
