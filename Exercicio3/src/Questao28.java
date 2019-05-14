import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 6;
		int[] numerosSorteados = new int[max];
		int[] apostas = new int[max];
		
		for (int i = 0; i < max; i++) {
			System.out.println("Digite o " + (i + 1) + "º número sorteado:");
			int x = scanner.nextInt();
			if (x < 1 || x > 60) {
				System.out.println("Número incorreto!");
				i--;
			} else {
				numerosSorteados[i] = x;
			}
		}
		
		for (int i = 0; i < max; i++) {
			System.out.println("Digite o " + (i + 1) + "º número apostado:");
			int x = scanner.nextInt();
			if (x < 1 || x > 60) {
				System.out.println("Número incorreto!");
				i--;
			} else {
				apostas[i] = x;
			}
		}
		
		int qtdadeAcerto = 0;
		
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				
				if (numerosSorteados[i] == apostas[j]) {
					qtdadeAcerto++;
					break;
				}
			}
		}
		
		if (qtdadeAcerto == 6) {
			System.out.println("Parabéns!!! Você já pode se aposentar!");
		} else if (qtdadeAcerto == 5) {
			System.out.println("Você acertou 5 números! Vá até uma agência para retirar seu prêmio!");
		} else if (qtdadeAcerto == 4) {
			System.out.println("Você acertou 4 números! Vá até uma lotérica para retirar seu prêmio!");
		} else if (qtdadeAcerto > 0) {
			System.out.println("Você acertou apenas " + qtdadeAcerto + " número(s)! Tente outra vez!");
		} else {
			System.out.println("Não foi dessa vez :( Tente outra vez!");
		}
	}
	
}






