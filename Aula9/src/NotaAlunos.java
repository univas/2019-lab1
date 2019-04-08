import java.util.Scanner;

public class NotaAlunos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Digite seu nome:");
			String nome = scanner.nextLine();

			System.out.println("Digite sua nota: ");
			int a = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Digite sua nota: ");
			int b = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Digite sua nota: ");
			int c = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Digite sua nota: ");
			int d = scanner.nextInt();
			scanner.nextLine();

			int soma = a + b + c + d;
			System.out.println("A soma das suas notas é: " + soma);
		}
	}

}
