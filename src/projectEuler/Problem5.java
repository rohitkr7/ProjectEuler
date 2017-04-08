package projectEuler;

public class Problem5 {

	// Recursive Function for LCM
	/*
	 static int lcm = 1; 
	 static int findLcm(int a, int b){
	 
	 if(lcm%a == 0 && lcm%b == 0)
	 { 
	 	return lcm;
	 } 
	 	lcm++; 
	 	return findLcm(a,b); }
	 */

	
	// Iteration Function for LCM
	static int findLcm(int a, int b) {
		int minMultiple = a > b ? a : b;
		while (true) {
			if (minMultiple % a == 0 && minMultiple % b == 0) {
				return minMultiple;
			}
			minMultiple++;
		}

	}
	
	
	//Using Formula a *b =lcm *hcf
	/*static int findLcm(int m, int n){
		int r;
	    int x=m, y=n;
	    if(x>y){
	        x=x+y;
	        y=x-y;
	        x=x-y;
	    }
	    while(y%x!=0){
	        r=y%x;
	        y=x;
	        x=r;
	    }
	    return m*n/x;
	}*/
	
	static int findLCMupto(int n){
		int lcm = 1;
		for(int i=1; i<=n; i++){
			lcm = findLcm(lcm, i);
		}
		return lcm;
		
	}
	

	public static void main(String[] args) {
		System.out.println(findLCMupto(20));
	}

}
