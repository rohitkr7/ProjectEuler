package projectEuler;

public class Problem4 {
	static boolean isPalindrome(int n) {
		int rev = 0, num = n;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (rev == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int max = 10001;
		for (int i = 999; i >= 100; i--) {
			if(max > i*999)
				break;

			for (int j = 999; j >= 100; j--) {
				int p = i * j;
				if (isPalindrome(p)) {
					if(max < p)
						max = p;
				}
			}
		}
		System.out.println(max);
	}

}
