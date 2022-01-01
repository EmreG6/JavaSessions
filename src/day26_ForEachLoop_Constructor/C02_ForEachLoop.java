package day26_ForEachLoop_Constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		/* Soru 1:	Bir integer array olusturunuz 
					ve bu array’deki tum sayilarin carpimini For each loop kullanarak bulunuz. 
					Sonucu ekrana yazdiriniz.
		*/
		
		
		int arr[]= {3,4,2,5};
		int carpim=1;
		
		for (int each : arr) {
			carpim*=each;
			
		}
		System.out.println("Array'in elemanlari carpimi : " + carpim);
	}

}
