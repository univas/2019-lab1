import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int menor = 0;
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Digite um número:");
			int x = scanner.nextInt();
			scanner.nextLine();
			
			if (i == 0) {
				menor = x;
			} else if (x < menor) {
				menor = x;
			}
		}
		
		System.out.println("O menor numero foi: " + menor);
			
	}
	
}
