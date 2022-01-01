package day02_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		// kullanýcýdan deðer almak için 3 adýmtakip edilir.
		// 1.adým Scanner ýbjesi oluþturmak
		
		Scanner scan=new Scanner(System.in);
		
		//2.adým kullanýcýya ne istediðimiz söylemek;
		System.out.println("lütfen isminizi yaznýz");
		
		String isim=scan.next();
		
		System.out.println("isminiz..:"+isim);
		
		//scan bir scanner objesidir
		//isim olarak farklý bir isim yazsak da çalýþýr ama biz scan demeyi tercih ederiz
		//scan. dediðimizde kullanacðýmýz metolarý görebiliriz.
		
		
		
		scan.close();
		

	}

}
