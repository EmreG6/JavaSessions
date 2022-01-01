package day46_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		
		Deque <String> ciftBasli = new LinkedList<>();
		
		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");
		System.out.println(ciftBasli);	//[Yildiz, Ali] add() Queue'dan geldiginden sona ekler
		
		ciftBasli.addLast("Emine");
		System.out.println(ciftBasli); //[Yildiz, Ali, Emine] -- daha hizli denir -- Deque'den gelen ozellik.
		
		
		System.out.println(ciftBasli.pop()); // Yildiz
		
		ciftBasli.push("Seyfullah");
		System.out.println(ciftBasli); //[Seyfullah, Ali, Emine]
		
		ciftBasli.add(null);
		

	}

}
