package day17_ForLoop;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		// Birden dorde kadar sayilari yan yana aralarinda bir bosluk birakarak yazdirin
		
		
		for (int satir = 1; satir <= 4; satir++) {
			
			for (int i = 1; i <=4; i++) {					//inner for loop
				System.out.print(satir*i + " ");			//inner for loop
			}
				System.out.println("");
			
		}
															//outer for loop
	}

}
