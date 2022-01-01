package day26_ForEachLoop_Constructor;

public class Car {
	
	// Java biz bir class olusturdugumuzda, o class'dan obje uretecegimizi bilir
	// ve her class'a default bir constructor yerlestirir
	// Java'nin class'a koydugu bu default constructor gorulmez
	// ama obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer
	
	// bir constructor olusturmak cok kolaydir
	// method'a benzer ama method'dan farklidir.
	// 1-Constructorismi class ismi ile ayni olmalidir
	// class isimleri buyuk harfle basladigi icin Constructor ismi de buyuk harfle baslar
	// (method'dan 1. farki buudr, method'lar kucuk harfle baslar)
	
	public Car() {
		
	}
	// Javanin her class'ta olusturdugu constructor budur.
	
	public int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	// bugun itibariyle class'larda main method olma mecburiyeti kaldirilmistir
	// ancak bildigimiz gibi main method olmayan bir class direk calistirilamaz
	// main method'uolmayan class'lar baska class'lardan obje olusturularak kullanilmak uzere
	// ihtiyac duyulan variable ve method'lari sakladigimiz bir depo gibidir
	

}
