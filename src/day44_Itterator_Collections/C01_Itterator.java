package day44_Itterator_Collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Itterator {

	public static void main(String[] args) {
		List <Integer> liste = new ArrayList<>();
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(5);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		
		System.out.println(liste);
		
		// index kullanmadan tum elemnalari 3 eklenmis olarak yazdirin
		
		for (Integer each : liste) {
			System.out.print(each+3 + " ");
		// loop artirilimis degerleri yaxidrirken, eski hal yazdiriliyor
		// for each icersiinde yapilan degisiklikler kalici degil - localdir
		// atama yapilmadi cunku
			
		}
		System.out.println();
		System.out.println(liste);
		
		// foreachloop ile index kullanmadan tum elemntler eulasabiliyoruz ama kalici degisiklik yapamýyoruz
		// kalici degisiklik yapamiyoruz
		
		
		
	}

}
