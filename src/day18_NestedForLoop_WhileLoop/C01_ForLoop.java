package day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		/*	kullanicidan 2 tam sayi isteyin
		 * 	ilk sayidan baslayarak, ikinci sayiya kadar ucer, ucer yazdirin
		 * 	(ikinci sayi dahil olmak zorunda degil)
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen aradaki sayilari ucer ucer yazdirmak icin iki tam sayi giriniz...");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if (sayi1>sayi2) { 	//azalarak gidecek
			for (int i = sayi1; i >=sayi2; i-=3) {
				System.out.print(i + " ");
				
			}
			
			
			
		} else if (sayi1<sayi2) {	//artarak gidecek
			for (int i = sayi1; i <=sayi2; i+=3) {
				System.out.print(i + " ");
			}
			
		} else{
				System.out.println("girilen sayilar esit");
		}
		scan.close();
	}

}
