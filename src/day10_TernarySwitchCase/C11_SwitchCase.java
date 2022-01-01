package day10_TernarySwitchCase;

public class C11_SwitchCase {

	public static void main(String[] args) {
		// Soru
		// Kullanicidan SDET kisaltmasýndaki harflerden  birini yazmasýný isteyin
		// Kullanici "S" girerse "Software"
		// 			 "D" girerse "Developer"
		// 			 "E" girerse "Engineer"
		// 			 "T" girerse "In Testing"	yazdirin
		
		char harf='X';
		
		switch (harf) {
		case 'S':
			System.out.println("Software");
			break;
		case 'D':
			System.out.println("Developer");
			break;
		case 'E':
			System.out.println("Engineer");
			break;
		case 'T':
			System.out.println("In Testing");
			break;

		default:
			System.out.println("Gecersiz harf girdiniz");
			break;
		}
		
		
		
		

	}

}
