import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int impar = 0;
		int par = 0;

		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um número: ");
			int x = scanner.nextInt();
			scanner.nextLine();
			
			if (x % 2 == 0) {
				par++; //par = par + 1;
			} else {
				impar++; //impar = impar + 1;
			}
		}
		
		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de ímpares: " + impar);
	}
	
}
