import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno:");
		String nome1 = scanner.nextLine();
		
		System.out.println("Digite a 1ª nota:");
		int nota1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite a 2ª nota:");
		int nota2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite a 3ª nota:");
		int nota3 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite a 4ª nota:");
		int nota4 = scanner.nextInt();
		scanner.nextLine();

		int total = nota1 + nota2 + nota3 + nota4;
		
		if (total > 59) {
			System.out.println("Aprovado");
			
		} else if (total > 39) {
			System.out.println("Recuperação");
			
		} else {
			System.out.println("Reprovado");
		}
	}
	
}
