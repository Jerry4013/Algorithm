import java.util.Scanner;
public class MakingAnagrams2 {

	public static int numberNeeded(String first, String second) {
		int number= 0;
		int[] frequency1 = new int[26];
		int[] frequency2 = new int[26];
		for(int i=0; i<first.length(); i++)
			frequency1[first.charAt(i)-97]++;
		for(int i=0; i<second.length(); i++)
			frequency2[second.charAt(i)-97]++;
		for(int i=0; i<26; i++){
			if(frequency1[i]!=frequency2[i])
				number += Math.abs(frequency1[i]-frequency2[i]);
		}
		return number;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
		in.close();
	}

}
