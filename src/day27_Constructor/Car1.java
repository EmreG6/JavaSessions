package day27_Constructor;

public class Car1 {


	
		int yil=2000;
		String renk;
		String model;
		int km;
		boolean satilikMi;
		
		public Car1(int km, String model, String renk, String yil, boolean satilikMi) {
			// atama yapacagimiz tum ozellikleri parametre olarak yolladik
		}
		
		// ben 5 ozelligi birden degistiren bir constructor urettigimde 
		// java default constructor'u siler
		// bu durumda daha onceden yazilan ve default constructor'i kullanan tum kodlar coker
		// bu durumda kodlari duzeltmek icin Java'nin sildigi default constructor yerine 
		// parametresiz bir constructor olusturmaliyim	
		
		public Car1() {
			
		}
		
		public Car1(int i) { // bu satirdaki int km ile class level'daki int km farkli scope'lardadir
			km=i;
			
		}
		public Car1(int i, int j) {
			//        yil     km
			yil=i;
			km=j;
			
		}

		public void hiz(int hiz) {
			System.out.println("araba saatte " + hiz + " km yapar");
		}
		public void yakit(String yakit) {
			System.out.println("araba yakit olarak " + yakit + " kullanir");
		}
		
		
		
		
	

}
