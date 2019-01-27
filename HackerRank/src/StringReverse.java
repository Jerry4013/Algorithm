import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] letters = A.toCharArray();
        int left=0, right = letters.length-1;
        while (left<right && letters[left]==letters[right]){
            left++;
            right--;
        }
        if(left<right)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
