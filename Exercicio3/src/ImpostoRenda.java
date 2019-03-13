
public class ImpostoRenda {
	
	public static void main(String[] args) {
		float salary = 4664.69f;
		
		if (salary < 1903.99f) {
			System.out.println("Você se enquadrou na faixa de Isento do IR");
		} else if (salary > 1903.98f && salary < 2826.67f) {
			System.out.println("Você se enquadrou na faixa de 7,5% do IR");
		} else if (salary > 2826.66f && salary < 3751.06f) {
			System.out.println("Você se enquadrou na faixa de 15,0% do IR");
		} else if (salary > 3751.05f && salary < 4664.69f) {
			System.out.println("Você se enquadrou na faixa de 22,5% do IR");
		} else {
			System.out.println("Você se enquadrou na faixa de 27,5% do IR");
		}
	}
}
