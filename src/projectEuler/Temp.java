package projectEuler;

public class Temp {

	public static void main(String[] args) {
		long n = 600851475143L;
		long factor = 2, lastFactor = 1;
		while (n > 1) {
			if (n % factor == 0) {
				lastFactor = factor;
				//n = n / factor;
			}
			while (n % factor == 0) {
				n = n / factor;
			}
			factor = factor + 1;
		}
		System.out.println(lastFactor);
	}
}
