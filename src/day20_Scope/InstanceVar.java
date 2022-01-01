package day20_Scope;

public class InstanceVar {

	int notMat = 50;
	int notFen;
	// instance variable'larin scope'unda main method yoktur.

	public static void main(String[] args) {
		// System.out.println(notMat); // main method staticoldugu icin static olmayan
		// variable'lar
		// main method'da direk kullanilmaz veya goruntulenmez

		// instance variable'lara main method'dan ulasmak istersek object olusturup
		// object uzerinden erisim saglayabiliriz

		// Scanner scan=new Scanner(System.in);
		// icinde oldugumuz class'tan bir object olusturalim

		InstanceVar celil = new InstanceVar();
		System.out.println(celil.notMat); // 50

		InstanceVar nihal = new InstanceVar();

		nihal.notMat = 70;

		System.out.println(nihal.notMat);
		// instance variable'larda deger atamazsak java instance olarak atanan degeri
		// alir
		// bu class icin notMat=50 gibi
		// ama istersek deger de atayabiliriz,
		// bu durumda deger atadigimiz obje icin yeni deger gecerli olur
		
		System.out.println(celil.notMat); //50
		//celilin notunu degistirmek istiyorsak celil.notMat'a deger atamaliyiz
		celil.notMat=90;
		System.out.println(celil.notMat);
		
		celil.method2(); 	//	method2 static olmadigi icin main method'tan cagirilamaz
		
	}

	public static void staticMethod() {
		// System.out.println(notFen); //instance variable'lara static methodlardan direk ulasilamaz

	}

	public void method2() {
		System.out.println("method2'deki notFen : " +notFen); //	bu method static olmadigi icin instance variable'lara direk ulasabilir
		// instance variable olusturulurken deger atanmazsa da olur;
		// bu durumda java default deger atar
		// int icin default deger 0'dir
		notFen=100;
		System.out.println("method2'deki notFen : " +notFen);
	}

}
