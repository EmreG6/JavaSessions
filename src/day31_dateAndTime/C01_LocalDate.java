package day31_dateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {

		LocalDate tarih = LocalDate.now();
		System.out.println(tarih); // 2021-12-12

		System.out.println(tarih.getDayOfYear()); // 346
		System.out.println(tarih.getDayOfMonth()); // 12
		System.out.println(tarih.getDayOfWeek()); // SUNDAY
		System.out.println(tarih.getMonth()); // DECEMBER

		System.out.println(tarih.plusDays(20)); // 2022-01-01
		System.out.println(tarih.plusMonths(5)); // 2022-05-12
		System.out.println(tarih.plusWeeks(15)); // 2022-03-27
		System.out.println(tarih.plusYears(5)); // 2026-12-12

		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10)); // 2032-10-22

		System.out.println(tarih.minusDays(20)); // 2021-11-22
		System.out.println(tarih.minusWeeks(20)); // 2021-07-25
		System.out.println(tarih.minusYears(5)); // 2016-12-12

		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5)); // 2016-07-07

		System.out.println(tarih.minusYears(21).isLeapYear()); // true

		LocalDate dogumTarihi1 = LocalDate.of(30, Month.JANUARY, 30); // true
		LocalDate dogumTarihi2 = LocalDate.of(1990, 01, 30);

		System.out.println(dogumTarihi1 + " , " + dogumTarihi2);
		System.out.println(dogumTarihi1.isAfter(dogumTarihi2)); // false çunku esit

	}

}
