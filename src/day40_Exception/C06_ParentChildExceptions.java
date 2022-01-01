package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildExceptions {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("src\\day40_\\yazi.txt");
			int k = 0;
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Gorev Tamamlandi");

	}

}
