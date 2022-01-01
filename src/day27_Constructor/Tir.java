package day27_Constructor;

public class Tir {

	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;

	public Tir(int i, String string, String string2, int j, boolean b) {
		// int km, String model, String renk, int yil, boolean satilikMi

		// Tir Runner class'indan yolladigimiz degerlerin instance variable'lar ile
		// eslesmesi icin
		// atamalari yapmam lazim

		km = i;
		model = string;
		renk = string2;
		yil = j;
		satilikMi = b;

	}

	public Tir(int km, String model, String renk) {
		// i,string ve string2 isim olarak guzel isimler degil
		// kodumuzu sonradan incelerken anlasilir degil
		// daha anlasilir olmasi icin variable isimlerini anlamli yapalim
		// int km, String model, String renk, int yil, boolean satilikMi

		this.km = km;
		this.model = model;
		this.renk = renk;

		// basina this. yazdigimizda Java bu variable'larin class level'daki oldugunu
		// anlar
	}
}
