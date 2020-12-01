// Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

 

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = nums[0] + nums[nums.length - 1] + nums[nums.length - 2];
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int high = nums.length - 1;
                int low = i + 1;
                
                while(low < high) {
                    int cur = nums[low] + nums[high] + nums[i];
                    if(cur < target) low++;
                    else high--;
                    if(Math.abs(cur - target) < Math.abs(closestSum - target)) {
                        closestSum = cur;
                    }
                }
            }
        }
        return closestSum; 
    }
}