package ProjectEuler;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		
		int q = keyIn.nextInt();
		int[] m1 = new int[q];
		
		for(int i=0; i<q; i++){
			int m = 2;
			long a = keyIn.nextLong();
			long b = keyIn.nextLong();
			while(P(m)>(double)a/b){
				m++;
			}
			m1[i] = m;
		}
		for(int i=0; i<q; i++) {
			System.out.println(m1[i]);
		}
		
		keyIn.close();
	}
	
	public static double P(int m){
		double p = 0;
		int numerator = 0;
		int denomenator = 0;
		for(int k=1; k<=m; k++){
			if(isSquares(1+4*k)){
				denomenator++;
				if(Math.log((1+Math.sqrt(1+4*k))/2)/Math.log(2)-Math.floor(Math.log((1+Math.sqrt(1+4*k))/2)/Math.log(2))==0)
					numerator++;	
			}
				
		}
		
		p = (double)numerator/denomenator;
		return p;
	}
	
	public static boolean isSquares(int value) {
        if (value < 0) {
            return false;
        }
        double sqrtValue = Math.sqrt(value * 1.0);
        int sqrtSimiValue = (int) sqrtValue;
        if ((sqrtSimiValue * sqrtSimiValue) == value) {
            return true;
        } else {
            return false;
        }
    }

}
