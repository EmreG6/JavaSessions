package day28_Constructor_StaticKeyword;

public class C01 {

	int x=3;
	int y=5;
	
	C01(){
		x+=1;
		System.out.println("-x"+x);
	}
	
	C01(int i){
		this();
		this.y=i;
		x+=y;
		System.out.println("-x"+x);	
	}
	
	C01(int i, int i2){
		this(3);
		this.x-=4;
		System.out.println("-x"+x);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		C01 c01=new C01(4,3);
		//Constructor calismaya basladiktan sonra x ve y ile ilgili degismeler
		//(x ve y instance variable oldugundan) sadece c01 objesini ilgilendirir
		//constructor'in isi bittiginde instance degerlerilk halini alir
	}

}
