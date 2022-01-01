package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		LocalTime saat = LocalTime.now();
		System.out.println("baslangic saati :" + saat); // 00:24:01.222438300

		int sayi = 10;
		for (int i = 0; i < 10000; i++) {
			sayi++;

		}
		LocalTime saatBitis = LocalTime.now();
		System.out.println("bitis saati :" + saatBitis); // 00:24:01.222438300
		// boylece 2 islem arasindaki zaman farki ortaya cikiyor
		// eger bir islemin baslangic zamani ve bitis zamanini kaydetmek istiyorsak,
		// hem basinda, hem de sonunda LocalTime objesi olusturmaliyiz

		double nano1 = saat.getNano();
		double nanobitis = saatBitis.getNano();

		System.out.println("For Loop : " + (nanobitis - nano1) + " nano saniyede tamamladi");
		
		LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat);

	}

}
