
package day29_StaticBlock_passbyValue;

public class C01_StaticBlock {
			
			
			static {
				System.out.println("static blok main method'dan bile once calisir ");
				
			}

			public static void main(String[] args) {
				System.out.println("Javada once main method calisir");
				
				

			}
			
			static {
				System.out.println("static blok nereye yazilirsa yazilsin main method'dan bile once calisir ");
			}
			
			// eger birden fazla static blok varsa Java yukaridakini daha once calistirir

		}


