package leetcode.TwoSum;

import java.util.Arrays;

public class Solution {

    static int[] result = new int[2];

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }

        }

        return result;

    }

    public static void main(String[] args) {

        int[] intArray = {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(intArray, 22)));
    }

}
