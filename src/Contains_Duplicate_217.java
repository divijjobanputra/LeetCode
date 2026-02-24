import java.util.HashMap;

public class Contains_Duplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        // if(nums.length<=1){
        //     return false;
        // }
        // else{
        //     //with using Arrays.sort() //best case O(n) or worst case O(n log n)
        //     Arrays.sort(nums);
        //     for(int i=0;i<nums.length-1;i++){
        //         if(nums[i]==nums[i+1]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //using HashMap O(n)
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int n : nums) {
            if (seen.containsKey(n)) {
                return true;
            } else {
                seen.put(n, 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Contains_Duplicate_217 obj = new Contains_Duplicate_217();
        int[] nums = {1, 2, 3, 1};
        System.out.println(obj.containsDuplicate(nums));
    }
}

//easy

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Example 1:
//
//Input: nums = [1,2,3,1]
//
//Output: true
//
//Explanation:
//
//The element 1 occurs at the indices 0 and 3.
//
//Example 2:
//
//Input: nums = [1,2,3,4]
//
//Output: false
//
//Explanation:
//
//All elements are distinct.
//
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//
//Output: true
//
