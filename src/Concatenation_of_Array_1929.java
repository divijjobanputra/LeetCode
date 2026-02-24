import java.util.Arrays;

public class Concatenation_of_Array_1929 {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[2*length];
        for(int i=0;i<length;i++){
            ans[i] = nums[i];
            ans[i+length] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        Concatenation_of_Array_1929 obj = new Concatenation_of_Array_1929();
        System.out.println(Arrays.toString(obj.getConcatenation(nums)));
    }
}

//easy

//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.
//
//
//
//Example 1:
//
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//- ans = [1,2,1,1,2,1]
//Example 2:
//
//Input: nums = [1,3,2,1]
//Output: [1,3,2,1,1,3,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
//- ans = [1,3,2,1,1,3,2,1]
