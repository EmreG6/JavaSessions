package day16_ForLoop;

public class C02_ForLoop {

	public static void main(String[] args) {
		/* For Loop 	: Belirli bir kosul saglandigi surece tekrarlanmasi gereken isler icin kullanilan 
		 * 				  kod bloklarina LOOP(Dongu) denir. Tekrar sayisi belirli olan durumlarda for loop kullanilmasi
		 * 				  tercih edilir.
		 */

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");	
		}
		
		/* For Loop  :baslangic ve bitis sarti bir sayinin degerine bagli olan durumlarda tercih edilir.
		 * 
		 */
		
		/*		for (int i = 0; i < 10; i--) {  !!! asla calistirma :D
		 *		System.out.println(i + " ");
		 *		
		 */
		
		/*	1-Eger baslangýc sayisi artis/azalis ile bitis degerine yaklasmiyor\ uzaklasiyor ise
		 * 	  loop hic bir zaman durmaz. -sonsuz loop-
		 * 	  Bu duruma sonsuz loop deriz ve bu durumun gerceklesmesini istemeyiz.
		 */
		
		//	for (int i = 0; i >10; i++) {
		// 	System.out.println(i + "acaba calisir mi?"); 
		//  		}
		//  aciklama : broken loop
		//			   eger ilk deger icin bitis sarti true olmazsa 
		//			   daha ilk adimda look broken olur
		// 			   dolayisiyla loop body hic calismadan, loop'un sonrasina gecilir
		//			   loop CALISIR, ama hic bir islem yapmaz.

		/*	2- eger Ending Condition hep true verirse sonsuz donguye girer
		 * 	   eger loop'ta Ending Condition hic true olmazsa loop body hixc devreye girmez
		 * 	   loop'da artis degeri pozitif oldugu gibi negatif de olabilir (i -- vb) 
		 */

	}

}
