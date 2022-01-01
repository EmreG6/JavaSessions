package day16_ForLoop;

public class C04_ForLoop {

	public static void main(String[] args) {
		// Soru 2 ) 10 ile 30 arasindaki sayilari aralarinda virgule olarak ayni satirda yazdirin
		
		for (int i = 10; i <= 30; i++) {
			if (i==30) {
				System.out.print(i );	
			} else {
				System.out.print(i + ", ");	
			}
			 
			// println yerine sadece print kullandik
		}
		System.out.println(); // alt satira gecmek icin
		
		for (int i = 10; i <= 29; i++) {
			System.out.print(i + ", ");	
			
		}
		System.out.print(30);	
		
	}

}
