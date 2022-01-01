package day40_Exception;

public class C01_Exception {

	public static void main(String[] args) {
		
		int a=20;
		int b=0;
	

		try {
			
			System.out.println("sayilarin bolumu : " +a/b);
		} catch (ArithmeticException e) {
			System.out.println("Sifira bolum yapilamaz");
			//System.out.println(e.getMessage()); // by zero exception'un kaynagini gosterdi
			e.printStackTrace();
			//java.lang.ArithmeticException: / by zero
			//			at day40_.C01_Exception.main(C01_Exception.java:13)
		}

		System.out.println("gorev tamamlandi");

	}

}
