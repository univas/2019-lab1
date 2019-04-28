import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float soma = 0.0f;
		
		while (true) {
			System.out.println("Digite a venda:");
			float x = scanner.nextFloat();
			scanner.nextLine();
			
			if (x == -1) {
				break;
			}
			soma = soma + x;
		}
		
		System.out.println("A soma total das vendas é: " + soma);
	}
}
