
public class HelloWorld {

	public static void main(String[] args) {
		
		int price = 10;
		
		int money = 80;
		
		if (money >= price) {
			System.out.println("Você pode comprar!");
		}
		else {
			System.out.println("Você não pode comprar!");
		}
		//if (money < price) {
			//System.out.println("Você não pode comprar!");
		//}
		
		
		int nota = 60;
		
		if (nota >= 60) {
			System.out.println("Você passou :)");
		} else {
			System.out.println("Recuperação :(");
		}
		
		int a = 30;
		int b = 45;
		
		if (a > b) {
			System.out.println("O maior é: " + a);
		} else {
			System.out.println("O maior é: " + b);
		}
	}
	
}
