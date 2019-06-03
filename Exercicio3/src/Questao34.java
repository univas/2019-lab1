import java.util.Scanner;

public class Questao34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 30;
		int[] notasA = new int[max];
		int[] notasB = new int[max];
		int mediaA = 0;
		int mediaB = 0;
		
		System.out.println("Digite as notas da Turma A:");
		for (int i = 0; i < max; i++) {
			int x = scanner.nextInt();
			notasA[i] = x;
			mediaA = mediaA + x;
		}
		
		System.out.println("Digite as notas da Turma B:");
		for (int i = 0; i < max; i++) {
			int x = scanner.nextInt();
			notasB[i] = x;
			mediaB = mediaB + x;
		}
		
		mediaA = mediaA / max;
		mediaB = mediaB / max;
		System.out.println("A média da sala A foi: " + mediaA);
		System.out.println("A média da sala B foi: " + mediaB);
	}
}
