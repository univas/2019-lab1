import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = 100;
		String[] alunos = new String[max];
		int[] notas = new int[max];
		int alunoIndex = 0;
		int option = 0;
		
		do {
			
			System.out.println("******MENU******");
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Cadastrar Notas");
			System.out.println("3 - Listar Alunos");
			System.out.println("9 - Sair");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				System.out.println("******************");
				System.out.println("Cadastro de Aluno");
				System.out.println("******************");
				System.out.println("Digite o nome do aluno:");
				String nome = scanner.nextLine();
				alunos[alunoIndex] = nome;
				System.out.println("\n");
				alunoIndex++;
				
			} else if (option == 2) {
				System.out.println("Cadastro de Nota");
				
			} else if (option == 3) {
				System.out.println("******************");
				System.out.println("Lista de Alunos");
				System.out.println("******************");
				System.out.println("Alunos cadastrados:");
				
				for (int i = 0; i < alunoIndex; i++) {
					System.out.println(alunos[i]);
				}
				
			} else if (option != 9) {
				System.out.println("Opção invalida!");
			}
			
		} while (option != 9);
	}
	
}
