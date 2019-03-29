
public class Questao2 {

	public static void main(String[] args) {
		float x = 10;
		float y = 20;
		
		if (x > 0 && y > 0) {
			System.out.println("Quadrant I");
		} else if (x < 0 && y > 0) {
			System.out.println("Quadrant II");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrant III");
		} else if (x > 0 && y < 0) {
			System.out.println("Quandrant IV");
		} else {
			System.out.println("Origin");
		}
		
		/*
		if (x > 0) {
			if (y > 0) {
				System.out.println("Quandrant I");
			} else {
				System.out.println("Quandrant IV");
			}
		} else if (x < 0) {
			if (y > 0) {
				System.out.println("Quandrant II");
			} else {
				System.out.println("Quandrant III");
			}
		} else {
			System.out.println("Origin");
		}*/
	}
	
}
