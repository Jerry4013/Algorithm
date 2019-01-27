
public class Day3SpiralMemory {

	public static void main(String[] args) {
		
		int n = 265149,sum=1;
		int circle =0;
		while(sum<n)
		{
			circle++;
			sum += 8*circle;
		}
		int n1 = (n-(sum-8*circle)) % (2*circle);
		int step = Math.abs(n1-circle);
		step = step + circle;
		System.out.println(step);
		
		
	}

}
