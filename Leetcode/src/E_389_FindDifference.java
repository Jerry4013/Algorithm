public class E_389_FindDifference {
    public char findTheDifference(String s, String t){
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int[] freqs = new int[26];
        int[] freqt = new int[26];
        for (int i = 0; i < chars.length; i++) {
            freqs[chars[i]-97]++;
        }
        for (int i = 0; i < chart.length; i++) {
            freqt[chart[i]-97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (freqs[i] != freqt[i]){
                return (char) (i + 97);
            }
        }
        return 'F';
    }
}
