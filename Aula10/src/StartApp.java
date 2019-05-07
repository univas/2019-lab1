import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] notas = new int[25];
		
		for (int i = 0; i < 25; i++) {
			System.out.println("Digite a nota:");
			int nota = scanner.nextInt();
			scanner.nextLine();
			notas[i] = nota;
		}
		
		//System.out.println("6ª Nota digitada = " + notas[5]);
		System.out.println("Tamanho do Array " + notas.length);
		
		//notas = [2, 35, 77, 21, 99, 35, 1, 5, 98]
		int menor = notas[0];
		int index = 0;
		for (int j = 1; j < 25; j++) {
			System.out.println("Nota digitada: " + notas[j]);
			
			if (notas[j] < menor) {
				menor = notas[j];
				index = j;
			}
		}
		
		System.out.println("A menor foi: " + menor + 
				" na posição " + index);

	}
	
}
