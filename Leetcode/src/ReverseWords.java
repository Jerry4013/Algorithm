package AlgorithmTime;
import java.util.StringTokenizer;

public class ReverseWords {
	public String reverseWords(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String result = "";
		if(s.length()>=1){
		while(st.hasMoreTokens()){
			result += interchange(st.nextToken().toCharArray()) + " ";
		}
		result = result.substring(0, result.length()-1);
		}
		
		return result;
	}
	
	public String interchange(char[] words){
		char temp;
		for(int i=0; i<words.length/2; i++){
			temp = words[i];
			words[i] = words[words.length-1-i];
			words[words.length-1-i] = temp;
		}
		return new String(words);
	}
}
