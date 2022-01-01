package day33_stringBuilder;

public class C01_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.length();	// sb'nin uzunlgunu verir
		System.out.println(sb.length());	//0 sb'nin kullanilan kisminin uzunlugunu verir
		System.out.println(sb.capacity()); //16 sb'nin kapasitesini verir
		
		StringBuilder sb2 = new StringBuilder("Java candir"); // 11 haneli bir yazi
		System.out.println(sb2.length());	//11
		System.out.println(sb2.capacity()); //27 -- 16+11 
		
		StringBuilder sb3 = new StringBuilder(7);  // 7 uzunlugunda bir sb olusutruldu
		sb3.append("Mehlika");
		System.out.println(sb3.length());	//7
		System.out.println(sb3.capacity()); //7
		
		StringBuilder sb4 = new StringBuilder(7);
		System.out.println(sb4.length());	//7
		System.out.println(sb4.capacity()); //7
		
		sb4.append("Nilgun");
		System.out.println(sb4.length());	//6
		System.out.println(sb4.capacity()); //7
		
		sb4.append(" candir");
		System.out.println(sb4.length());	//13 nilgun +_candir 
		System.out.println(sb4.capacity()); //16 kapasite zaten 16
		
		sb.append("Java");
		System.out.println(sb); //
		
		sb.append(" candir");
		System.out.println(sb);
		
		sb.append("anlasildi mi", 3, 6); //3.karakterile 63karakter arasini ekliyor
		System.out.println(sb);
		
		
		
		
		
		
		
				
		
		
		
	}

}
