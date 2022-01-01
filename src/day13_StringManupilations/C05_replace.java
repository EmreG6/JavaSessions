package day13_StringManupilations;

public class C05_replace {

	public static void main(String[] args) {
		// String olarak verilen 10,000 sayisinin 
		// binden buyuk olup olmadýgýný yazdýrýn
		
		String sonuc="1000";
		
		sonuc=sonuc.replace(".", "");
		
		if (Integer.valueOf(sonuc)>1000) {
			System.out.println("bulunan sonuc 1000'den fazla");
		} else {
			System.out.println("bulunan sonuc 1000'den az");
		}
		
		
	

	}

}
