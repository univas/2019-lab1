import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sumMaria = 0;
		int sumJoao = 0;
		int sumJose = 0;
		
		for (int i = 0; i < 50; i = i + 1) {
			System.out.println("Digite seu voto:");
			int vote = scanner.nextInt();
			scanner.nextLine();
			if (vote == 1) {
				sumMaria = sumMaria + 1;
			} else if (vote == 2) {
				sumJoao = sumJoao + 1;
			} else {
				sumJose = sumJose + 1;
			}
		}
		
		if (sumMaria > sumJoao && sumMaria > sumJose) {
			System.out.println("A nova representante da turma é Maria");

		} else if (sumJoao > sumMaria && sumJoao > sumJose) {
			System.out.println("O novo representante da turma é João");
			
		} else {
			System.out.println("O novo representante da turma é José");
		}
	}
	
}
