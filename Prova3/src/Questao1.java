import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 10;
		int[] values = new int[max];
		
		for (int i = 0; i < max; i++) {
			System.out.println("Digite um número:");
			values[i] = scanner.nextInt();
		}
		
		while (true) {
			boolean continueOrder = false;
			
			for (int i = 0; i < max - 1; i++) {
				if (values[i] < values[i + 1]) {
					int temp = values[i];
					values[i] = values[i + 1];
					values[i + 1] = temp;
					continueOrder = true;
				}
			}
			
			if (!continueOrder) {
				break;
			}
		}
		
		for (int i = 0; i < max; i++) {
			System.out.println(values[i]);
		}
	}
}
