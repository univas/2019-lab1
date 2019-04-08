import java.util.Scanner;

public class NotaAlunos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Digite seu nome:");
			String nome = scanner.nextLine();
			int soma = 0;
			
			for (int j = 0; j < 4; j = j + 1) {
				System.out.println("Digite sua nota: ");
				int a = scanner.nextInt();
				scanner.nextLine();
				soma = soma + a;
			}

			System.out.println("A soma das suas notas é: " + soma);
		}
		
		int i = 0;
		
		while (i < 10) {
			i = i + 1;
			System.out.println("Digite seu nome:");
			String nome = scanner.nextLine();
			int soma = 0;
			int j = 0;
			
			while (j < 4) {
				System.out.println("Digite sua nota: ");
				int a = scanner.nextInt();
				scanner.nextLine();
				j = j + 1;
				soma = soma + a;
			}
			
			System.out.println("A soma das suas notas é: " + soma);	
		}
		
		do {
			i = i + 1;
			System.out.println("Digite seu nome:");
			String nome = scanner.nextLine();

			int soma = 0;
			int j = 0;
			
			do {
				System.out.println("Digite sua nota: ");
				int a = scanner.nextInt();
				scanner.nextLine();
				j = j + 1;
				soma = soma + a;
			} while (j < 4);
			
			System.out.println("A soma das suas notas é: " + soma);
		} while (i < 10);
	}

}
