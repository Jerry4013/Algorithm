import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Day1InverseCaptcha {

	public static void main(String[] args) {

		int sum=0,sum2=0;
		Scanner fileIn = null;
		try
		{
			fileIn = new Scanner(new FileInputStream("G:\\workspace\\AdventOfCode\\src\\Day1.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found!");
			System.exit(0);
		}
		String digits = fileIn.next();
		
		for(int i=0; i<digits.length()-1; i++)
			if(digits.charAt(i)==digits.charAt(i+1))
				sum += Integer.parseInt(digits.substring(i, i+1));
		if (digits.charAt(0)==digits.charAt(digits.length()-1))
			sum += Integer.parseInt(digits.substring(digits.length()-1));
		System.out.println(sum);
		
		fileIn = null;
		try
		{
			fileIn = new Scanner(new FileInputStream("G:\\workspace\\AdventOfCode\\src\\Day1Part2.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found!");
			System.exit(0);
		}
		String digits2 = fileIn.next();
		
		for(int i=0; i<digits2.length()/2; i++)
			if(digits2.charAt(i)==digits2.charAt(i+digits2.length()/2))
				sum2 += 2 * Integer.parseInt(digits2.substring(i, i+1));
		
		System.out.println(sum2);
		
	}

}
