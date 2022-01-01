package day23_MultiDimensionalArrays;

public class C04_MDArrays {

	public static void main(String[] args) {
		// Soru 2 : Asagidaki multi-dimensional array'in
		// ic array'larindaki son elemanlarin carpimini
		// ekrana yazdiran bir program yazdiriniz {{1,2,3}, {4,5},{6}}

		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6 } };

		int sonuc = 1;

		for (int i = 0; i < arr.length; i++) {
			int sonElementIndex = arr[i].length - 1;
			sonuc *= arr[i][sonElementIndex];

		}
		System.out.println(sonuc);

	}

}
