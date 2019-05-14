import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 6;
		int[] numerosSorteados = new int[max];
		int[] apostas = new int[max];
		
		for (int i = 0; i < max; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero sorteado:");
			int x = scanner.nextInt();
			if (x < 1 || x > 60) {
				System.out.println("N�mero incorreto!");
				i--;
			} else {
				numerosSorteados[i] = x;
			}
		}
		
		for (int i = 0; i < max; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero apostado:");
			int x = scanner.nextInt();
			if (x < 1 || x > 60) {
				System.out.println("N�mero incorreto!");
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
			System.out.println("Parab�ns!!! Voc� j� pode se aposentar!");
		} else if (qtdadeAcerto == 5) {
			System.out.println("Voc� acertou 5 n�meros! V� at� uma ag�ncia para retirar seu pr�mio!");
		} else if (qtdadeAcerto == 4) {
			System.out.println("Voc� acertou 4 n�meros! V� at� uma lot�rica para retirar seu pr�mio!");
		} else if (qtdadeAcerto > 0) {
			System.out.println("Voc� acertou apenas " + qtdadeAcerto + " n�mero(s)! Tente outra vez!");
		} else {
			System.out.println("N�o foi dessa vez :( Tente outra vez!");
		}
	}
	
}






