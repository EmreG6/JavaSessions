package day13_StringManupilations;

public class C01_Tekrar {

	public static void main(String[] args) {
		/* 1)	str.indexOf(str2) 		: str icinde str2'nin ilk kullandildigi yerin index'ini verir.
		 * 								str2 yerine char da kullanýlabilir.
		 * 								eger str.indexOf(str2,int a) a.index'ten sonra str2 arar
		 * 						  		 -eger bir str2 icin ilk kullanýlan index'i bulduysak ve ikinci bir kullaným var mý diye kontrol etmek istiyorsak
		 * 								str.indexOf(str2, ilk index+1) seklinde kullanabiliriz, boylece java ilk kullaným index'inden sonra ikinci
		 * 								bir ullaným var mý diye kontrol etmis olur.
		 * 
		 * 2)	str1.equals(str2) 		: str1 ve str2'nin iceriginin ayni olup olmadigini kontrol eder,ikisinin icerikleri esit ise true, 
		 * 								esit degilse false doner.
		 * 								== ile equals() nun temel farki, == hem degree hem refereansa bakar dolayisiyla ancak ayni objeyi
		 * 								case sensitive olarak ayni icerige sahiplerse true doner
		 * 
		 * 3)	equalsIgnoreCase()		: kullanildiginda ise case sensitive olmadan iceriklerin ayniolup olmadigina bakar
		 * 
		 * 4) 	str1.lastIndexOf(str2) 	: aramaya sondan baslayarak, basa dogru gelir ve buldugu ilk str2'nin index'ini verir, 
		 * 								diger ozellikleri indexOf'a benzer.
		 * 
		 * 5)	str1.contains(str2) 	: str1'in icinde str2 varsa true, yoksa false doner.char kullanýlamaz.
		 * 
		 * ***indexOf ve lastIndexOf bize int index dondurur, equals() ve contains() ise Boolean dondurur.
		 * 
		 */

	}

}
