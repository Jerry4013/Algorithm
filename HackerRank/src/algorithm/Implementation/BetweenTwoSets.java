package algorithm.Implementation;

public class BetweenTwoSets {

	static int getTotalX(int[] a, int[] b) {
        // Complete this function
		int maxOfA = 1, minOfB = 100;
		for (int i=0; i<a.length;i++) {
			if (a[i]>maxOfA)
				maxOfA = a[i];
		}
		for (int i=0; i<b.length; i++) {
			if (b[i]<minOfB)
				minOfB = b[i];
		}
		int counter = 0, temp = maxOfA;
		while(maxOfA<=minOfB) {
			boolean allDivide = true;
			for(int i=0; i<a.length; i++) 
				if(maxOfA % a[i]!=0) {
					allDivide = false;
					break;
				}
			for (int i=0; i<b.length; i++)
				if (b[i] % maxOfA !=0) {
					allDivide = false;
					break;
				}
			if(allDivide)
				counter++;
			maxOfA += temp;
		}
		return counter;
    }
	
	public static void main(String[] args) {
		
	}

}
