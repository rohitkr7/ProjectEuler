package projectEuler;

public class Problem2 {
	
	int febo(int n){
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else
			return febo(n-1)+febo(n-2);
	}
	void evenValuedFeboSum(){
		int sum = 0;
		int i=1;
		int temp;
		Problem2 obj = new Problem2();
		while(true){
			temp = obj.febo(i);
			if(temp > 4000000)
				break;
			if(temp%2==0)
				sum += temp;
			i++;
		}
		System.out.println("Sum of even fibo numbers: "+ sum);
	}
	public static void main(String[] args) {
		new Problem2().evenValuedFeboSum();
	}
}
