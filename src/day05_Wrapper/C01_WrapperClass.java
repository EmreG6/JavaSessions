package day05_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		//int sayi1=10;
		//Integer sayi2=20;
		
		//sayi1. yazd���m�zda hi� bi metod ��maz, ��nk� sayi1 int'dir yani primitve dir
		//sayi2. yazd���m�zda ise bir�ok metod geliyor, ��nk� sayi2 Integer'dir. Yani wrapper class'd�r.
		
		String tel1="357897";
		String tel2="3245434";
		
		System.out.println(tel1+tel2); //3578973245434
	
		//bu say�lar� toplamak isterseniz
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		
		System.out.println(Integer.MIN_VALUE); //-2147483648
		System.out.println(Integer.MAX_VALUE); //2147483647
		
		System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
		System.out.println(Short.MAX_VALUE); //32767
		
		String caddeNo="203";
		String sokakNo="1564";
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		
		//Integer.valueOf(String numerik ifade) method'u string olarak kaydedilmi�
		//numerik ifadeleri say�ya �evirir
		//ancak String ifadede numerik olmayan birkarakter olursa
		//Java NumberFormatException hatas� verir ve cal�smay durdurur
		//stops execution
		

	}

}
