package projectEuler;

public class Problem6 {

	static int diffOfSums(int n) {
		return (int) Math.pow(n*(n+1)/2,2)-n*(n+1)*(2*n+1)/6;
	}

	public static void main(String[] args) {
		System.out.println(diffOfSums(100));
	}

}
