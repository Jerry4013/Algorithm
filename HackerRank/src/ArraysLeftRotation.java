import java.util.*;


public class ArraysLeftRotation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int temp;
		for(int a_k=0; a_k<k; a_k++){
			temp = a[0];
			for(int a_i=0; a_i<n-1; a_i++){
				a[a_i]=a[a_i+1];
			}
			a[n-1] = temp;
		}
		
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		in.close();
	}
}
