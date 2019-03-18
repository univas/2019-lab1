
public class Condicoes {

	public static void main(String[] args) {
		int age = 107;
		
		if (age < 18) {
			if (age > 15) {
				System.out.println("Você não é obrigado a"
						+ " votar mas já pode!");
			} else {
				System.out.println("Você ainda não pode votar!");
			}
		} else {
			if (age > 70) {
				System.out.println("Você pode votar, mas não"
						+ " é obrigado!");
				
			} else {
				System.out.println("Você tem que votar!");
			}
		}
 	}
	
}
