package projectEuler;

public class Problem3 {

	public static void main(String args[]) {
		long n = 600851475143L;
		long lastFactor = 1;
		for (long i = 2; i < n; ++i) {
			lastFactor = i;
			while (n % i == 0) {
				n = n / i;
			}
		}
		System.out.println(lastFactor);
	}
}
