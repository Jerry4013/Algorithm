import java.util.*;

public class MiniMaxSum {

	 static void miniMaxSum(int[] arr) {
	        // Complete this function
		 
	        long sum =0;
	        for(int i=0; i<arr.length; i++){
	            sum += arr[i]; 
	        }
	        long temp =0, max = 0, min = Long.MAX_VALUE;
	        for(int i=0; i<arr.length; i++){
	            temp = sum - (long)arr[i];
	            if (temp>max)
	                max = temp;
	            if (temp<min)
	                min = temp;
	        }
	        
	        System.out.println(min + " " + max);
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] arr = new int[5];
	        for(int arr_i = 0; arr_i < 5; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        miniMaxSum(arr);
	        in.close();
	    }

}
