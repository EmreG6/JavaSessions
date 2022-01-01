package day10_TernarySwitchCase;

public class C09_SwitchCase {

	public static void main(String[] args) {
		// gun numarasýna gore hafta ici veya hafta sonu yazdýralým
		
		int gunNo=5;
		
		switch (gunNo) {
		case 1:			
		case 2:			
		case 3:			
		case 4:			
		case 5:
			System.out.println("Hafta ici");
			break;
		case 6:			
		case 7:
			System.out.println("Hafta sonu");
			break;

		default:
			System.out.println("Lutfen gecerli bir gun sayýsý yazýnýz");
			break;
		}

		
		
		
		
		
		
		
	
	}

}
