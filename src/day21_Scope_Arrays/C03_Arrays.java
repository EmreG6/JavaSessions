package day21_Scope_Arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		// Soru 2: Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun 
		//				   ve bu array’i yazdirin.
		
		String arr[] = new String[4];
		arr[0]="Ali";
		arr[1]="Veli";
		arr[2]="Ayse";
		arr[3]="Fatma";
		
		String arr2[]= {"Ali", "Veli", "Ayse", "Fatma"};
		System.out.println(arr[0]);
		
		
		//	Soru 2: Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin.
		
		arr[0]="Can";
		arr[2]="Gul";
		
		System.out.println(arr2[1]);
		//son elementi yazdirin
		System.out.println(arr[arr.length-1]); //Stirng'teki length() idi, burada sadece length
		
		//	System.out.println(arr[arr.length]); 	//yazýlan index sinir diþinda
													//Ocak Disi

	}

}
