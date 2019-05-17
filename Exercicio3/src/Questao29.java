import java.util.Scanner;

public class Questao29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", 
				"Abril", "Maio", "Junho", 
				"Julho", "Agosto", "Setembro", "Outubro", 
				"Novembro", "Dezembro"};
		
		
		int[] mediaTemperaturaMensal = new int[12];
		float mediaAnual = 0.0f;
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite a média de " + meses[i] + ":");
			int media = scanner.nextInt();
			mediaTemperaturaMensal[i] = media;
			mediaAnual = mediaAnual + media;
		}
		
		mediaAnual = mediaAnual / 12;		
		System.out.println("A média anual é: " + mediaAnual);
		
		for (int i = 0; i < 12; i++) {
			if (mediaTemperaturaMensal[i] > mediaAnual) {
				System.out.println("Mês " + meses[i] + " - " 
						+ mediaTemperaturaMensal[i]);
			}
		}
		
	}
	
}
