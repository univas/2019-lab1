import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionário:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite a quantidade de horas trabalhadas:");
		float horasTrabalhadas = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Digite o que o funcionário recebe por hora:");
		float valorHora = scanner.nextFloat();
		scanner.nextLine();
		
		float totalReceber = valorHora * horasTrabalhadas;
		
		System.out.println("Sr(a) " + nome + " irá receber R$ " + totalReceber);
	}
	
}
