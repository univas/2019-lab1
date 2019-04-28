import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int soma = 0;
		int quantidadePares = 0;
		
		while (true) {
			System.out.println("Digite um número:");
			int x = scanner.nextInt();
			scanner.nextLine();
			
			if (x % 2 == 0) {
				soma = soma + x;
				quantidadePares++;
			}

			if (quantidadePares == 10) {
				break;
			}
		}
		
		System.out.println("A soma total é: " + soma);
	}
}
