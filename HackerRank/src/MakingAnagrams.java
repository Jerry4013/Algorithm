import java.util.Scanner;
public class MakingAnagrams {

	public static void deleteOneLetter(char[] word, int index){
		char[] newWord = new char[word.length-1];
		for(int i=0; i<newWord.length; i++){
			if(i<index)
				newWord[i] = word[i];
			else if(i>=index){
				newWord[i] = word[i+1];
			}
		}
		word = newWord;
	}

	public static int numberNeeded(String first, String second) {
		int number=0;
		char[] firstChar = new char[first.length()];
		for(int i=0; i<firstChar.length;i++){
			firstChar[i] = first.charAt(i);
		}

		char[] secondChar = new char[second.length()];
		for(int i=0; i<secondChar.length;i++){
			secondChar[i] = second.charAt(i);
		}

		for(int i=0; i<firstChar.length;i++){
			int counter1=0;
			for(int j=0; j<firstChar.length; j++){
				if(firstChar[i]==firstChar[j]){
					counter1++;
				}
			}
			int counter2=0;
			for(int j=0; j<secondChar.length; j++){
				if(firstChar[i]==secondChar[j]){
					counter2++;
				}
			}
			int deletedNumber=0;
			if(counter1<counter2){
				for(int j=0; j<secondChar.length; j++){
					if(deletedNumber<counter2-counter1 && firstChar[i]==secondChar[j]){
						char[] newWord = new char[secondChar.length-1];
						for(int k=0; k<newWord.length; k++){
							if(k<j)
								newWord[k] = secondChar[k];
							else if(k>=j){
								newWord[k] = secondChar[k+1];
							}
						}
						secondChar = newWord;
						deletedNumber++;
					}
				}
				number += deletedNumber;
			}
			
			if(counter1>counter2){
				for(int j=firstChar.length-1; j>=0; j--){
					if(deletedNumber<counter1-counter2 && firstChar[i]==firstChar[j]){
						char[] newWord = new char[firstChar.length-1];
						for(int k=0; k<newWord.length; k++){
							if(k<j)
								newWord[k] = firstChar[k];
							else if(k>=j){
								newWord[k] = firstChar[k+1];
							}
						}
						firstChar = newWord;
						deletedNumber++;
					}
				}
				number += deletedNumber;
			}
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
