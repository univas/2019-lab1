
public class SomaPares {

	public static void main(String[] args) {
		int a = 12;
		int b = 15;
		int c = 6;
		int d = 11;
		int e = 16;
		
		int result = 0;
		if (a % 2 == 0) {
			result = result + a;
		}
		if (b % 2 == 0) {
			result = result + b;
		}
		if (c % 2 == 0) {
			result = result + c;
		}
		if (d % 2 == 0) {
			result = result + d;
		}
		if (e % 2 == 0) {
			result = result + e;
		}
		System.out.println(result);
	}
	
}
