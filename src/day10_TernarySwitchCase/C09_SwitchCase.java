package day10_TernarySwitchCase;

public class C09_SwitchCase {

	public static void main(String[] args) {
		// gun numaras�na gore hafta ici veya hafta sonu yazd�ral�m
		
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
			System.out.println("Lutfen gecerli bir gun say�s� yaz�n�z");
			break;
		}

		
		
		
		
		
		
		
	
	}

}
