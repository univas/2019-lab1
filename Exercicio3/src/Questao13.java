import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o 1ª valor:");
		int a = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o 2ª valor:");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o 3ª valor:");
		int c = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o 4ª valor:");
		int d = scanner.nextInt();
		scanner.nextLine();

		int produtoAB = a * b;
		int produtoCD = c * d;
		int resultado = produtoAB - produtoCD;
		
		System.out.println("Resultado: " + resultado);
	}
	
}
