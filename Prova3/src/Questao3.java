import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 25;
		int[] notas = new int[max];
		int allNotas = 0;
		
		for (int i = 0; i < max; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			notas[i] = scanner.nextInt();
			allNotas = allNotas + notas[i];
		}
		
		float average = allNotas / (float) max;
		int numberOfStudents = 0;
		
		for (int i = 0; i < max; i++) {
			if (notas[i] < average) {
				numberOfStudents++;
			}
		}
		
		System.out.println("Quantidade de alunos abaixo da média: " + numberOfStudents);
	}
}
