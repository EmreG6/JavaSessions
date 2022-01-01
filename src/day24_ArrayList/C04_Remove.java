package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {

		List<String> harfler = new ArrayList<>();

		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");

		System.out.println(harfler); // [A, Z, F, D]
		harfler.remove(1); // bu satir 1 index'indeki elemani remove eder ve onu bize getirir

		// listenin kalanini görmek isterseniz listeyi tekrar yazdirabilirsiniz
		System.out.println(harfler); // [A, F, D]

		System.out.println(harfler.remove(2)); // gitti D yi yok etti ve yazdirdi

		harfler.remove("F"); // gidip F'yi kaldirir ve yaptim demek icin true dondurur

		System.out.println(harfler.remove("B")); // listede B olmadigi icin remove yapamaz ve false dondurur

		System.out.println(harfler); // [A]
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		System.out.println(harfler); // [A, A, Z, F]
		System.out.println(harfler.remove("A")); // true

		System.out.println(harfler); // [A, Z, F]
		harfler.add("A");

		System.out.println(harfler); // [A, Z, F, A]

		harfler.removeAll(harfler); // verilen listeyi siler

		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");

		List<String> silinecekHarfler = new ArrayList<>();
		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");

		System.out.println(harfler); // [A, Z, F, D]
		System.out.println(silinecekHarfler); // [A, C, F]
		
		System.out.println(harfler.removeAll(silinecekHarfler)); //true
		System.out.println(harfler); // [Z, D]
		System.out.println(silinecekHarfler); // [A, C, F]
		
		//eger listemiz integer'lardan olusuyorsa
		//Java remove(index) ve remove (object) method'lari karismasin diye 
		//girilen sayiyi index olarak kabul eder

	}

}
