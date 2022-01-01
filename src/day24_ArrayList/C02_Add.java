package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		
		List <String> 	isimler=new ArrayList<>();
		System.out.println("Bos Liste : " + isimler);
		
		isimler.add("Ali");
		System.out.println("Bir eleman: " + isimler); 	//[Ali]
		
		isimler.add("Veli");
		System.out.println("Iký eleman: " + isimler);	//[Ali, Veli]
		
		// add methodu listenin sonuna ekleme yapar 
		
		isimler.add("Can");
		System.out.println("Uc eleman: " + isimler); 	//[Ali, Veli, Can]
		
		isimler.add("Ayse");
		System.out.println("1. index'e Ayse ekledik : " + isimler); //1. index'e Ayse ekledik : [Ali, Veli, Can, Ayse]
		
		List <String> liste2=new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("liste 2 : " + liste2);
		
		isimler.addAll(4, liste2);
		System.out.println("sona liste2'yi ekledik : " + isimler);
		
		
		
		
		
		
		

	}

}
