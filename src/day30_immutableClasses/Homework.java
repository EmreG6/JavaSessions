package day30_immutableClasses;

public class Homework {

	public static void main(String[] args) {
		// What is the result of the following code? (Choose all that apply)
		
		String a="";
		a+=2;
		a+='c';
		a+=false;
		if ( a=="2cfalse") System.out.println("==");
		if ( a.equals("2cfalse")) System.out.println("equals"); 
		
		// A. Compile error on line 9
		// B. Compile error on line 10
		// C. Compile error on line 11
		// D. Compile error on another line
		// E. ==
		// F. equals
		// G. An exeption is thrown
		
		
	}

}
