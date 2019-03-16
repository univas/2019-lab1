
public class Conditional {

	public static void main(String[] arg) {
		int price = 103;
		
		if (price >= 1 && price <= 5) {
			System.out.println("Está muito barato!");
		} 
		else if (price >= 6 && price <= 20) {
			System.out.println("Preço normal!");
		} 
		else  {
			System.out.println("Está muito caro!");
		}
		
		
		int a = 21;
		int b = 19;
		int c = 19;
		
		if (a <= b && a <= c) {
			System.out.println("A é a menor: " + a);
		
		} else if (b <= a && b <= c) {
			System.out.println("B é a menor: " + b);
		
		} else {
			System.out.print("C é a menor: " + c);
		}
		
		
		
		
		int age = 17;
		//comentario de linha!
		if (age == 16 || age == 17) {
			System.out.println("Você já pode votar!");
		}
		
		/*
		 comentario de "N" linhas!
		 */
		
		if (a >= b && b >= c) {
			System.out.println(a + " " + b + " " + c);
		} else if (b >= a && a >= c) {
			System.out.println(b + " " + a + " " + c);
		} else if (c >= a && a >= b) {
			System.out.println(c + " " + a + " " + b);
		} else if (a >= c && c >= b) {
			System.out.println(a + " " + c + " " + b);
		} else if (b >= c && c >= a) {
			System.out.println(b + " " + c + " " + a);
		} else if (c >= b && b >= a) {
			System.out.println(c + " " + b + " " + a);
		}
		
		
	}
	
}
