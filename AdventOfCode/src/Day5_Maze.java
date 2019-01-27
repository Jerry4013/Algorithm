import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day5_Maze {

	public static void main(String[] args) {
		Scanner fileIn = null;
		int counter = 0, steps = 0;
		try {
			fileIn = new Scanner(new FileInputStream("G:\\workspace\\AdventOfCode\\src\\Day5.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}

		while (fileIn.hasNextLine()) {
			fileIn.nextLine();
			counter++;
		}

		try {
			fileIn = new Scanner(new FileInputStream("G:\\workspace\\AdventOfCode\\src\\Day5.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}
		int[] number = new int[counter];
		for (int i = 0; i < counter; i++) {
			number[i] = fileIn.nextInt();
		}

		int pointer = 0;
		while (pointer < counter) {
			if (number[pointer] >= 3) {
				number[pointer]--;
				pointer = pointer + number[pointer] + 1;
			}

			else {
				number[pointer]++;
				pointer = pointer + number[pointer] - 1;
			}
			steps++;
		}
		System.out.println(steps);
	}

}
