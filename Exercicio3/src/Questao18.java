import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int total = 30;
		
		for (int i = 0; i < total; i = i + 1) {
			System.out.println("Digite um número:");
			int x = scanner.nextInt();
			scanner.nextLine();
			if (x % 2 == 1 && x >= 23 && x <= 99) {
				sum = sum + x;
			}
		}
		
		System.out.println("Soma total: " + sum);
	}
	
}
