import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome da 1ª pessoa:");
		String nome1 = scanner.nextLine();
		
		System.out.println("Digite o ano de nascimento da 1ª pessoa:");
		int ano1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o nome da 2ª pessoa:");
		String nome2 = scanner.nextLine();
		
		System.out.println("Digite o ano de nascimento da 2ª pessoa:");
		int ano2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o nome da 3ª pessoa:");
		String nome3 = scanner.nextLine();
		
		System.out.println("Digite o ano de nascimento da 3ª pessoa:");
		int ano3 = scanner.nextInt();
		scanner.nextLine();
		
		int idade = 0;
		String nome = "";
		
		if (ano1 < ano2 && ano1 < ano3) {
			idade = 2019 - ano1;
			nome = nome1;
		} else if (ano2 < ano1 && ano2 < ano3) {
			idade = 2019 - ano2;
			nome = nome2;
			
		} else if (ano3 < ano1 && ano3 < ano2) {
			idade = 2019 - ano3;
			nome = nome3;
		}
		
		System.out.println("O mais velho é: " + nome + " e tem " + idade + " anos");
	}
	
}
