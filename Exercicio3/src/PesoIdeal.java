
public class PesoIdeal {

	public static void main(String[] args) {
		int genero = 0;
		float altura = 1.7f;
		float peso = 0;
		
		if (genero == 0) {
			peso = 62.1f * altura - 44.7f;
			
		} else {
			peso = 72.7f * altura - 58;
		}
		
		System.out.println("Peso ideal: " + peso);
	}
	
}
