import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int total = 30;
		
		for (int i = 0; i < total; i = i + 1) {
			System.out.println("Digite sua nota:");
			int peso = scanner.nextInt();
			scanner.nextLine();
			sum = sum + peso;
		}
		
		float average = sum / total;
		System.out.println("A média geral da turma foi: " + average);
	}
	
}
