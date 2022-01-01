package day22_Arrays;

public class C01_Tekrar {

	public static void main(String[] args) {
		/*	1- Scope: Bir variable'in class icerisinde ulasilabildigi ve ulasilamadigi alanlara o variable'in scope'u denir.
		 * 	2- Temelde iki tur scope vardir:
		 * 		-Class level olanlar
		 * 
		 * 		 Class level'da olsuturulan variable'lara deger atamak zorunda degiliz.biz deger atamissak, java o degeri
		 * 		 olusturulan tum objeler icin ilk deger olarak kabul eder.(initialize) biz deger atamazsak java data 
		 * 		 turune uygun olarak default degerler atar.
		 * 			
		 * 			*Instant Variables(Object Variables) : 
		 * 			 class icerisindeki static method'lardan (main methodda dahil)
		 * 		 instance variable'lara object olusturarak ulasabiliriz, ve object uzerinden yapilan atamalar sadece o 
		 * 		 objeyi baglar, digerobjeleri etkilemez. (okul orneginde ogretmenin dersi, ogrencinin matematik notu gibi..)
		 * 			 Instance variable'lara static olmayan method'lardan direk ulasabiliriz.
		 * 			
		 * 			*Static Variables (Class Variable) : 
		 * 			 Static Variable'lara class icerisinde her yerden ulasilabilir. (static veya static olmayan tum method'lardan)
		 * 			 static  variable'larin degeri tum objeler ve tum method'lar icin ortaktir.Projemiz calismaya basladiktan
		 * 		 sonra static variable'larda yapilan her degisiklik kalici olur. Bir method 'da static variable'in degerini
		 * 		 degistirirsek, diger method'lar ve objeler icin de static variable 'in degeri degismis olur.
		 * 			 okul ornegini dusunursek okulun adi, adresi gibi herkes icin ortak olan tanimlamalardir.
		 * 
		 *		-Local Olanlar 		
		 *		
		 *		 Local olan scope'lar : Local variable'lar olusturuldugunda deger atamasi olmasa da java cte vermez.
		 *		 Ancak java local variable'lara default deger atamadigi icin, biz emniyette kalmak adina local variable'lara olsuturuldugu 
		 *		 anda kod akisini engellemeyecek bir deger atamayi tercih ederiz.
		 *		 	Local variable'lar static olarak tanimlanamazlar.Static olarak tanimlamak istedigimiz variable'lari class level'da 
		 *		 olusturmak zorundayiz.
		 *			*Local Variables: 
		 *			local variable'lar bir method icinde olup, loop icindeolmayan variable'lardir. ve sadece olusturulduklari 
		 *		 method icerisinde gecerlidirler.
		 *			*Loop Variables: 
		 *			Loop Variable's adindan da anlasilacagi uzere loop'un icersinde olusturulan variable'lardir ve sadece o loop icerisinde
		 *		 gecerlidirler.
		 *			Icerisinde bulunduklari loop'un disindan erisilemezler.
		 *	3- Arrays: Array String disinda ogrendigimiz ikinci non-primitve data turudur. Non-primitive oldugu icinbircok methodu vardir. Ayrica, 
		 *		arrayler ile kullanilmak uzer bir cok faydali method icin kullanabilecegimiz array class'lari mevcuttur.
		 *		-Array olsuturmak icin iki tur yontem vardir
		 *			1-once array'in uzunlugunu ve data turunu declare ederek array olusturur. sonra istedigimiz index'deki degerleri kendimiz atariz.
		 *		deger atamadigimiz index'lere java default degerleri atar.
		 *			2-esitligin sol tarafinda array'i declare eder, saginda ise {icinde} direk degerleri yazariz.
		 *
		 */

	}

}
