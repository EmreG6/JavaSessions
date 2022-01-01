package day04_Maths;

public class C01_MatIslemler {

	public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2); //14
		System.out.println(4*(2+5)/3); //9,3 String olduðu için virgüllü sonuç çýkmaz
		
		//sonucu virgüllü yazdýrmak istersek
		
		double sonuc=4*(2+5)/3; //9,0
		System.out.println(sonuc);
		
		sonuc=(double)(4*(2+5)/3); //9,0
		System.out.println(sonuc);

		sonuc=(double)4*(2+5)/3; //9,3333
		System.out.println(sonuc);
		
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		System.out.println(sayi1/sayi2); //2
		
		System.out.println(sayi1/sayi3); //2,5 
		//sonuç olarak String ile küsüratlý sonuç elde edilemez
		// küsüratlý sonuç için en double kullanmalýyýz
		
		
		
	}

}
