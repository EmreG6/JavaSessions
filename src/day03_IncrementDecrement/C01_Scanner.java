package day03_IncrementDecrement;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
	
		// kullanicidan yaricap isteyip cemberin cevresini
		// ve dairenin alanini hesaplayip yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen cemberin yar�cap�n� giriniz");
		
		double yar�cap=scan.nextDouble();
		double cevre=2*3.14*yar�cap;
		double alan= 3.14*yar�cap*yar�cap;
		
		//cemberin cevresi : 25.7
		//dairenin alan� : 26.31
		
		System.out.println("cemberin cevresin : "+ cevre);
		System.out.println("dairenin alan� : "+ alan);
		
		scan.close();
		//

	}

}
