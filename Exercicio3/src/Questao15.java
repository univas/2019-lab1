import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso da pessoa:");
		float peso = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Digite a altura da pessoa:");
		float altura = scanner.nextFloat();
		scanner.nextLine();
		
		float imc = peso / (altura * altura);
		
		if (imc < 18.5f) {
			System.out.println("IMC = " + imc + " - Abaixo do peso");
			
		} else if (imc <= 24.9f) {
			System.out.println("IMC = " + imc + " - Peso normal");
			
		} else if (imc <= 29.9f) {
			System.out.println("IMC = " + imc + " - Sobrepeso");
			
		} else if (imc <= 34.9f) {
			System.out.println("IMC = " + imc + " - Obesidade grau 1");
			
		} else if (imc <= 39.9f) {
			System.out.println("IMC = " + imc + " - Obesidade grau 2");
			
		} else {
			System.out.println("IMC = " + imc + " - Obesidade grau 3");
		}
	}
	
}
