package day02_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		// kullan�c�dan de�er almak i�in 3 ad�mtakip edilir.
		// 1.ad�m Scanner �bjesi olu�turmak
		
		Scanner scan=new Scanner(System.in);
		
		//2.ad�m kullan�c�ya ne istedi�imiz s�ylemek;
		System.out.println("l�tfen isminizi yazn�z");
		
		String isim=scan.next();
		
		System.out.println("isminiz..:"+isim);
		
		//scan bir scanner objesidir
		//isim olarak farkl� bir isim yazsak da �al���r ama biz scan demeyi tercih ederiz
		//scan. dedi�imizde kullanac��m�z metolar� g�rebiliriz.
		
		
		
		scan.close();
		

	}

}
