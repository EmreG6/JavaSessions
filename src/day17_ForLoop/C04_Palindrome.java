package day17_ForLoop;

import java.util.Scanner;

public class C04_Palindrome {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question
				//			Kullanicidan bir String isteyin ve Stringi tersine ceviren bir program (method) yazin.
				
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir yazi giriniz...");
		String str = scan.next();
				
		
		if (str.equals(tersineCevir(str))) {
			System.out.println("Girdiginiz String palindrome");
		} else {
			System.out.println("Girdiginiz String palindrome degil");
		}
		
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
