import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		System.out.println("something");
		keyIn.close();
	}

	public int playlist(String[] songs, int k, String q) {
		int up = stepsUp(songs, k, q);
		int down = stepsDown(songs, k, q);
		if (up > down)
			return down;
		else
			return up;
	}

	public int stepsDown(String[] songs, int k, String q) {
		int steps = 0;
		while (!songs[k].equals(q)) {
			if (k == songs.length - 1) {
				k = 0;
				steps++;
			}

			else {
				k++;
				steps++;
			}

		}
		return steps;
	}

	public int stepsUp(String[] songs, int k, String q) {
		int steps = 0;
		while (!songs[k].equals(q)) {
			if (k == 0) {
				k = songs.length - 1;
				steps++;
			}

			else {
				k--;
				steps++;
			}

		}
		return steps;
	}

}
