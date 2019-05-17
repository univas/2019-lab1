import java.util.Scanner;

public class Questao31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		System.out.println("Digite os numeros do 1º array:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número:");
			a[i] = scanner.nextInt();
		}
		
		System.out.println("Digite os numeros do 2º array:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número:");
			b[i] = scanner.nextInt();
		}
		
		System.out.println("Resultado de A X B:");
		
		for (int i = 0, j = 9; i < 10; i++, j--) {
			c[i] = a[i] * b[j];
			System.out.println(c[i]);
		}
		
	}
	
}
