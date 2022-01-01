package day30_immutableClasses;

import java.util.ArrayList;

public class Homework2 {

	public static void main(String[] args) {
		// What is the result of the following statements? 
		
		ArrayList<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(5);
		values.set(1,6);
		values.remove(0);
		for (Integer v : values) System.out.println(v);
		
		// A.4
		// B.5
		// C.6
		// D.46
		// E.45
		// F.An exceptionis thrown
		// G.The code does not compile

	}

}
