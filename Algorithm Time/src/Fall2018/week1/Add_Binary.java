package Fall2018.week1;

import java.util.Arrays;
import java.util.HashMap;

public class Add_Binary {
    public static void main(String[] args) {
        new Add_Binary().run();
    }

    private void run() {
        System.out.println(addBinary("1101", "1010"));
    }

    public String addBinary(String a, String b) {
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        char[] newA;
        char[] newB;
        int length;
        if (a.length() < b.length()){
            length = b.length();
            newA = completeZeros(arrA, b.length() - a.length());
            newB = arrB;
        } else if (a.length() > b.length()){
            length = a.length();
            newB = completeZeros(arrB, a.length() - b.length());
            newA = arrA;
        } else {
            length = a.length();
            newA = arrA;
            newB = arrB;
        }
        char[] result = new char[length + 1];
        char carryOutValue = '0';
        HashMap<String, String> map = getMap();
        for (int i = length ; i > 0 ; i--) {
            char[] keys = {newA[i - 1], newB[i - 1], carryOutValue};
            String key = new String(keys);
            result[i] = map.get(key).charAt(0);
            carryOutValue = map.get(key).charAt(1);
        }
        if (carryOutValue == '1'){
            result[0] = '1';
        } else {
            result = Arrays.copyOfRange(result, 1, result.length);
        }
        return new String(result);
    }

    private char[] completeZeros(char[] arr, int dif){
        int length = dif + arr.length;
        char[] newArray = new char[length];
        for (int i = 0; i < length; i++) {
            if (i < dif){
                newArray[i] = '0';
            } else {
                newArray[i] = arr[i - dif];
            }
        }
        return newArray;
    }

    private HashMap<String, String> getMap(){
        HashMap<String, String> hashMap = new HashMap<>();
//      key: carryIn + char a + char b ;
//      value: result + carryOut;
        hashMap.put("000","00");
        hashMap.put("001","10");
        hashMap.put("010","10");
        hashMap.put("011","01");
        hashMap.put("100","10");
        hashMap.put("101","01");
        hashMap.put("110","01");
        hashMap.put("111","11");
        return hashMap;
    }
}
