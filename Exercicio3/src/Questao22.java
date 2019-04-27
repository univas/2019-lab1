import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int vitoriaA = 0;
		int vitoriaB = 0;
		int empates = 0;

		for (int i = 0; i < 135; i++) {
			System.out.println("Gols Argentina:");
			int golA = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Gols Brasil:");
			int golB = scanner.nextInt();
			scanner.nextLine();

			if (golA > golB) {
				vitoriaA++; // vitoriaA = vitoriaA + 1;
			} else if (golB > golA) {
				vitoriaB++; // vitoriaB = vitoriaB + 1;
			} else {
				empates++; // empates = empates + 1;
			}
		}
		
		System.out.println("Quantidade vitória Argentina: " + vitoriaA);
		System.out.println("Quantidade vitória Brasil: " + vitoriaB);
		System.out.println("Empates: " + empates);
	}

}
