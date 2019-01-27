package Fall2018.week2;

public class ReverseVowels {

    public static void main(String[] args) {
        new ReverseVowels().run();
    }

    private void run() {
        System.out.println(reverseVowels("a.b,."));
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j){
            if (!isVowel(arr[i])){
                i++;
            }
            if (!isVowel(arr[j])){
                j--;
            }
            if (isVowel(arr[i]) && isVowel(arr[j])){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char a){
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'||
                a == 'A' || a == 'E' || a =='I' || a == 'O' || a == 'U';
    }

    private void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
