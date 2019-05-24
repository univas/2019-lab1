import java.util.Scanner;

public class Questao32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] notas = new int[30];
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < 30; i++) {
			int x = scanner.nextInt();
			if (i == 0) {
				maior = x;
				menor = x;
			} else if (x < menor) {
				menor = x;
			} else if (x > maior) {
				maior = x;
			}
			
			notas[i] = x;
		}
		
		float count = 0;
		float soma = 0;
		for (int i = 0; i < 30; i++) {
			if (notas[i] == menor || notas[i] == maior) {
				continue;
			}
			soma = soma + notas[i];
			count++;
		}
		
		float resultado = soma / count;
		System.out.println("A média geral foi: " + resultado);
	}
	
}
