package day04_Maths;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		//kullan�c�dan 3 basamakl� bir say� al�p
		//rakamlar toplam�n� yazd�ran
		//bir program yaz�n�z
		
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen 3 basamakl� bir say� giriniz.");
		int sayi=scan.nextInt();
		
		int rakamlarToplam�=0; //sayi 573 olsun
		int rakam=sayi%10;
		rakamlarToplam�+=rakam; // rakamlar toplam� 3 oldu
		sayi/=10;// say�m�z hala 573 - 3ten kurtulmak istiyorum
		
		//say�m�z art�k 57;
		//7yi nas�l al�r�m?
		rakam=sayi%10;
		rakamlarToplam�+=rakam;
		
		//sayi hala 57
		//7den de kurtulal�m
		
		sayi/=10;
		
		rakamlarToplam�+=sayi;
		System.out.println("Girdi�iniz say�n�n rakamlar toplam� : " + rakamlarToplam�);
		
		scan.close();
	}

}
