import java.util.Arrays;
import java.util.HashMap;

public class Valid_Anagram_242 {
    public boolean isAnagram(String s, String t) {

        //using sorting O(n log n)
//        if(s.length() == 0 && t.length() == 0){
//            return true;
//        } else if (s.length() != t.length()) {
//            return false;
//        } else{
//            char[] ch1 = s.toCharArray();
//            char[] ch2 = t.toCharArray();
//            Arrays.sort(ch1);
//            Arrays.sort(ch2);
//            for(int i=0;i<ch1.length;i++){
//                if(ch1[i]!=ch2[i])
//                    return false;
//            }
//        }
//        return true;

//        if(s.length() != t.length()){
//            return false;
//        }
//        else{
//            HashMap<Character, Integer> map = new HashMap<>();
//            //counting frequency of chars of String s and creating HashMap of it.
//            for(int i=0;i<s.length();i++){
//                char ch = s.charAt(i);
//                map.put(ch, map.getOrDefault(ch, 0) + 1);
//            }
//
//            //removing from t if key found and also its freq is not 0
//            for (int i = 0; i < t.length(); i++) {
//                char ch = t.charAt(i);
//                if (!map.containsKey(ch) || map.get(ch) == 0) {
//                    return false;
//                }
//                map.put(ch, map.get(ch) - 1);
//            }
//            return true;
//        }

        // Step 1: Length check (fastest rejection)
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Frequency counter for 26 lowercase letters
        int[] count = new int[26];

        // Step 3: Process both strings in one loop
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // add from s
            count[t.charAt(i) - 'a']--;  // subtract from t
        }

        // Step 4: Check if all counts are zero
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Valid_Anagram_242 obj = new Valid_Anagram_242();
        System.out.println(obj.isAnagram(s, t));
    }
}

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//
//Output: true
//
//Example 2:
//
//Input: s = "rat", t = "car"
//
//Output: false