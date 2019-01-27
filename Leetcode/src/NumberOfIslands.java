package AlgorithmTime;

import java.util.Arrays;

public class NumberOfIslands {

	public static void main(String[] args) {
		char[][] grid = {{'0','*','1','1','0'}, {'1','1','1','1','0'},
				{'1','1','1','1','0'},{'1','1','1','1','0'},{'1','1','1','1','0'}};
		grid = change(grid);
		System.out.println(Arrays.deepToString(grid));
		
	}

	public static int numIslands(char[][] grid) {
		int[] firstIndex = {0, 0};
		int counter = 0;
		
		while(!(firstIndex[0]==-1 && firstIndex[1]==-1)){
			firstIndex = firstOne(grid);
			if(firstIndex[0]!=-1) {
				grid[firstIndex[0]][firstIndex[1]] = '*';
				grid = change(grid);
				counter++;
				firstIndex = firstOne(grid);
			}
		}
		return counter;
	}
	
	public static int[] firstOne(char[][] grid) {
		int[] firstIndex = {-1, -1};
		
		out: 
		for(int i=0; i<grid.length; i++) {
			for (int j=0; j<grid[0].length; j++) {
				if (grid[i][j]=='1'){
					firstIndex[0] = i;
					firstIndex[1] = j;
					break out;
				}
			}
		}
		return firstIndex;		
	}
	
	public static char[][] change(char[][] grid) {
		
		char[][] bigerGrid = new char[grid.length+2][grid[0].length+2];
		for(int i=1; i<bigerGrid.length-1; i++)
			for (int j=1; j<bigerGrid[0].length-1; j++)
				bigerGrid[i][j] = grid[i-1][j-1];
		
		boolean hasMore = true;
		while(hasMore) {
			hasMore = false;
			for(int i=0; i<bigerGrid.length; i++)
				for (int j=0; j<bigerGrid[0].length; j++)
					if(bigerGrid[i][j]=='1' && (bigerGrid[i-1][j]=='*'||bigerGrid[i+1][j]=='*' 
						|| bigerGrid[i][j-1]=='*'|| bigerGrid[i][j+1]=='*')) {
						bigerGrid[i][j] = '*';
						hasMore = true;
					}
		}
		char[][] resultGrid = new char[grid.length][grid[0].length];
		for(int i=0; i<grid.length; i++)
			for (int j=0; j<grid[0].length; j++)
				resultGrid[i][j] = bigerGrid[i+1][j+1];
		return resultGrid;
	}
	
	
}
