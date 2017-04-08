package projectEuler;

public class Problem7 {

	static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int primeCounter(int n){
		int count = 0;
		int i=2;
		while(count != n){
			if(isPrime(i)){
				count ++;
			}
			i++;
		}
		return i-1;
	}

	public static void main(String[] args) {
		System.out.println(primeCounter(10001));
	}

}
