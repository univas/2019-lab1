import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int a = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o segundo valor:");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();
		
		int c = (a + b) / 2;
		System.out.println("A média é: " + c);
		System.out.println(nome);
	}
	
}
