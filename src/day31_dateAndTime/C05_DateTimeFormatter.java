package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		LocalDateTime tarihsaat= LocalDateTime.now();
		System.out.println(tarihsaat);
		//eger tarihi ve zamani kendi istedigimiz sekilde yazdirmak istersek
		// gun-ay-yýl ss:dd seklinde
		
		DateTimeFormatter duzenle= DateTimeFormatter.ofPattern("dd / MM / YYYY EEE  HH:mm");
		System.out.println(duzenle.format(tarihsaat));
		
		/*
		 format olustururken
		 GUN
		 d: basta 0 varsa ýnu yazmdadan gun numarasi
		 dd:tek haneli gunler 01 gibi yazar
		 DDD. yilin kacinci gunu oldugunuy yazar
		 E, EE, EEE: gun isminin tamamini
		 
		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan tek haneli yazar
		 MM: 01 gibi yazar
		 MMM: ay isminin ilk uc harfi
		 MMMM : ay isminin tamamini yazar
		 
		 YY : yilin son iki rakamini
		 YYYY: yilin tamamini
		 
		 Saat: (24 saat uzerinde istiyorsak H, 12 saat uzerinden istiyorsak h yazariz)
		 
		 HH:  saatin tamamini yazar
		 H : saatin tek halini yazar
		 A: yazinca AM PM yazar
		 
		 
		 
		 
		 
		 */
		
		
		
		
		
		
		
		

	}

}
