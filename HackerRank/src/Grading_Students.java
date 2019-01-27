
import java.util.*;

public class Grading_Students {

	static int[] solve(int[] grades) {
		// Complete this function
		int[] result = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] >= 38) {
				int origin = grades[i];
				int counter = 0;
				while(grades[i]%5!=0){
					grades[i]++;
					counter++;
					if(counter>=3){
						result[i] = origin;
						break;
					}
					else
						result[i] = grades[i];	
				}
			}
			else
				result[i] = grades[i];	
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
		in.close();

	}
}
