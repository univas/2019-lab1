
public class ExercicesApp {

	public static void main(String[] args) {
		float price = 29.99f;
		
		float priceA = price - (price * 10 / 100);
		
		float priceB = price / 5;
		
		System.out.println("Valor a vista: R$ " + priceA);
		
		System.out.println("Valor de cada parcela: R$ " + priceB);
	}
	
}
