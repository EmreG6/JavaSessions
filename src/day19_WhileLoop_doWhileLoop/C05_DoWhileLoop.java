package day19_WhileLoop_doWhileLoop;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		// Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.
		
		
		//For Loop ile 
		for (char i = 'm'; i > 'c'; i--) {
		System.out.print(i + " ");
			
		}
		System.out.println();
		
		//while loop ile
		char krk='m';
		
		while (krk>'c') {
			System.out.print(krk +" ");
			krk--;
			
		}

		System.out.println();
		
		
		//dowhile loop ile
		char harf='m';
		
		do {
			System.out.print(harf + " ");
			harf--;
			
		} while (harf>'c');
		
	}

}
