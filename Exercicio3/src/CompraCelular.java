
public class CompraCelular {

	public static void main(String[] args) {
		float categoria1 = 1000;
		float categoria2 = 1500;
		float categoria3 = 2000;
		
		float salario = 1250;
		
		float celularA = 899;
		float celularB = 799;
		float celularC = 1199;
		float celularD = 1683;
		float celularE = 1415;
		float celularF = 1937.99f;
		
		if (salario <= categoria1) {
			System.out.println("Você pode comprar um celular na faixa de " + categoria1);
			System.out.println("Os aparelhos disponíveis são: ");
			if (salario >= celularA) {
				System.out.println(celularA);
			}
			
			if (salario >= celularB) {
				System.out.println(celularB);
			}
			
		} else if (salario <= categoria2) {
			System.out.println("Você pode comprar um celular na faixa de " + categoria2);
			System.out.println("Os aparelhos disponíveis são: ");
			if (salario >= celularC) {
				System.out.println(celularC);
			}
			
			if (salario >= celularD) {
				System.out.println(celularD);
			}
			
		} else if (salario <= categoria3) {
			System.out.println("Você pode comprar um celular na faixa de " + categoria3);
			System.out.println("Os aparelhos disponíveis são: ");
			if (salario >= celularE) {
				System.out.println(celularE);
			}
			
			if (salario >= celularF) {
				System.out.println(celularF);
			}
		}
		
	}
	
}
