package day03_IncrementDecrement;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
		// atama i�lemi olursa say�n�n de�eri kal�c� olarak de�i�ir
		// atama i�lemi olmadan yap�lan i�lemler sadece o say�da kal�r
		// say�n�n de�erini kal�c� olarak de�i�tirmez 
		
		
		int sayi1=10;
		System.out.println(sayi1+=5); // 15
		// bu i�lem sayi1 in de�erini 5 art�r�p sayi1 e assign ediyor
		// dolay�s�yla sayi1 in de�eri kal�c� olarak de�i�iyor
		
		System.out.println(sayi1); //15
		
		System.out.println(sayi1+12); //27
		System.out.println(sayi1); //15
		sayi1++;
		// her ne kadar e�ittir i�areti g�r�nmese de sayi1++ i�leminde assign vard�r
		// dolay�s�yla de�er kal�c� olarak de�i�ir
		
		System.out.println(sayi1); //16

	}

}
