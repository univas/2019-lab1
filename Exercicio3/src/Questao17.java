import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float coast = 1000f;
		float increment = 5 / 100f;
		int months = 7;
		
		for (int i = 0; i < months; i = i + 1) {
			coast = coast + (coast * increment);
		}
	
		System.out.println("O valor da mensalidade no último semestre é de: R$ " + coast);
	}
	
}
