package rookiRank;

import java.util.Scanner;

public class ExamRush {

	 static int examRush(int[] tm, int t) {
	        // Complete this function
	        int max = 0;
	        int sum = 0;
	        for(int i=0; i<tm.length-1; i++) {
	            for(int j=0; j<tm.length-1-i; j++)
	                if(tm[j]>tm[j+1]){
	                    int temp = tm[j];
	                    tm[j] = tm[j+1];
	                    tm[j+1] = temp;
	                }         
	        }
	        for(int i=0; i<tm.length; i++){
	            if(sum<t)
	            {
	                sum += tm[i];
	                if(sum<=t)
	                    max++;
	            }
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int t = in.nextInt();
	        int[] tm = new int[n];
	        for(int tm_i = 0; tm_i < n; tm_i++){
	            tm[tm_i] = in.nextInt();
	        }
	        int result = examRush(tm, t);
	        System.out.println(result);
	        in.close();
	    }

}
