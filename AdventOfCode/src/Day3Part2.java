
public class Day3Part2 {

	public static void main(String[] args) {
		
		int circle = 10;
		int segment = 0;
		int[][] arr = new int[circle][circle*8];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=4;
		arr[0][3]=5;
		arr[0][4]=10;
		arr[0][5]=11;
		arr[0][6]=23;
		arr[0][7]=25;

		for(int i=1; i<circle; i++)
		{
			for(int j=0; j<(i+1)*8; j++)
			{
				if((j+1)%((i+1)*2)==0)
					segment = (j+1)/((i+1)*2);
				else
					segment = (j+1)/((i+1)*2)+1;
				
				if(j==0)
					arr[i][j] = arr[i-1][0] + arr[i-1][i*8-1];
				else if(j==1)
					arr[i][j] = arr[i][j-1] + arr[i-1][0] + arr[i-1][i*8-1] + arr[i-1][1];
				else if(j==(i+1)*8-2)
					arr[i][j] = arr[i][j-1] + arr[i][0] + arr[i-1][i*8-1] + arr[i-1][i*8-2];
				else if (j==(i+1)*8-1)
					arr[i][j] = arr[i][j-1] + arr[i][0] + arr[i-1][i*8-1];
				else if ((j+1)%((i+1)*2)==0)
					arr[i][j]=arr[i][j-1]+arr[i-1][j-segment*2];
				else if ((j+1)%((i+1)*2)==1)
					arr[i][j]=arr[i][j-1]+arr[i][j-2]+arr[i-1][j+1-segment*2] + arr[i-1][j+2-segment*2];
				else if ((j+1)%((i+1)*2)==(i+1)*2-1)
					arr[i][j]=arr[i][j-1] + arr[i-1][j+1-segment*2] + arr[i-1][j-segment*2];
				else 
					arr[i][j] = arr[i][j-1] + arr[i-1][j+1-segment*2] + arr[i-1][j-segment*2]+ arr[i-1][j+2-segment*2];
			}
		}
		System.out.println(arr[3][8]);
		
	}

}
