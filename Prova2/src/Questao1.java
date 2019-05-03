
public class Questao1 {

	public static void main(String[] args) {
		int counter = 17;
		
		while (true) {
			
			if (counter % 11 == 0 &&
				counter % 13 == 0 &&
				counter % 17 == 0) {
				break;
			}
			
			counter++;
		}
		
		System.out.println(counter);
	}
	
}
