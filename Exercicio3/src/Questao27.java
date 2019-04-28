import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Digite um número:");
			int x = scanner.nextInt();
			scanner.nextLine();
			
			if (x % 3 != 0) {
				continue;
			}
			soma = soma + x;
		}
		
		System.out.println("A soma total é: " + soma);
	}
}
