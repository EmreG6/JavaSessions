package day26_ForEachLoop_Constructor;

public class CarRunner {

	public static void main(String[] args) {
		// Car class'indan bir obje olusturalim
		
			Car 		   car1 	   =		  new 	      Car();
		//class ismi	obje ismi	assignment	 keyword	constructor call
		
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil);	//0
		
		// Bir obje olustururken eger obje icin kendi class'inda belirlenen degerleri kullanmak istiyorsam
		// hic bir degeri kendim atamadan obje olusturabilirim
		// bu durumda hic bir parametre kullanilmadigi icin default constructor yeterli olacaktir
		
		// eger obje olusturdugum class'daki degerleri kullanmak yerine kendi degerlerimle bir obje 
		// olusturmak istersem o zaman paramtreli constructor olusturmam gerekir
		
		//Car car2= new Car("Kirmizi", "Corolla");
		

	}

}
