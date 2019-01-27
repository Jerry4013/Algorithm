package AlgorithmTime;

import java.util.Arrays;

public class ReshapeTheMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1, 2}, {3, 4}};
		int[][] newMatrix = matrixReshape(matrix, 1,4);
		System.out.println(Arrays.toString(newMatrix));
		
	}
	
	
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] newMatrix = new int[r][c];
		int[] temp = new int[r*c];
		if(check(nums, r, c)){
			int k=0;
			for(int i=0; i<nums.length; i++) {
				for (int j=0; j<nums[0].length; j++){
					temp[k] = nums[i][j];
					k++;
				}
			}
			for(k=0; k<r*c; k++) {
				for (int i=0; i<r; i++) {
					for(int j=0; j<c; j++) {
						newMatrix[i][j] = temp[k];
					}
				}
			}
		}
		else newMatrix = nums;
		return newMatrix;
	}

	public static boolean check(int[][] nums, int r, int c) {
		return nums.length * nums[0].length == r * c;
	}

}
