import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Day4Passphrases {

	public static void main(String[] args) {
		Scanner fileIn = null;
		int validCounter=0;
		try
		{
			fileIn = new Scanner(new FileInputStream("G:\\workspace\\AdventOfCode\\src\\Day4.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found!");
			System.exit(0);
		}

		while (fileIn.hasNextLine())
		{
			boolean valid = true;
			String passPhrases = fileIn.nextLine();
			StringTokenizer wordFactory = new StringTokenizer(passPhrases);
			int number = wordFactory.countTokens();
			String[] wordList = new String[number];
			for(int i=0; i<number; i++)
			{
				wordList[i] = wordFactory.nextToken();
			}
			for(int i=0; i<number-1; i++)
				for(int j=i+1; j<number;j++)
				{
					if(wordList[i].equals(wordList[j]))
						valid = false;
					if(sameChars(wordList[i],wordList[j]))
						valid = false;	
				}
			if(valid)
				validCounter++;
		}
		System.out.print(validCounter);

	}
	private static boolean sameChars(String firstStr, String secondStr) {
		  char[] first = firstStr.toCharArray();
		  char[] second = secondStr.toCharArray();
		  Arrays.sort(first);
		  Arrays.sort(second);
		  return Arrays.equals(first, second);
		}
}
