package leetcode;

public class TwoSum2 {

	static int[] result = new int[2];

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					result[0] = i+1;
					result[1] = j+1;
					return result;
				}

			}

		}
		return result;

	}

	public static void main(String[] args) {

		int[] intArray = { 2, 7, 11, 15};

		twoSum(intArray, 9);
	}

}
