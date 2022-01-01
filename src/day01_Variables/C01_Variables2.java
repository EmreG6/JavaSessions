package day01_Variables;

public class C01_Variables2 {
	public static void main(String[] args) {	
		int sayi1=10;
		int sayi2=20;
		
		String sayi3="10";
		String sayi4="20";
		
		System.out.println(sayi1+sayi2);
		System.out.println(sayi3+sayi4);
		
		String harf1="A";
		char harf2='A';
		
		System.out.println(sayi1+sayi2+harf1);
		System.out.println(sayi1+sayi2+harf2); 
		// farklý data türleri ayný deðeri alabilir.
		// burada önemli olan bu deðiþkeneri deðiþken türüne göre iþlem yapabileceðimdir.
		// char extra özelliði sebebiyle matematiksel iþlemlerde numerik deðer alýr
		
		System.out.println(harf1+sayi1+sayi2); //A1020
		// Stringle baþladýðý için diðer iþlemleri de harf olarak algýladý.
		
		System.out.println(sayi1+harf1+sayi2); //10A20
		System.out.println(harf1+(sayi1+sayi2)); //parantez olduðunda iþlem önceliði oluþur.
		
		
	}

}
