import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 20;
		int[] valuesA = new int[max];
		int[] valuesB = new int[max];
		
		for (int i = 0; i < max; i ++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			valuesA[i] = scanner.nextInt();
		}
		
		int half = max / 2;
		for (int i = half; i < max; i++) {
			valuesB[i - half] = valuesA[i];
		}
		
		for (int i = 0; i < half; i++) {
			valuesB[i + half] = valuesA[i];
		}
		
		for (int i = 0; i < max; i ++) {
			System.out.println((i + 1) + "º número: " + valuesB[i]);
		}
	}
}
