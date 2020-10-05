Given an array of integers nums and an integer target, return indices of the two numbers such that
they add up to target. You may assume that each input would have exactly one solution, and you may
not use the same element twice.

You can return the answer in any order.


- Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

- Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9


Implementation:

I declare and defined my return type: an array of ints with 2 elements: int[2]
My method takes two arguments. The int[] array, and the `target` int.
The first for loop iterates over the array.
A second `for loop` starts off at the next item (i+1)
An `if statement` check to see if adding i + (i+1) will yield `target` 
if so, it will assign the current value of the first loop to result[0] and the value of the second loop to result[1] and return it.

Since this is utilizing a nested loop, the runtime of this algorithm is O(n<sup>2</sup>)
The performance is directly proportional to the <i>square</i> of the size of the input data set.





             