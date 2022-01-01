package day41_ErrorsGarbageCollector;

public class C02 {

	public static void main(String[] args) {
		System.out.println(C01_Final.pi);
		
		// C01_Final.pi=4.13; pi sayisini static olarak tanimladik ki her yerden rahatlikla ulasilabilsin
		//					  final yaptik ki degistirilemesin
		
		
		System.out.println(C01_Final.pi);
	}
}
