package A30daysOfCode;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		int T = keyIn.nextInt();
		
		for(int i=0; i<T; i++){
			String s = keyIn.next();
			String first = "", second = "";
			
			for (int j=0; j<s.length(); j++) {
				if (j%2==0)
					first += String.valueOf(s.charAt(j));
				else
					second += String.valueOf(s.charAt(j));
			}
			System.out.println(first + " " + second);
			
		}
		
		keyIn.close();
	}

}
