
public class Questao1 {

	public static void main(String[] args) {
		float x1 = 2;
		float x2 = -4.3f;
		float y1 = 12;
		float y2 = -3.35f;
		
		float x = x2 - x1;
		x = x * x;
		
		float y = y2 - y1;
		y = y * y;
		
		float z = x + y;
		double result = Math.sqrt(z);
		System.out.println(result);
	}
	
}
