package algorithm.Implementation;

import java.util.*;


public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int ap=0, op=0;
        int appleNumber = 0;
        int orangeNumber = 0;
        for(int i=0; i<apples.length; i++) {
            ap = a + apples[i];
            if(ap>=s && ap<=t)
                appleNumber++;
        }
         for(int i=0; i<oranges.length; i++) {
            op = b + oranges[i];
            if(op>=s && op<=t)
                orangeNumber++;
        }
        
        System.out.println(appleNumber);
        System.out.println(orangeNumber);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
