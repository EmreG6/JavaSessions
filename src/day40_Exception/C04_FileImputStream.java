package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileImputStream {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException {
		// Java'da bir dosyayaulasmak istedigimizde FileInputStream class'indan yardim aliriz
		//
		
		FileInputStream fis =new FileInputStream ("src\\day40_\\yazi.txt");
		
		// Java bu kodda olasi bir problem ongoruyor
		// ve bu probleme karsi ne yapmasi gerektigini soruyor
		// (yani alti cizilen her od CTE degildir!)
		
		// Bunun icin iki durum soz konusu
		// 1- try catch kullanarak bu problemi HANDLE edip java'nin yoluna devam etmesini saglayabilirz
		// 2- Eger dosya okunamýyorsa kod calismasin istiyorsak, olayin farkinda oldugumuzu
		//    ve sorumlulugun bizde oldugunu Java'ya soylemeliyiz
		
		System.out.println("Gorev Tamamlandi");
		

	}

}
