package day03_IncrementDecrement;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
	
		// kullanicidan yaricap isteyip cemberin cevresini
		// ve dairenin alanini hesaplayip yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen cemberin yarýcapýný giriniz");
		
		double yarýcap=scan.nextDouble();
		double cevre=2*3.14*yarýcap;
		double alan= 3.14*yarýcap*yarýcap;
		
		//cemberin cevresi : 25.7
		//dairenin alaný : 26.31
		
		System.out.println("cemberin cevresin : "+ cevre);
		System.out.println("dairenin alaný : "+ alan);
		
		scan.close();
		//

	}

}
