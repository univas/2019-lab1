import java.util.Scanner;

public class Questao30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		System.out.println("Digite os numeros do 1� array:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um n�mero:");
			a[i] = scanner.nextInt();
		}
		
		System.out.println("Digite os numeros do 2� array:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um n�mero:");
			b[i] = scanner.nextInt();
		}
		
		System.out.println("Resultado de A X B:");
		
		for (int i = 0; i < 10; i++) {
			c[i] = a[i] * b[i];
			System.out.println(c[i]);
		}
	}
	
}
