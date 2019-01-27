import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Day2CorruptionChecksum {

	public static void main(String[] args) {
		Scanner fileIn = null;
		try
		{
			fileIn = new Scanner(new FileInputStream("G:\\workspace\\AdventOfCode\\src\\Day2.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found!");
			System.exit(0);
		}
		int[][] value = new int[16][16];
		int difference=0;
		for(int i=0; i<16; i++)
			for (int j=0; j<16; j++)
				value[i][j]=fileIn.nextInt();
		for(int i=0; i<16; i++)
		{
			int min=10000, max = 0;
			for (int j=0; j<16; j++)
			{
				if (min>value[i][j])
					min = value[i][j];
				if (max<value[i][j])
					max = value[i][j];
			}
			difference += max-min;
		}
		System.out.println(difference);
		
		int division = 0;
		for(int i=0; i<16; i++)
		{
			for (int j=0; j<16; j++)
			{
				for (int k=0; k<16; k++)
					if (value[i][j]%value[i][k]==0 && value[i][j]/value[i][k]>1)
						division += value[i][j]/value[i][k];
			}
			
		}
		System.out.println(division);
				
	}

}
