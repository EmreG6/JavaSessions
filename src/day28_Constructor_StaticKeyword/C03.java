package day28_Constructor_StaticKeyword;

public class C03 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Java Run Time bir programdir.
		// run tusuna bastigimizda java calismaya baslar ve islemleri yapar
		// javanin isi bittiginde (calisma tusu kirmizidan griye dondugunde)
		// hersey basa doner
		
		// static variable ve method'larbulunduklari class ile ilintilidir. (obje degil class ile)
		// dolaysisiyla baska bir class'ta iken C02'deki static variable veyamethod'aulasmak istedigimizde
		// C02.staticVariableIsmi ve C02.staticMethodIsmi() yazmamiz yeterli olur
		
				C02 obje1= new C02();
				System.out.println("obje icin x :" + obje1.x + " obje icin y :" + obje1.y);
				
				obje1.x++;
				obje1.y++;
		
		// static bir variable'a class ismi uzerinden ulasmak yerine 
		// instance variable'lar gibi obje ile ulasmaya calisirsaniz
		// Java CTE vermez ama solda ! isareti ile bizi uyaririr
		// "static bir field olan C02.y'ye static yoldan ulas" der
				
				System.out.println("islemden sonra obje icin x :" + obje1.x + " obje icin y :" + obje1.y);
				
				C02 obje2 =new C02();
				System.out.println("obje icin x :" + obje2.x + " obje icin y :" + obje2.y);
				
				obje2.x++;
				obje2.y++;
				
				System.out.println("islemden sonra obje2 icin x :" + obje2.x + " obje icin y :" + obje2.y);
				
				System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in "
									+ "x : " + obje1.x + " y : " + obje1.y);
				
				C02 obje3 = new C02();
				
				obje3.x=20;
				obje3.y=40;
				
				System.out.println("islemden sonra obje3 icin x :" + obje1.x ); // 6
				System.out.println("islemden sonra obje3 icin x :" + obje2.x ); // 6
				System.out.println("islemden sonra obje3 icin x :" + obje3.x ); // 20
				
				System.out.println("islemden sonra obje3 icin y :" + obje1.y ); // 40
				System.out.println("islemden sonra obje3 icin y :" + obje2.y ); // 40
				System.out.println("islemden sonra obje3 icin y :" + obje3.y ); // 40
				
				

	}

}
