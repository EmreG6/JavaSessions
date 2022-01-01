package day05_Wrapper;

public class C02_Concatenation {

	public static void main(String[] args) {
		String str1="Java";
		String str2="Guzel";
		int sayi1=5;
		int sayi2=4;
		
		//Yukarýdaki variable'larý kullanarak aþaðýdaki metinleri yazdýralým
		//Java Guzel 54
		System.out.println(str1 + " " +str2+ " " + sayi1 + sayi2);
		//Java 5 Guzel
		System.out.println(str1 + " " +sayi1+ " " + str2);
		//Java 94
		System.out.println(str1 + " " + (sayi1+sayi2)+sayi2);
		//Java 19
		System.out.println(str1 + " " + (sayi1-sayi2)+(sayi1+sayi2));
		//54 Guzel
		System.out.println(""+sayi1+sayi2 + " " + str2);
		
		


	}

}
