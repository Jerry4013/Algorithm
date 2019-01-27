package Fall2018.week1;

import java.util.Arrays;

public class Add_Binary_V1 {
    public String addBinary(String a, String b) {
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        char[] newA;
        char[] newB;
        int length = 0;
        if (a.length() < b.length()){
            length = b.length();
            int dif = length - a.length();
            newA = new char[length];
            for (int i = 0; i < length; i++) {
                if (i < dif){
                    newA[i] = '0';
                } else {
                    newA[i] = arrA[i - dif];
                }
            }
            newB = arrB;
        } else if (a.length() > b.length()){
            length = a.length();
            int dif = length - b.length();
            newB = new char[length];
            for (int i = 0; i < length; i++) {
                if (i < dif){
                    newB[i] = '0';
                } else {
                    newB[i] = arrB[i - dif];
                }
            }
            newA = arrA;
        } else {
            newA = arrA;
            newB = arrB;
            length = a.length();
        }
        char[] result = new char[length + 1];
        boolean carryOutValue = false;
        for (int i = length ; i > 0 ; i--) {
            DigitsCalculateResult resultCombination =
                    new DigitsCalculateResult(newA[i - 1], newB[i - 1], carryOutValue);
            result[i] = resultCombination.getResult();
            carryOutValue = resultCombination.isCarryout();
        }
        if (carryOutValue){
            result[0] = '1';
        } else {
            result = Arrays.copyOfRange(result, 1, result.length);
        }

        return new String(result);
    }

    private class DigitsCalculateResult{
        private char result;
        private boolean carryout;

        public DigitsCalculateResult(char a, char b, boolean carryout) {
            int temp = 0;
            if (carryout){
                temp = 1;
            }
            int numberResult = (char) (a + b - 96 + temp);
            if (numberResult == 0){
                result = '0';
                this.carryout = false;
            } else if (numberResult == 1){
                result = '1';
                this.carryout = false;
            } else if (numberResult == 2){
                result = '0';
                this.carryout = true;
            } else if (numberResult == 3){
                result = '1';
                this.carryout = true;
            }
        }

        public char getResult() {
            return result;
        }

        public boolean isCarryout() {
            return carryout;
        }
    }
}
