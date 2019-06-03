import java.util.Scanner;

public class Questao35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 5;
		int[] numeros = new int[max];
		int count = 0;
		
		for (int i = 0; i < max; i++) {
			int x = scanner.nextInt();
			if (x < 0) {
				numeros[i] = 0;
				count++;
			} else {
				numeros[i] = x;
			}
		}
		
		System.out.println("Números negativos: " + count);
	}
}
