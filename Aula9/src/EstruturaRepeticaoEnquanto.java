import java.util.Scanner;

public class EstruturaRepeticaoEnquanto {

	public static void main(String[] args) {
		int i = 0;
		
		// utilizado quando preciso executar um loop de repetição sem saber quantas vezes preciso rodar!
//		while (i < 5) {
//			System.out.println("Ola Mundo!!!");
//			i = i + 1;
//		}
//		
//		System.out.println(i);
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			int x = scanner.nextInt();
			if (x == 10) {
				break;
			}
			
			if (x == 5) {
				continue;
			}
			
			System.out.println("Univás");
		}
		
	}
	
}
