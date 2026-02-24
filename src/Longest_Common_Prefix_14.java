public class Longest_Common_Prefix_14 {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];     // take first string
        String result = "";         // this will store answer

        for (int i = 0; i < first.length(); i++) {

            char current = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                // if index exceeds OR chars don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != current) {
                    return result;
                }
            }

            result = result + current;  // add char if all matched
        }
        return result;
    }
    public static void main(String[] args) {
        Longest_Common_Prefix_14 obj = new Longest_Common_Prefix_14();
        String[] strs = {"flower","flow","flight"};
        System.out.println(obj.longestCommonPrefix(strs));
    }

}

//easy

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.