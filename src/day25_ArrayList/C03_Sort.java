package day25_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {
		List<String> isimler = new ArrayList<>();
		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");

		System.out.println(isimler); // [Kutlu, Emrah, Ferhat]

		Collections.sort(isimler);
		System.out.println(isimler); // [Emrah, Ferhat, Kutlu] natural order

		isimler.add("Filiz");

		System.out.println(isimler); // [Emrah, Ferhat, Kutlu, Filiz]
		Collections.sort(isimler);
		System.out.println(isimler); // [Emrah, Ferhat, Filiz, Kutlu]

	}

}
