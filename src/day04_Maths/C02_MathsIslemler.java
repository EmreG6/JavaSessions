package day04_Maths;

class C02_MathsIslemler {

	public static void main(String[] args) {
		int sayi1=10;
		int sayi2=20;
		
		String str1="Ali";
		//String str2="Can"; //sar� uyar� de�er atad�n ancak kullanmad�n diyor - gereksiz i�lem
		
		System.out.println(sayi1+sayi2+str1); // 30Ali
		System.out.println(str1+sayi1+sayi2); // Ali1020
		System.out.println(str1+(sayi1+sayi2)); // Ali30
		System.out.println(sayi1*sayi2+str1); // 200Ali
		

	}

}
