
public class Average {
	
	public static void main(String[] args) {
		int noteA = 10;
		int noteB = 25;
		int noteC = 20;
		int noteD = 12;
		
		int average = (noteA + noteB + noteC + noteD) / 4;
		
		if (average >= 60) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Você irá repetir de ano!");
		}
	}
}
