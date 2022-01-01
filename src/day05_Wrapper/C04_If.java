package day05_Wrapper;

public class C04_If {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if (a>5) {
			System.out.println("a sayýsý besden büyüktür");	
		}
		
		if (a>b) {
			System.out.println("a sayýsý b den büyük");	
		}
		
		if (b>100) {
			System.out.println("b sayýsý 100den büyük");
		}
		
		// 3 if kodu da çalýþtý fakat en üstteki true olduðu için sadece o print oldu!!
		// basit if cümleleleri baðýmsýz çalýþýr, tüm iflerin body'si çalýþabilir,bazýlarý çalýþabilir.
		// her bir if cümlesi kendi þartýna bakar, þart true ise çalýþýr!!
		// þart false ise çalýþmaz.
		
		
		
	}

}
