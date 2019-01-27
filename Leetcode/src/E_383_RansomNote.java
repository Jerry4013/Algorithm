import java.util.HashMap;

public class E_383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char letter = magazine.charAt(i);
            if (!hashMap.containsKey(letter)){
                hashMap.put(letter, 1);
            } else {
                hashMap.put(letter, hashMap.get(letter) + 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i);
            if (!hashMap.containsKey(letter)){
                return false;
            }
            if (hashMap.get(letter) == 0){
                return false;
            }
            hashMap.put(letter, hashMap.get(letter) - 1);
        }
        return true;
    }
}
