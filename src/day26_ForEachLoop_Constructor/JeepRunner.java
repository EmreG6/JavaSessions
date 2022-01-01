package day26_ForEachLoop_Constructor;

public class JeepRunner {

	public static void main(String[] args) {
		// Jeep class'indan bir obje olusturalim ve ozelliklerini yazdiralim
		
	
		Jeep jeep1= new Jeep();
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka 
				+" " +jeep1.model + " " + jeep1.yil	);
		
		// jeep class'Ýndaki variable'lar instance variable'lar olduklarindan 
		// atadigim degerler  sadece benimobjem icin degerleri degistirir
		// jeep class'indaki degerlere hic bir sey yapmaz
		
		jeep1.fiyat=15000;
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model="Corolla";
		jeep1.yil=2005;
		
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka 
				+" " +jeep1.model + " " + jeep1.yil	);
		
		jeep1.hiz(150); //araba saatte 150 km yapar
		jeep1.yakit("benzin"); //araba yakit olarak benzin kullanir
	}

}
