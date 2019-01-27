
public class Solution {

	static long countSum(int[] numbers) {
		long sum = 0;
		for(int i=0; i<numbers.length; i++){
			for(long j=1; j<=numbers[i];j++){
				if(numbers[i]%j==0&&j%2==1)
					sum += j;
			}
		}
		return sum;
	}

}

