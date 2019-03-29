
public class Questao3 {

	public static void main(String[] args) {
		int a = 148;
		int b = 256;
		int c = a + b;
		
		// numero par
		if (c % 2 == 0) {
			
			if (c > 1 && c < 11) {
				System.out.println("D");
			} else if (c > 11 && c <= 24) {
				System.out.println("E");
			} else {
				System.out.println("F");
			}
			
		} else { //numero ímpar
			if (c >= 1 && c < 12) {
				System.out.println("A");
			} else if (c >= 12 && c <= 24) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		}
	}
	
}
