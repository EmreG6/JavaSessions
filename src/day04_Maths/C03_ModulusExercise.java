package day04_Maths;

import java.util.Scanner;

public class C03_ModulusExercise {

	public static void main(String[] args) {
		//kullan�c�dan 4 basamakl� bir say� al�p
		//rakamlar toplam�n� yazd�ran
		//bir program yaz�n�z
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen 4 basamakl� bir say� giriniz.");
		int sayi=scan.nextInt();
		
		int rakamlarToplam�=0;
		int rakam=sayi%10;
		rakamlarToplam�+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplam�+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplam�+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplam�+=rakam;
		sayi/=10;
		
		
		System.out.println("Girdi�iniz say�n�n rakamlar toplam� : " + rakamlarToplam�);
		scan.close();

	}

}
