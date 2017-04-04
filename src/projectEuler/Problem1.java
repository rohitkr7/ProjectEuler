package projectEuler;

public class Problem1 {
	int target = 999;
	int sumDivibleBy(int num){
		int n = target/num;
		int sum = num*n*(n+1)/2;
		return sum;
	}

	public static void main(String[] args) {
		int sum;
		Problem1 obj = new Problem1();
		sum = obj.sumDivibleBy(3) + obj.sumDivibleBy(5) - obj.sumDivibleBy(15);
		System.out.println("Sum divisible by 3 and 5 under 1000: "+sum);
	}

}
