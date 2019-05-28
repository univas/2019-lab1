import java.util.Scanner;

public class Questao33 {

	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[50];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número:");
			numeros[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < 30; i++) {
			int count = 0;
			for (int j = 0; j < 30; j++) {
				if (i == j) {
					continue;
				}
				if (numeros[i] == numeros[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(numeros[i]);
			}
		}
	}*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 5;
		int[] numeros = new int[max];
		int[] numerosRepetidos = new int[max];
				
		for (int i = 0; i < max; i++) {
			System.out.println("Digite um número:");
			numeros[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < max - 1; i++) {
			for (int j = i + 1; j < max; j++) {
				if (numeros[i] == numeros[j]) {
					numerosRepetidos[i] = numeros[i];
					numerosRepetidos[j] = numeros[j];
				}
			}
		}
		
		for (int i = 0; i < max; i++) {
			if (numerosRepetidos[i] != 0) {
				System.out.println(numerosRepetidos[i]);
			}
		}
	}
}
