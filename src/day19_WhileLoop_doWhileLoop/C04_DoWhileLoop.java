package day19_WhileLoop_doWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
		
		
		int i=0;
		while (i<5) {
			System.out.print(i+ " ");
			i++;
			
		}
		System.out.println();

		// while loop once kontrol eder sonra calisir
		// loop icinde artis yapilsa da bir sonraki kontrole kadar kodcalismaya devam eder
		// bu da bazi durumlarda hatali sonuclara ulasýlmasina sebep olabilir
		
		
		// do while loop ise once islemi yapar ve sonra sarti kontrol eder
		// ozeelikle kullanicidan deger almalarda do while loop  tercih edilir
		int a=0;
		do {
			System.out.print(a + " ");
			a++;
			
		} while (a<5);

	}

}
