package AlgorithmTime;

public class PerfectSquares {


	public int numSquares(int n) {
		int temp = n, counter = 0, min = 0, sum = 0;
		for(int i=n; i>=1; i--){
			temp = i;
			while(sum!=n){
				while(!isSquare(temp)){
					temp--;
					i = temp;
				}
				counter++;
				sum += temp;
				temp = n - temp;		
			}
		}
		
		//should be deleted
		System.out.println(counter);
		
		return min;
	}


	public boolean isSquare(int n) {
		int sqrt = (int) Math.sqrt(n);
		if (sqrt * sqrt == n)
			return true;
		return false;
	}
	
	public int counter(int n){
		if(!isSquare(n)){
			n--;
			counter(n);
		}
		return 0;
		
	}
	
	

}
